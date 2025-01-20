package ladder.domain;

import ladder.view.InputView;
import ladder.view.ResultView;

import java.util.stream.IntStream;

public class LadderGame {

    private final InputView inputView;
    private final ResultView resultView;

    public LadderGame(InputView inputView, ResultView resultView) {
        this.inputView = inputView;
        this.resultView = resultView;
    }
    public void start() {
        Participants participants = inputView.getParticipants();
        Ladder ladder = inputView.getLadder(participants.size());
        ladder.createLines();
        resultView.printLadder(ladder, participants);

        IntStream.range(0, participants.size())
                .forEach(i -> System.out.println(participants.getName(i) + " -> " + participants.getName(ladder.getResultIndex(i))));
        ladder.getResult(1)
        // 사다리 타기

    }
}
