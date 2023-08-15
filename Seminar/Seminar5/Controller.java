package Seminar.Seminar5;

public class Controller {
   
   

    public void createTeacher(String name1, int age){
        Teacher teacher = UserService.createTeacher(name1, age);
    }
        public void createStudent(String name1, int age1){
        Student student = UserService.createStudent(name1, age1);
    }
    }

