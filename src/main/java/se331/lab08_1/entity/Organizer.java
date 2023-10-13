package se331.lab08_1.entity;


import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import lombok.*;

import java.util.ArrayList;
import java.util.List;

@Data
@Builder
@Entity
@NoArgsConstructor
@AllArgsConstructor
public class Organizer {
    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    @EqualsAndHashCode.Exclude
    Long id;
    String name;
    @JsonIgnore
    @OneToMany(mappedBy = "organizer")
    @Builder.Default
    List<Event> ownEvents = new ArrayList<>();
    @ElementCollection
    List<String> images;
}