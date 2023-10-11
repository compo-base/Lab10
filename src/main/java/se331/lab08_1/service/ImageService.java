package se331.lab08_1.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import se331.lab08_1.entity.UploadedImage;
import se331.lab08_1.repository.UploadedImageRepository;

@Service
public class ImageService {

    @Autowired
    private UploadedImageRepository imageRepository;

    public UploadedImage saveImageDetails(String url, String filename) {
        UploadedImage image = new UploadedImage();
        image.setUrl(url);
        image.setFilename(filename);
        return imageRepository.save(image);
    }
}
