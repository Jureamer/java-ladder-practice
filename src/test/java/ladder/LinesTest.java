package ladder;

import ladder.domain.Lines;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class LinesTest {
    @Test
    void 사다리_라인을_생성한다() {
        Lines lines = new Lines(5);
        assertThat(lines).isNotNull();
    }

    @Test
    void 사다리_라인을_가져온다() {
        Lines lines = new Lines(5);
        assertThat(lines.getLines()).isNotNull();
        assertThat(lines.getLines()).hasSize(5);
    }

    @Test
    void 특정_라인에_대한_정보를_가져온다() {
        Lines lines = new Lines(5);
        assertThat(lines.getLine(0)).isNotNull();
    }

    @Test
    void 사다리_라인을_그릴_수_있는지_확인한다() {
        Lines lines = new Lines(5);
        assertThat(lines.drawable(0)).isTrue();

        lines.drawLine(0);
        assertThat(lines.drawable(1)).isFalse();
        assertThat(lines.drawable(4)).isFalse();
    }
    @Test
    void 사다리_라인을_그린다() {
        Lines lines = new Lines(5);
        lines.drawLine(0);
        assertThat(lines.getLine(0).isRight()).isTrue();
    }
}
