package se331.lab08_1.service;

import lombok.RequiredArgsConstructor;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;
import se331.lab08_1.dao.OrganizerDao;
import se331.lab08_1.entity.Organizer;

import java.util.List;

@Service
@RequiredArgsConstructor
public class OrganizerServiceImpl implements OrganizerService{
    final OrganizerDao organizerDao;
    @Override
    public Integer getOrganizerSize(){
        return organizerDao.getEventSize();
    }

    @Override
    public Page<Organizer> getOrganizers(Integer pageSize, Integer page){
        return organizerDao.getEvents(pageSize, page);
    }

    @Override
    public Organizer getOrganizer(Long id){
        return organizerDao.getEvent(id);
    }

    @Override
    public Organizer save(Organizer organizer){
        return organizerDao.save(organizer);
    }
}
