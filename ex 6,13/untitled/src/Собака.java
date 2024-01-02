
import java.util.Date;

public class Собака extends Животное {
    private String порода;


    // Конструктор, геттеры, сеттеры и другие методы
    public String getПорода() {
        return порода;
    }


    public Собака(int id, String имя, String команда, Date датаРождения, String порода) {
        super(id, имя, команда, датаРождения);
        this.порода = порода;
    }
    @Override
    public String toString() {
        return "Собака{" +
                "id=" + getId() +
                ", имя='" + getИмя() + '\'' +
                ", команда='" + getКоманда() + '\'' +
                ", датаРождения=" + getДатаРождения() +
                ", порода='" + порода + '\'' +
                '}';
    }
}

