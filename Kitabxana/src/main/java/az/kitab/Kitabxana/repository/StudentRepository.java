package az.kitab.Kitabxana.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import az.kitab.Kitabxana.entity.Student;

public interface StudentRepository extends JpaRepository<Student, Integer> {

}
