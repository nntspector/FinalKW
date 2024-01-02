// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ЖивотныеРеестр реестр = new ЖивотныеРеестр();

        while (true) {
            System.out.println("Меню:");
            System.out.println("1. Завести новое животное");
            System.out.println("2. Определить животное в правильный класс");
            System.out.println("3. Увидеть список команд, которое выполняет животное");
            System.out.println("4. Обучить животное новым командам");
            System.out.println("5. Выйти из программы");

            int выбор = scanner.nextInt();
            scanner.nextLine(); // очистка буфера после ввода числа

            switch (выбор) {
                case 1:
                    System.out.println("Введите тип животного (собака, кошка, хомяк, лошадь):");
                    String типЖивотного = scanner.nextLine();
                    System.out.println("Введите имя животного:");
                    String имяЖивотного = scanner.nextLine();
                    System.out.println("Введите команду, которую выполняет животное:");
                    String команда = scanner.nextLine();

                    реестр.завестиНовоеЖивотное(типЖивотного, имяЖивотного, команда);
                    break;

                case 2:
                    System.out.println("Введите имя животного для определения в правильный класс:");
                    String имя = scanner.nextLine();
                    реестр.определитьКласс(имя);
                    break;

                case 3:
                    System.out.println("Введите имя животного для просмотра списка команд:");
                    имя = scanner.nextLine();
                    реестр.показатьСписокКоманд(имя);
                    break;

                case 4:
                    System.out.println("Введите имя животного для обучения новым командам:");
                    имя = scanner.nextLine();
                    System.out.println("Введите новую команду:");
                    String новаяКоманда = scanner.nextLine();
                    реестр.обучитьНовойКоманде(имя, новаяКоманда);
                    break;

                case 5:
                    System.out.println("Программа завершена.");
                    System.exit(0);
                    break;

                default:
                    System.out.println("Некорректный выбор. Попробуйте еще раз.");
            }
        }
    }
}
