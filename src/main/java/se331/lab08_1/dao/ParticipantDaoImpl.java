package se331.lab08_1.dao;

import lombok.RequiredArgsConstructor;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Repository;
import se331.lab08_1.entity.Organizer;
import se331.lab08_1.entity.Participant;
import se331.lab08_1.repository.OrganizerRepository;
import se331.lab08_1.repository.ParticipantRepository;

import java.util.Optional;

@Repository
@RequiredArgsConstructor
public class ParticipantDaoImpl implements ParticipantDao{
    final ParticipantRepository participantRepository;
    @Override
    public Page<Participant> getParticipant(Pageable pageRequest){
        return participantRepository.findAll(pageRequest);
    }

}
