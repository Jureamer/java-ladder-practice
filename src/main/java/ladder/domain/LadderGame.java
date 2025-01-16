package ladder.domain;

import ladder.view.InputView;
import ladder.view.ResultView;

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
    }
}
