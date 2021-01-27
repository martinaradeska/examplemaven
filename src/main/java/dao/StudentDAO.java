package dao;

import model.Student;

import java.util.List;
import java.util.Optional;

public interface StudentDAO
{
    Optional<Student> findById(Integer id);
    List<Student> findAll();
    Student create (Student student);
    void deleteById(Integer id);
    Student update(Student student);
}
