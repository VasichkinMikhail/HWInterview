package ru.budharain.HW6.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import ru.budharain.HW6.Model.Student;
@Repository
public interface StudentRepository extends JpaRepository<Student,Long> {
}
