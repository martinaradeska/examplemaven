package model;

import lombok.Data;

@Data
public class Student
{
    private Integer id;
    private String firstName;
    private String lastName;

    public Student()
    {
    }

    public Student(String firstName, String lastName, Integer id)
    {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public Student(String firstName, String lastName)
    {
        this.id = (int) (Math.random() * 1000);
        this.firstName = firstName;
        this.lastName = lastName;
    }

    @Override
    public String toString()
    {
        return "Student[" +
                "id=" + id +
                ", firstName='" + firstName +
                ", LastName='" + lastName + ']';
    }
}
