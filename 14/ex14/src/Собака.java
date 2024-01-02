import java.util.Date;

public class Собака extends Животное {
    private String порода;

    public Собака(int id, String имя, String команда, Date датаРождения, String порода) {
        super(id, имя, команда, датаРождения);
        this.порода = порода;
    }
}

