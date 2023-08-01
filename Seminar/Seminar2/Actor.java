package Seminar.Seminar2;

public abstract class Actor implements ActorBehavoir{
     private String name;
     public Actor (String name1, boolean made_order1, boolean took_order1){
        this.name = name1;
     }
  public String getName(){
    return name;
  }

    }
