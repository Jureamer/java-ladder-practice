package ladder.domain;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.IntStream;

public class Lines {
    private List<Line> lines;

    public Lines(int width) {
        this.lines = new ArrayList<>();
        IntStream.range(0, width)
                .forEach(i -> lines.add(new Line()));
    }

    public List<Line> getLines() {
        return lines;
    }

    public Line getLine(int index) {
        return lines.get(index);
    }

    public boolean drawable(int index) {
        return index == 0 || (!lines.get(index).isRightSide() &&
                (index - 1 >= 0 && !lines.get(index - 1).isRight()) &&
                index + 1 < lines.size() && !lines.get(index + 1).isRight());
    }

    public void drawLine(int index) {
        lines.get(index).draw();
    }

    public int size() {
        return lines.size();
    }
}
