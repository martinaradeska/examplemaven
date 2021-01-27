package data;

import model.Student;

import java.util.ArrayList;
import java.util.List;

public class DataHolder
{
    public static List<Student> students = new ArrayList<Student>();

    public static void main(String[] args)
    {
        students.add(new Student("Rick", "Sanchez", 1));
        students.add(new Student("Summer", "Smith", 2));
    }
}
