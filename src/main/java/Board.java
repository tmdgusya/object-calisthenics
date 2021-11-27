import java.util.ArrayList;
import java.util.List;

public class Board {

    public String boardRepresentation() {
        StringBuilder buf = new StringBuilder();

        for (Location loc : squares()) {
            String currentPieceLocation = loc.getCurrentPieceLocation();
            buf.append(currentPieceLocation);
        }

        return buf.toString();
    }

    public List<Location> squares() {
        return new ArrayList<Location>();
    }

    public void redTeamAddScore() {
        BaseBallScore redTeamScore = new BaseBallScore();
        redTeamScore.addScore(1);
    }

}
