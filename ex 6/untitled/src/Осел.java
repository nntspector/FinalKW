import java.util.Date;

public class Осел extends Животное {
    private double грузоподъемность;

    // Конструктор, геттеры, сеттеры и другие методы

    public Осел(int id, String имя, String команда, Date датаРождения, double грузоподъемность) {
        super(id, имя, команда, датаРождения);
        this.грузоподъемность = грузоподъемность;
    }

}
