package WorkWithArrayList;

import java.util.ArrayList;
import java.util.Scanner;

class Processing {
    ArrayList<Object> list = new ArrayList<>();

    int size(){
        return list.size();
    }

    void add(Object value){
        list.add(value);
    }

    void addByIndex(int index, Object value){
        list.add(index, value);
    }

    void clear(){
        list = new ArrayList<>();
    }

    void deleteByIndex(int index){
        list.remove(index);
    }

    void replace(int index, Object value){
        list.set(index, value);
    }
}
