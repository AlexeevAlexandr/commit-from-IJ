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

                switch (value) {
                    case "help":
                        help(view);
                        break;
                    case "add":
                        add(arrayList, view);
                        break;
                    case "add by index":
                        addByIndex(arrayList, view);
                        break;
                    case "list":
                        list(arrayList, view);
                        break;
                    case "exit":
                        view.print("goodbye, see you soon");
                        check = false;
                        break;
                    default:
                        view.print("command not found");
                        break;
                }
            }catch (Exception e){
                view.print("incorrect command");
            }
        }
    }

    private static void addByIndex(ArrayListDemo arrayList, View view) {
        while (true) {
            try {
                view.print("add value or 'q' if you finished");
                Object value = view.write();
                view.print("add index from 1 to " + (arrayList.size()));
                int index = (view.writeInt() - 1);
                if (!value.equals("q")) {
                    arrayList.addByIndex(index, value);
                    view.print("added");
                } else {
                    view.print("data to list is saved");
                    break;
                }
            }catch (Exception e){view.print("incorrect index, try again");}
        }
    }

    private static void add(ArrayListDemo arrayList, View view) {
        while (true) {
            view.print("add value or 'q' if you finished");
            Object values = view.write();
            if (!values.equals("q")) {
                arrayList.add(values);
                view.print("added");
            } else {
                view.print("data to list is saved");
                break;
            }
        }
    }

    private static void help(View view) {
        view.print("available commands:\n" +
                "add - add to list value\n" +
                "add by index - add to list on specific position\n" +
                "list - print list\n" +
                "exit - to exit");
    }

    private static void list(ArrayListDemo arrayList, View view) {
        view.print("list:");
        if (arrayList.size() != 0) {
            view.print(arrayList.list.toString().replaceAll("[\\[\\]]", ""));
        } else {
            view.print("list is empty");
        }
    }
}
