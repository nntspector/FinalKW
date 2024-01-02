import java.util.Date;

public class Лошадь extends Животное {
    private String окрас;

    // Конструктор, геттеры, сеттеры и другие методы
    public String getОкрас() {
        return окрас;
    }

    public Лошадь(int id, String имя, String команда, Date датаРождения, String окрас) {
        super(id, имя, команда, датаРождения);
        this.окрас = окрас;
    }
    @Override
    public String toString() {
        return "Лошадь{" +
                "id=" + getId() +
                ", имя='" + getИмя() + '\'' +
                ", команда='" + getКоманда() + '\'' +
                ", датаРождения=" + getДатаРождения() +
                ", порода='" + окрас + '\'' +
                '}';
    }
}
