package se331.lab08_1.entity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class ParticipantEventDTO {
    Long id;
    String name;
    List<OnlyEventDTO> events;
}
