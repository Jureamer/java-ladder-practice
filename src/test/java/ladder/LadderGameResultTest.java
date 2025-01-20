package ladder;

import ladder.domain.LadderGameResult;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.assertThatThrownBy;

public class LadderGameResultTest {
    @Test
    void 실행결과를_생성한다() {
        assertThat(new LadderGameResult("꽝, 축하", 2)).isNotNull();
    }

    @Test
    void 실행결과_수와_참가자_수가_다를_경우_예외_반환() {
        assertThatThrownBy(() -> new LadderGameResult("꽝, 축하", 3))
                .isInstanceOf(IllegalArgumentException.class)
                .hasMessage("결과의 개수가 참가자의 수와 다릅니다.");
    }

    @Test
    void 특정_인덱스의_실행_결과를_반환한다() {
        LadderGameResult ladderGameResult = new LadderGameResult("꽝, 축하", 2);
        assertThat(ladderGameResult.getResultByIndex(0)).isEqualTo("꽝");
        assertThat(ladderGameResult.getResultByIndex(1)).isEqualTo("축하");
    }
}
