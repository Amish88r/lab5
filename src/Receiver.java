import java.util.ArrayList;

public class Receiver {

    private ArrayList<Dragon> dragons = new ArrayList<>();

    public String addDragon(Dragon dragon) {
        if (dragon == null) {
            return "Вы че мне тут ввели за дракона лол??";
        }
        if (dragons.add(dragon)) {
            return "Дракон добавлен";
        } else {
            return "Дракона добавить не удалось";
        }
    }

    public String showDragons() {

        String dragonsStr = "";

        for (int  i = 0; i < dragons.size(); i++) {
            dragonsStr += dragons.get(i) + "\n";
        }

        return dragonsStr;

    }

    public String collectionSize() {
        return String.valueOf(dragons.size());
    }

    public String clear() {
        dragons.clear();
        return "Все удалено =(";
    }

}
