package Seminar.Seminar5;

public class UserService {
    
    protected  int id;
    protected   String name1;
  protected  int age;
 


    public UserService(String name12, int id2, int age2) {
}
    public  void User( String name1, int id, int age) {
        this.name1 = name1;
        this.id = id;
        this.age = age;
        
    }
public String getName1() {
    return name1;
}
public int getId() {
    return id;
}
public int getAge() {
    return age;
}
@Override
public String toString(){
    return "Имя: " +getName1() + "Возраст: " + getAge() + "Идентификационный номер:" +getId();
}
public static Teacher createTeacher(String name12, int age2) {
    return null;
}
public static Student createStudent(String name12, int age1) {
    return null;
}


}
