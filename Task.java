import java.util.Scanner;

public class Task {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        PhoneBook phoneBook = new PhoneBook();
        mainMenu();
        int choice = Integer.parseInt(scanner.nextLine());
        while (choice != -1){
            if (choice == 1){
                System.out.println(phoneBook.getFullInfo());
                mainMenu();
                choice = Integer.parseInt(scanner.nextLine());
            }
            if (choice == 2){
                System.out.println("Введите имя:");
                String name = scanner.nextLine();
                System.out.println("Введите номер телефона:");
                String phoneNumber = scanner.nextLine();
                phoneBook.addPhoneNumber2(phoneNumber, name);
                mainMenu();
                choice = Integer.parseInt(scanner.nextLine());
            }
            if (choice == 3){
                System.out.println("Введите имя для поиска:");
                String searchName = scanner.nextLine();
                System.out.println(phoneBook.findByName(searchName));
                mainMenu();
                choice = Integer.parseInt(scanner.nextLine());
            }
            if (choice == 4){
                System.out.println("Введите номер телефона для поиска:");
                String searchPhoneNumber = scanner.nextLine();
                System.out.println(phoneBook.findByPhoneNumber(searchPhoneNumber));
                mainMenu();
                choice = Integer.parseInt(scanner.nextLine());
            }
            if (choice == 5){
                System.out.println("Введите удаляемый номер телефона:");
                String delPhoneNumber = scanner.nextLine();
                phoneBook.deliteNumber(delPhoneNumber);
                mainMenu();
                choice = Integer.parseInt(scanner.nextLine());
    
            }
            if (choice == 6){
                return;
            }
        }
    }  

    static void mainMenu(){
        System.out.println("Главное меню\n" + 
                            "1. Вывести все телефоны\n" + 
                            "2. Добавить контакт\n" +
                            "3. Найти данные по имени\n" +
                            "4. Найти данные по номеру телефона\n"+ 
                            "5. Удалить контакт\n" +
                            "6. Выход\n" +
                            "Введите номер интересующего пункта:");
    }
}
