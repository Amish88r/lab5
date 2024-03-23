import java.util.InputMismatchException;
import java.util.Scanner;

public class Add implements Command {

    private Receiver receiver;

    public Add(Receiver receiver) {
        this.receiver = receiver;
    }

    @Override
    public String execute() {
        Dragon dragon = null;
        try {
            System.out.println("Введите имя дракона!");
            Scanner scanner = new Scanner(System.in);
            System.out.print("-> ");
            String dragonName = scanner.nextLine();
            System.out.println("Введите возраст дракона!");
            System.out.print("-> ");
            Integer dragonAge = scanner.nextInt();
            dragon = new Dragon(dragonName, dragonAge);
        } catch (InputMismatchException ex) {
            dragon = new Dragon("Имя по умлч", -1);
        }

        return receiver.addDragon(dragon);
    }

    @Override
    public String getHelp() {
        return "add {element} : добавить новый элемент в коллекцию";
    }
}
