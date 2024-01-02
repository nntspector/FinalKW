import java.util.Date;

public class Лошадь extends Животное {
    private String окрас;

    public Лошадь(int id, String имя, String команда, Date датаРождения, String окрас) {
        super(id, имя, команда, датаРождения);
        this.окрас = окрас;
    }
}
