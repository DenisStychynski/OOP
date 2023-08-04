package Seminar.Seminar2;


import java.util.List;

import javax.print.attribute.standard.MediaSize.Other;



public interface ActorBehavoir {
    void setTake_order(boolean b);
    void setMake_order(boolean d);
    boolean getTook_order();
 boolean getMade_order();
Other makeOrder(List<String> my_List);

}
