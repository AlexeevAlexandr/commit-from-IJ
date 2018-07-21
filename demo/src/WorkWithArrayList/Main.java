package WorkWithArrayList;

public class Main {
    public static void main(String[] args) {
        Processing processing = new Processing();
        Commands commands = new Commands();
        View view = new View();
        boolean check = true;
        view.print("Hello!");
        while (check) {
            try {
                view.print("insert command or 'help' to help");

                String value = (String) view.write();

                switch (value) {
                    case "help":
                        commands.help(view);
                        break;
                    case "list":
                        commands.list(processing, view);
                        break;
                    case "add":
                        commands.add(processing, view);
                        break;
                    case "add by index":
                        commands.addByIndex(processing, view);
                        break;
                    case "clear":
                        commands.clear(processing, view);
                        break;
                    case "delete by index":
                        commands.deleteByIndex(processing, view);
                        break;
                    case "replace":
                        commands.replace(processing, view);
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
}
