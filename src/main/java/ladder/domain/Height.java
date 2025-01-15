package ladder.domain;

import java.util.Random;

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

        for (int i = 0; i < lines.size(); i++) {
            if (lines.drawable(i) && random.nextBoolean()) {
                lines.drawLine(i);
            }

    }

}


}
