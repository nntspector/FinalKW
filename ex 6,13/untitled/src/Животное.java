import java.util.Date;

public class Животное {
    private int id;
    private String имя;
    private String команда;
    private Date датаРождения;

    public Животное(int id, String имя, String команда, Date датаРождения) {
        this.id = id;
        this.имя = имя;
        this.команда = команда;
        this.датаРождения = датаРождения;
    }

    public int getId() {
        return id;
    }

    public String getИмя() {
        return имя;
    }

    public String getКоманда() {
        return команда;
    }

    public Date getДатаРождения() {
        return датаРождения;
    }
}
