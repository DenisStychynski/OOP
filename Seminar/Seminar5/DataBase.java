package Seminar.Seminar5;

import java.util.ArrayList;
import java.util.List;

public class DataBase {
    private List<Student> students;
    private List<Teacher> teachers;
    public DataBase(){
        students = new ArrayList<>();
        teachers = new ArrayList<>();
    }
    public void addStudent(Student student){
        students.add((Student) students);
    }
      public void addTeacher(Teacher teacher){
        teachers.add((Teacher) teachers);
    }
    public List<Student> getStudent(){
        return students;
    }
     public List<Teacher> getTeachers(){
        return teachers;
    }


}
