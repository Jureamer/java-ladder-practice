package ladder;

import ladder.domain.Ladder;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.assertThatThrownBy;

public class LadderTest {

    @Test
    void 사다리를_생성한다() {
        Ladder ladder = new Ladder(5, 4);
        assertThat(ladder).isNotNull();
    }

    @ParameterizedTest
    @ValueSource(ints = {2, 10})
    void 사다리_높이는_2_이상_10_이하_이어야_한다(int input) {
        int participant = 4;
        assertThat(new Ladder(input, participant)).isNotNull();
    }

    @ParameterizedTest
    @ValueSource(ints = {1, 11})
    void 사다리_높이는_1_이하_10_초과_일_경우_예외를_반환한다(int input) {
        int participant = 4;
        assertThatThrownBy(() -> new Ladder(input, participant))
                .isInstanceOf(IllegalArgumentException.class)
                .hasMessage("사다리 높이는 2 이상 10 이하만 가능합니다.");
    }

    void 사다리_출발점을_입력받으면_도착점을_반환한다() {
        Ladder ladder = new Ladder(5, 4);
        ladder.createLines();
        assertThat(ladder.getEndIndex(0)).isEqualTo(1);
    }
}
