import com.sun.nio.sctp.IllegalReceiveException;

import java.util.ArrayList;
import java.util.List;

public class LegoBox {

    private final List<Lego> list = new ArrayList<>();

    public void addLego(Lego lego) {
        if (list.contains(lego)) {
            throw new IllegalReceiveException("똑같은 레고를 추가할 수 없습니다.");
        }
        list.add(lego);
    }

    public Lego getLego(Lego lego) {
        final int indexOfLego = list.indexOf(lego);
        if (indexOfLego == -1) {
            throw new IllegalReceiveException("해당 레고는 존재하지 않습니다.");
        }
        return list.remove(indexOfLego);
    }

}
