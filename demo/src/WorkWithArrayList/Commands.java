package WorkWithArrayList;

class Commands {
    void help(View view) {
        view.print ("=================================================\n" +
                "available commands:\n" +
                "-------------------------------------------------\n" +
                "list - print list\n" +
                "add - add to list value\n" +
                "add by index - add to list at specific position\n" +
                "clear - delete all data\n" +
                "delete By Index - delete data from index\n" +
                "replace - replace value by index\n" +
                "exit - to exit\n" +
                "=================================================");
    }

    void list(Processing arrayList, View view) {
        view.print("list:");
        if (arrayList.size() != 0) {
            view.print(arrayList.list.toString().replaceAll("[\\[\\]]", ""));
        } else {
            view.print("list is empty");
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

    void clear(Processing processing, View view){
        view.print("you trying delete all data, confirm query 'y' or another key to abort");
        String confirm = (String) view.write();
        if (confirm.equals("y")){
        processing.clear();
        view.print("list cleared");
        } else {view.print("delete aborted");}
    }

    void deleteByIndex(Processing processing, View view) {
        boolean check = true;
        while (check) {
            try {
                view.print("enter index or 'q' if you finished");
                Object index = view.write();
                String indexString =  (String) index;
                if (!indexString.equals("q")) {
                    int indexInt = Integer.parseInt((String) index);
                    processing.deleteByIndex(indexInt - 1);
                    view.print("data from " + (index) + " position is deleted");
                } else {check = false;}
            }catch (Exception e){ view.print("incorrect index"); }
        }
    }

    void replace(Processing processing, View view) {
        boolean check = true;
        while (check) {
            try {
                view.print("enter index or 'q' if you finished");
                Object object = view.write();
                if (!object.equals("q")) {
                    int index = Integer.parseInt((String) object);
                    view.print("enter value");
                    Object value = view.writeInt();
                    processing.replace(index - 1, value);
                    view.print("replace success");
                }else{check = false;}
            }catch (Exception e){view.print("incorrect command");}
        }
    }
}