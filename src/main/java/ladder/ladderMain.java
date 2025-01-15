package ladder;

import ladder.domain.LadderGame;
import ladder.view.InputView;
import ladder.view.ResultView;

public class ladderMain {
    private static LadderGame ladderGame = new LadderGame(new InputView(), new ResultView());

    public static void main(String[] args) {
        ladderGame.start();
    }
}
