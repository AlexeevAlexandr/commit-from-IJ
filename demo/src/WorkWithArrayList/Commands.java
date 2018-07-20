package WorkWithArrayList;

class Commands {
    void addByIndex(Processing processing, View view) {
        while (true) {
            try {
                view.print("add value or 'q' if you finished");
                Object value = view.write();
                view.print("add index from 1 to " + (processing.size()));
                int index = (view.writeInt() - 1);
                if (!value.equals("q")) {
                    processing.addByIndex(index, value);
                    view.print("added");
                } else {
                    view.print("data to list is saved");
                    break;
                }
            }catch (Exception e){view.print("incorrect index, try again");}
        }
    }

    void add(Processing arrayList, View view) {
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

    void help(View view) {
        view.print("available commands:\n" +
                "add - add to list value\n" +
                "add by index - add to list on specific position\n" +
                "list - print list\n" +
                "exit - to exit");
    }

    void list(Processing arrayList, View view) {
        view.print("list:");
        if (arrayList.size() != 0) {
            view.print(arrayList.list.toString().replaceAll("[\\[\\]]", ""));
        } else {
            view.print("list is empty");
        }
    }

    void clear(Processing processing, View view){
        view.print("you trying delete all data, confirm query 'y' or another key to abort");
        String confirm = (String) view.write();
        if (confirm.equals("y")){
        processing.clear();
        view.print("list cleared");
        } else {view.print("delete aborted");}
    }
}
