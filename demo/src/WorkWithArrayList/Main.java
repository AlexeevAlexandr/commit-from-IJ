package WorkWithArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayListDemo arrayList = new ArrayListDemo();
        View view = new View();
        boolean check = true;
        view.print("Hello!");
        while (check) {
            try {
                view.print("insert command or 'help' to help");

                String value = (String) view.write();

                if (value.equals("help")){
                    view.print("list availables commands:\n" +
                            "add - add to list value\n" +
                            "add by index - add to list on specific position\n" +
                            "list - print list\n" +
                            "exit - to exit");
                }

                if (value.equals("add")) {
                    while(true) {
                        view.print("add value or 'q' if you finished");
                        Object values = view.write();
                        if(values != ("q")) {
                            arrayList.add(values);
                        }else{break;}
                    }
                }

                if (value.equals("add by index")) {
                    view.print("add index from 1 to " + (arrayList.size()));
                    int values1 = (view.writeInt() - 1);
                    view.print("add value");
                    Object values2 = view.write();
                    arrayList.addByIndex((int)values1, values2);
                }

                if (value.equals("list")) {
                    view.print("list:");
                    if (arrayList.size() != 0) {
                        view.print(arrayList.list.toString().replaceAll("[\\[\\]]", ""));
                    }else{view.print("list is empty");}
                }

                if (value.equals("exit")) {
                    view.print("goodbye, see you soon");
                    check = false;
                }
            }catch (Exception e){
                view.print("incorrect command");
            }
        }
    }
}
