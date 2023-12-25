import java.util.Date;

public class Main {
    public static void main(String[] args) {
        // Пример использования классов
        Собака собака = new Собака(1, "Барон", "Сидеть", new Date(), "Дворняга");
        Кошка кошка = new Кошка(2, "Мурка", "Ловить мышей", new Date(), "Рыжая");
        Лошадь лошадь = new Лошадь(3, "Гроза", "Тянуть плуг", new Date(), "Белая");

        System.out.println("Порода собаки: " + собака.getПорода());
        System.out.println("Цвет кошки: " + кошка.getЦвет());
        System.out.println("Окрас лошади: " + лошадь.getОкрас());
    }
}