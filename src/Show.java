public class Show implements Command {

    private Receiver receiver;

    public Show(Receiver receiver) {
        this.receiver = receiver;
    }

    @Override
    public String execute() {
        return receiver.showDragons();
    }

    @Override
    public String getHelp() {
        return "Show: вывести в стандартный поток вывода все элементы коллекции в строковом представлении";
    }
}
