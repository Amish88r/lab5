public class Size implements Command {

    private Receiver receiver;

    public Size(Receiver receiver) {
        this.receiver = receiver;
    }

    @Override
    public String execute() {
        return receiver.collectionSize();
    }

    @Override
    public String getHelp() {
        return "Size: показать размер коллекции";
    }
}
