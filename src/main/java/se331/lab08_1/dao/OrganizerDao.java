package se331.lab08_1.dao;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import se331.lab08_1.entity.Organizer;
import java.util.Optional;

public interface OrganizerDao {
    Optional<Organizer> findById(Long id);
    Integer getEventSize();
    Page<Organizer> getEvents(Integer pageSize, Integer page);
    Organizer getEvent(Long id);
    Organizer save(Organizer organizer);

}
