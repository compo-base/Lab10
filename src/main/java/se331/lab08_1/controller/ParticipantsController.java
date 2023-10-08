package se331.lab08_1.controller;

import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import se331.lab08_1.service.ParticipantService;
import se331.lab08_1.util.LabMapper;
@RestController
@RequiredArgsConstructor
public class ParticipantsController {
    final ParticipantService participantService;
    @GetMapping("/participants")
    ResponseEntity<?> getParticipants(){
        return ResponseEntity.ok(LabMapper.INSTANCE.getParticipantEventDTO(participantService.getAllParticipants()));
    }
}
