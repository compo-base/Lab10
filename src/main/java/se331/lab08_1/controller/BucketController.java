package se331.lab08_1.controller;

import jakarta.servlet.ServletException;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestPart;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;
import se331.lab08_1.service.ImageService;
import se331.lab08_1.util.CloudStorageHelper;

import java.io.IOException;

@Controller
@RequiredArgsConstructor
@RestController
public class BucketController {
    final CloudStorageHelper cloudStorageHelper;
    final ImageService imageService;
    @PostMapping("/uploadFile")
    public ResponseEntity<?> uploadFile(@RequestPart(value = "file")
                                        MultipartFile file) throws IOException, ServletException {
        String url = this.cloudStorageHelper.getImageUrl(file, "lab11-se331.appspot.com");
        imageService.saveImageDetails(url, file.getOriginalFilename());
        return ResponseEntity.ok(this.cloudStorageHelper.getImageUrl(file, "lab11-se331.appspot.com"));
    }

    @PostMapping("/uploadImage")
    public ResponseEntity<?> uploadFileComponent(@RequestPart(value = "image")MultipartFile file) throws IOException,ServletException{
        String url = this.cloudStorageHelper.getImageUrl(file, "lab11-se331.appspot.com");
        imageService.saveImageDetails(url, file.getOriginalFilename());
        return ResponseEntity.ok(url);
    }

}
