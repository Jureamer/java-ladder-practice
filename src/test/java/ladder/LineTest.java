package ladder;

import ladder.domain.Line;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.assertThatThrownBy;

public class LineTest {
    @Test
    void 사다리_라인을_생성한다() {
        Line line = new Line(false);
        assertThat(line).isNotNull();

        line = new Line(true);
        assertThat(line).isNotNull();

        line = new Line();
        assertThat(line).isNotNull();
    }

    @Test
    void 사다리_라인을_그린다() {
        Line line = new Line(false);
        line.draw();
        assertThat(line.isRight()).isTrue();
    }

    @Test
    void 사다리_라인이_맨_오른쪽인_경우_라인을_만들_경우_예외를_반환한다() {
        Line line = new Line(false, true);
        assertThatThrownBy(() -> line.draw())
            .isInstanceOf(IllegalArgumentException.class)
            .hasMessage(Line.RIGHT_SIDE_EXCEPTION);

        assertThatThrownBy(() -> new Line(true, true))
            .isInstanceOf(IllegalArgumentException.class)
            .hasMessage(Line.RIGHT_SIDE_EXCEPTION);
    }

    @Test
    void 사다리_라인이_맨_오른쪽인지_확인한다() {
        Line line = new Line(false, true);
        assertThat(line.isRightSide()).isTrue();
    }
}
