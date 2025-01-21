package ladder;

import ladder.domain.LadderGame;
import ladder.view.InputView;
import ladder.view.ResultView;

import java.util.Scanner;

public class ladderMain {
    private static final Scanner scanner = new Scanner(System.in);
    private static LadderGame ladderGame = new LadderGame(new InputView(scanner), new ResultView(scanner));

    public static void main(String[] args) {
        ladderGame.start();
    }
}
