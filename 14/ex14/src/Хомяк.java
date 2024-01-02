import java.util.Date;

public class Хомяк extends Животное {
    private int возраст;

    public Хомяк(int id, String имя, String команда, Date датаРождения, int возраст) {
        super(id, имя, команда, датаРождения);
        this.возраст = возраст;
    }
}

