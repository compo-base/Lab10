package se331.lab08_1.util;


import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.factory.Mappers;
import se331.lab08_1.entity.*;

import java.util.List;

@Mapper
public interface LabMapper {
    LabMapper INSTANCE = Mappers.getMapper(LabMapper.class);
    OrganizerDTO getOrganizerDTO(Organizer organizer);
    List<OrganizerDTO> getOrganizerDTO(List<Organizer> organizer);
    @Mapping(source = "images", target = "images")
    @Mapping(source = "participant", target = "participants")
    EventDTO getEventDto(Event event);
    List<EventDTO> getEventDto(List<Event> events);
    ParticipantDTO getParticipantDto(Participant participant);
    //mapping a list of participants
    List<ParticipantEventDTO> getParticipantEventDTO(List<Participant> participants);
    @Mapping(source = "eventHistory", target = "events")
    ParticipantEventDTO toParticipantEventDTO(Participant participant);

}

