package comands;
package Some_Stuff;

public class Help implements Command {

    private Receiver receiver;

    public Help(Receiver receiver) {
        this.receiver = receiver;
    }

    @Override
    public String execute() {
        return "че тут выполнять-то";
    }

    @Override
    public String getHelp() {
        return "help : вывести справку по доступным командам";
    }
}
