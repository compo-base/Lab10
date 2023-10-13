package se331.lab08_1.entity;

import jakarta.persistence.ElementCollection;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.ArrayList;
import java.util.List;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class OrganizerDTO {
    Long id;
    String name;
    String image;
    List<OrganizerOwnEventsDTO> ownEvents = new ArrayList<>();
    List<String> images;
}
