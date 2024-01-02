import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Животное {
    private int id;
    private String имя;
    private String команда;
    private Date датаРождения;
    private List<String> списокКоманд;

    public Животное(int id, String имя, String команда, Date датаРождения) {
        this.id = id;
        this.имя = имя;
        this.команда = команда;
        this.датаРождения = датаРождения;
        this.списокКоманд = new ArrayList<>();
        this.списокКоманд.add(команда);
    }

    public void показатьСписокКоманд() {
        for (String команда : списокКоманд) {
            System.out.println(команда);
        }
    }

    public void обучитьНовойКоманде(String новаяКоманда) {
        списокКоманд.add(новаяКоманда);
    }

}

