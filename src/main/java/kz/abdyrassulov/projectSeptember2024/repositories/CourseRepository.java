package kz.abdyrassulov.projectSeptember2024.repositories;

import jakarta.transaction.Transactional;
import kz.abdyrassulov.projectSeptember2024.entities.Course;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
@Transactional
public interface CourseRepository extends JpaRepository<Course, Long> {

}
