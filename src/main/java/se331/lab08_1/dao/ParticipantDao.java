package se331.lab08_1.dao;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import se331.lab08_1.entity.Participant;


public interface ParticipantDao {
    Page<Participant> getParticipant(Pageable pageRequest);


}
