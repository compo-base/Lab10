package se331.lab08_1.entity;


import com.fasterxml.jackson.annotation.JsonManagedReference;
import jakarta.persistence.*;
import lombok.*;

import java.util.ArrayList;
import java.util.List;

@Data
@Builder
@Entity
@NoArgsConstructor
@AllArgsConstructor
public class Event {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @EqualsAndHashCode.Exclude
    Long id;
    String category;
    String title;
    String description;
    String location;
    String date;
    String time;
    Boolean petAllowed;
    @JsonManagedReference
    @ManyToOne
    Organizer organizer;
    @ManyToMany(mappedBy = "eventHistory", cascade = CascadeType.PERSIST)
    @Builder.Default
    List<Participant> participant = new ArrayList<>();
    @ElementCollection
    List<String> images;
}
