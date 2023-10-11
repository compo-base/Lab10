package se331.lab08_1.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import se331.lab08_1.entity.UploadedImage;

public interface UploadedImageRepository extends JpaRepository<UploadedImage, Long> {
}
