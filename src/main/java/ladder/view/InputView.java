package ladder.view;

import ladder.domain.Ladder;
import ladder.domain.Participants;

import java.util.Scanner;

public class InputView {
    Scanner scanner = new Scanner(System.in);

    public Participants getParticipants() {
        System.out.println("참여할 사람 이름을 입력하세요. (이름은 쉼표(,)로 구분하세요)");
        String participants = scanner.nextLine();
        return new Participants(participants);
    }

    public Ladder getLadder(int participantsSize) {
        System.out.println("최대 사다리 높이는 몇 개인가요?");
        return new Ladder(scanner.nextInt(), participantsSize);
    }
}
