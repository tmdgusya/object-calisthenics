import java.util.ArrayList;
import java.util.List;

public class Board {

    public String boardRepresentation() {

        StringBuffer stringBuffer = new StringBuffer();

        for (Location location : square()) {
            stringBuffer.append(location.current.representation.substring(0,1));
        }

        return stringBuffer.toString();
    }

    public List<Location> square() {
        return new ArrayList<Location>();
    }

}
