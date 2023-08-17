package Seminar.Seminar5;

import java.util.ArrayList;
import java.util.Calendar;

public class BaseСontroller {
    private DataService service = new UserService();
    
    public void NewStudent( String name, String lastName, Calendar birthday, String group, String speciality, double averageMark){
       service.createStudent(name,lastName,birthday,group,speciality,averageMark);
    }
     
    public void newTeacher(String name, String lastName, Calendar birthday, ArrayList <String> disciplines, double rating, String department){
         service.createTeacher(name,lastName,birthday,disciplines,rating,department);
    }

    public void showTeacher(){
        service.getTeachers();
    }

    public void showStuden(){
        service.getStudents();
    }
}