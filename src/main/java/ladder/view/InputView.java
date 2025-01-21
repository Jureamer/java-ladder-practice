package ladder.view;

import ladder.domain.Ladder;
import ladder.domain.LadderGameResult;
import ladder.domain.Participants;

import java.util.Scanner;

public class InputView {
    private final Scanner scanner;

    public InputView(Scanner scanner) {
        this.scanner = scanner;
    }

    public Participants getParticipants() {
        System.out.println("참여할 사람 이름을 입력하세요. (이름은 쉼표(,)로 구분하세요)");
        String participants = scanner.nextLine();
        return new Participants(participants);
    }

    public Ladder getLadder(int participantsSize) {
        System.out.println("최대 사다리 높이는 몇 개인가요?");
        int height = scanner.nextInt();
        scanner.nextLine();
        return new Ladder(height, participantsSize);
    }

    public LadderGameResult getLadderGameResult(int size) {
        System.out.println("실행 결과를 입력하세요. (결과는 쉼표(,)로 구분하세요)");
        String result = scanner.nextLine();
        return new LadderGameResult(result, size);
    }

    public String getNameWantToView() {
        System.out.println("결과를 보고 싶은 사람은?");
        return scanner.nextLine();
    }
}
