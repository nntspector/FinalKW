import java.util.Date;

public class Кошка extends Животное {
    private String цвет;

    public Кошка(int id, String имя, String команда, Date датаРождения, String цвет) {
        super(id, имя, команда, датаРождения);
        this.цвет = цвет;
    }
}

