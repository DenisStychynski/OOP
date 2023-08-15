package Seminar.Seminar5;



public class Student extends UserService {
 
public Student( String name1, int id, int age){
    super(name1,id,age);
    
}
@Override
public String toString(){
    return "Имя: " +getName1() + "Возраст: " + getAge() + "Идентификационный номер:" +getId();
}
}
