package dao.impl;

import dao.StudentDAO;
import data.DataHolder;
import model.Student;

import java.util.List;
import java.util.Optional;

public class StudentDAOImpl implements StudentDAO
{
    public Optional<Student> findById(Integer id)
    {
        return DataHolder.students.stream().filter(r->r.getId().equals(id)).findFirst();
    }

    public List<Student> findAll()
    {
        return DataHolder.students;
    }

    public Student create(Student student)
    {
        if (student==null || student.getFirstName().isEmpty() || student.getLastName().isEmpty() || student.getId()==null)
        {
            return null;
        }
        DataHolder.students.add(student);
        return student;
    }

    public void deleteById(Integer id)
    {
        DataHolder.students.removeIf(r->r.getId().equals(id));
    }

    public Student update(Student student)
    {
        if (student==null || student.getFirstName().isEmpty() || student.getLastName().isEmpty())
        {
            return null;
        }
        DataHolder.students.removeIf(r->r.getFirstName().equals(student.getFirstName()) &&
                r.getLastName().equals(student.getLastName()) && r.getId().equals(student.getId()));
        DataHolder.students.add(student);
        return student;
    }
}
