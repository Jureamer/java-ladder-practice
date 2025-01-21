package ladder.view;

import ladder.domain.Ladder;
import ladder.domain.Participants;
import ladder.domain.PlayerResult;

import java.util.List;
import java.util.Scanner;

public class ResultView {
    private final String BLANK = "     ";
    private final String POINT = "-----";
    private final String LINE = "|";
    private final Scanner scanner;

    public ResultView(Scanner scanner) {
        this.scanner = scanner;
    }

    public void printLadder(Ladder ladder, Participants participants) {
        List<String> names = participants.getNames();
        names.stream()
                .forEach(name -> System.out.print(name + BLANK));

        ladder.getHeights().stream()
                .forEach(height -> {
                    System.out.println();
                    height.getDrawLines().stream()
                            .forEach(line -> printLine(line.isRight()));
                });

    }

    private void printLine(boolean point) {
        System.out.print(LINE);
        if (point) {
            System.out.print(POINT);
            return;
        }
        System.out.print(BLANK);
    }

    public void printResult(PlayerResult playerResult, String name) {
        if (name.equals("all")) {
            playerResult.getPlayerResult().stream()
                .forEach(result -> System.out.println(result.getName() + " : " + result.getResult()));
            return;
        }
        System.out.println(playerResult.getResultByName(name));
    }
}
