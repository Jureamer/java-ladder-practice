package ladder.domain;

import java.util.List;
import java.util.Random;
import java.util.stream.IntStream;

public class Height {
    private final Lines lines;

    public Height(Lines lines) {
        this.lines = lines;
    }

    public Height(int countOfParticipant) {
        this.lines = new Lines(countOfParticipant);
    }

    public void createLines () {
        Random random = new Random();
        IntStream.range(0, lines.size())
            .forEach(i -> {
                if (random.nextBoolean() && lines.drawable(i)) {
                    lines.drawLine(i);
                }
            });
    }

    public Lines getLines() {
        return lines;
    }

    public List<Line> getDrawLines() {
        return lines.getLines();
    }
}
