package ladder.domain;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.IntStream;

public class Ladder {
    private List<Height> heights = new ArrayList<>();
    private static final int MIN_HEIGHT = 2;
    private static final int MAX_HEIGHT = 10;

    public Ladder(int heights, int countOfParticipant) {
        checkValidation(heights);

        IntStream.range(0, heights)
                .forEach(i -> this.heights.add(new Height(countOfParticipant)));
    }

    private void checkValidation(int heights) {
        if (heights > MAX_HEIGHT || heights < MIN_HEIGHT) {
            throw new IllegalArgumentException("사다리 높이는 " + MIN_HEIGHT +" 이상 " + MAX_HEIGHT + " 이하만 가능합니다.");
        }
    }

    public void createLines() {
        heights.forEach(Height::createLines);
    }
}
