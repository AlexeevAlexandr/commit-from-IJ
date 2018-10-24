package Collection.ArrayList;

import java.util.Scanner;

class View {

    void print(Object value){
        System.out.println(value);
    }

    Object write(){
        Scanner scanner = new Scanner(System.in);
        return scanner.nextLine();
    }

    int writeInt(){
        Scanner scanner = new Scanner(System.in);
        return scanner.nextInt();
    }

}
