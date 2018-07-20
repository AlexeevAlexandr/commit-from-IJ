package WorkWithArrayList;

import java.util.ArrayList;
import java.util.Scanner;

class ArrayListDemo {
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

}
