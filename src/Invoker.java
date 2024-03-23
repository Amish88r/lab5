import java.util.HashMap;
import java.util.Map;

/**
 * Класс для ...
 */
public class Invoker {

    private Map<String, Command> commandMap = new HashMap<>();

    public Invoker() {
        Receiver receiver = new Receiver();
        Help help = new Help(receiver);
        commandMap.put("help", help);

        Add add = new Add(receiver);
        commandMap.put("add", add);

        Show show = new Show(receiver);
        commandMap.put("show", show);

        Size size = new Size(receiver);
        commandMap.put("size", size);

        Clear clear = new Clear(receiver);
        commandMap.put("clear", clear);
    }

    public String executeCommand(String commandName) {
        commandName = commandName.trim();
        Command command = commandMap.get(commandName);
        if (command == null) {
            return "Такой команды нет!";
        }
        return command.execute();
    }

}
