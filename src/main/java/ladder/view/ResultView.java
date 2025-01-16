package ladder.view;

import ladder.domain.Ladder;
import ladder.domain.Participants;

import java.util.List;

public class ResultView {
    private final String BLANK = "     ";
    private final String POINT = "-----";
    private final String LINE = "|";
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
}
