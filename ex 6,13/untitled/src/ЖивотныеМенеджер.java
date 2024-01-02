import java.util.ArrayList;
import java.util.List;
// 13.Создать класс с Инкапсуляцией методов и наследованием по диаграмме.
public class ЖивотныеМенеджер {
    private List<Животное> животные;

    public ЖивотныеМенеджер() {
        this.животные = new ArrayList<>();
    }

    public void добавитьЖивотное(Животное животное) {
        животные.add(животное);
    }

    public void удалитьЖивотное(Животное животное) {
        животные.remove(животное);
    }

    public void вывестиИнформациюОЖивотных() {
        for (Животное животное : животные) {
            System.out.println(животное.toString());
        }
    }
}

