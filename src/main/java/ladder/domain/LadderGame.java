package ladder.domain;

import ladder.view.InputView;
import ladder.view.ResultView;

import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class LadderGame {

    private final InputView inputView;
    private final ResultView resultView;
    private final Scanner scanner = new Scanner(System.in);

    public LadderGame(InputView inputView, ResultView resultView) {
        this.inputView = inputView;
        this.resultView = resultView;
    }
    public void start() {
        Participants participants = inputView.getParticipants();
        Ladder ladder = inputView.getLadder(participants.size());
        ladder.createLines();
        resultView.printLadder(ladder, participants);

        LadderGameResult ladderGameResult = inputView.getLadderGameResult(participants.size());
        PlayerResult playerResult = createPlayerResult(ladder, participants, ladderGameResult);
        while (true) {
            String name = inputView.getNameWantToView();
            resultView.printResult(playerResult, name);
        }
    }

    private PlayerResult createPlayerResult(Ladder ladder, Participants participants, LadderGameResult ladderGameResult) {
        List<ResultForParticipant> playerResult = IntStream.range(0, participants.size())
                .mapToObj(index -> {
                    String name = participants.getNameByIndex(index);
                    int endIndex = ladder.getEndIndex(index);
                    String gameResult = ladderGameResult.getResultByIndex(endIndex);
                    return new ResultForParticipant(name, gameResult);
                })
                .collect(Collectors.toList());

        return new PlayerResult(playerResult);
    }
}
