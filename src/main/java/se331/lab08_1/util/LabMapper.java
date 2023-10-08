package se331.lab08_1.util;


import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.factory.Mappers;
import se331.lab08_1.entity.*;

import java.util.List;

@Mapper
public interface LabMapper {
    LabMapper INSTANCE = Mappers.getMapper(LabMapper.class);

    EventDTO getEventDto(Event event);
    List<EventDTO> getEventDto(List<Event> events);
    OrganizerDTO getOrganizerDTO(Organizer organizer);
    List<OrganizerDTO> getOrganizerDTO(List<Organizer> organizer);
    ParticipantDTO getParticipantDto(Participant participant);
}

