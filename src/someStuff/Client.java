package someStuff;

import java.util.Scanner;

public class Client {

    public static void main(String[] args) {
    System.out.println(System.getenv("PORT"));
        System.out.println(args[0]);
        System.out.println("Привет, можешь вводить команды");
        String commandName;
        Scanner scanner = new Scanner(System.in);
        Invoker invoker = new Invoker();

        while (true) {
            commandName = scanner.nextLine();
            String result = invoker.executeCommand(commandName);
            System.out.println("Результат выполнения:");
            System.out.println(result);
        }




    }

}
