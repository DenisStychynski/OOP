package Seminar.Seminar5;

public class View {
    private Controller controller;
    public View(Controller controller){
        this.controller = controller;

    }
    public void createTeacher(String name, int age){
        controller.createTeacher(name, age);
    }
    public void createStudent(String name2, int age2){
        controller.createStudent(name2, age2);
    }
}
