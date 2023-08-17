package Seminar.Seminar2;

import java.util.ArrayList;

import Seminar.Seminar1.HotBeverage;

public class SortTemp {
   

    public ArrayList <HotBeverage> getSortTemp(ArrayList <HotBeverage> no_sort_list){
        ArrayList <HotBeverage> sort_list = new ArrayList<>();
        int i;
        double max;
        int max_index;
        while (no_sort_list.size() > 0){
            max = no_sort_list.get(0).getTemperature();
            max_index = 0;
            for (i=1; i<no_sort_list.size(); i++){
                if(no_sort_list.get(i).getTemperature()>max){
                    max = no_sort_list.get(i).getTemperature();
                    max_index = i;
                }
            }
            sort_list.add(no_sort_list.get(max_index));
            no_sort_list.remove(max_index);
        }
        return sort_list;
    }

    public ArrayList <HotBeverage> getSortVoiumeTemp(ArrayList <HotBeverage> no_sort_list){
        ArrayList <HotBeverage> sort_list = new ArrayList<>();
        int i;
        double max;
        int max_index;
        while (no_sort_list.size() > 0){
            max = no_sort_list.get(0).getVolume();
            max_index = 0;
            for (i=1; i<no_sort_list.size(); i++){
                if(no_sort_list.get(i).getVolume()>max){
                    max = no_sort_list.get(i).getVolume();
                    max_index = i;
                }
            }
            sort_list.add(no_sort_list.get(max_index));
            no_sort_list.remove(max_index);
        }

        return sort_list;
    }
}

