package se331.lab08_1.dao;

import lombok.RequiredArgsConstructor;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Repository;
import se331.lab08_1.entity.Organizer;
import se331.lab08_1.repository.OrganizerRepository;

import java.util.Optional;

@Repository
@RequiredArgsConstructor
public class OrganizerDaoImpl implements OrganizerDao{
    final OrganizerRepository organizerRepository;
    @Override
    public Optional<Organizer> findById(Long id){
        return organizerRepository.findById(id);
    }
    @Override
    public Integer getEventSize(){
        return Math.toIntExact(organizerRepository.count());
    }

    @Override
    public Page<Organizer> getEvents(Integer pageSize,Integer page){
        // Determine the total number of events in the database.
        long totalEvents = organizerRepository.count();

        // If pageSize is null, set it to the total number of events.
        pageSize = pageSize == null ? (int) totalEvents : pageSize;

        // If page is null, default to fetching the first page.
        page = page == null ? 0 : page - 1; // Convert to 0-based for Spring's PageRequest.
        return organizerRepository.findAll(PageRequest.of(page, pageSize));
    }

    @Override
    public Organizer getEvent(Long id){
        return organizerRepository.findById(id).orElse(null);
    }

    @Override
    public Organizer save(Organizer organizer){
        return organizerRepository.save(organizer);
    }
}
