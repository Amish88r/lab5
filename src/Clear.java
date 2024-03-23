public class Clear implements Command {

    private Receiver receiver;

    public Clear(Receiver receiver) {
        this.receiver = receiver;
    }

    @Override
    public String execute() {
        return receiver.clear();
    }

    @Override
    public String getHelp() {
        return "clear : очистить коллекцию";
    }
}
