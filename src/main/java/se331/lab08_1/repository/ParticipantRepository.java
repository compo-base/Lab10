package se331.lab08_1.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import se331.lab08_1.entity.Organizer;
import se331.lab08_1.entity.Participant;

public interface ParticipantRepository extends JpaRepository<Participant,Long> {
}
