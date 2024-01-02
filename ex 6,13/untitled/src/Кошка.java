import java.util.Date;

public class Кошка extends Животное {
    private String цвет;

    // Конструктор, геттеры, сеттеры и другие методы
    public String getЦвет() {
        return цвет;
    }

    public Кошка(int id, String имя, String команда, Date датаРождения, String цвет) {
        super(id, имя, команда, датаРождения);
        this.цвет = цвет;
    }
    @Override
    public String toString() {
        return "Кошка{" +
                "id=" + getId() +
                ", имя='" + getИмя() + '\'' +
                ", команда='" + getКоманда() + '\'' +
                ", датаРождения=" + getДатаРождения() +
                ", порода='" + цвет + '\'' +
                '}';
    }
}

