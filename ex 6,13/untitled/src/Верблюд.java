import java.util.Date;

public class Верблюд extends Животное {
    private double грузоподъемность;

    // Конструктор, геттеры, сеттеры и другие методы

    public Верблюд(int id, String имя, String команда, Date датаРождения, double грузоподъемность) {
        super(id, имя, команда, датаРождения);
        this.грузоподъемность = грузоподъемность;
    }
}

