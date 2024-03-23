/**
 * Здесь дракон
 */
public class Dragon {

    /**
     * это поле это его имя
     */
    private String name;

    /**
     * это его возраст
     */
    private int age;

    /**
     *
     * @param name имя
     * @param age возраст
     */
    public Dragon(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }


    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    @Override
    public String toString() {
        return "Дракон с именем " + name + " возрастом " + age + " лет";
    }
}
