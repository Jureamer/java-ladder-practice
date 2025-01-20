package ladder;

import ladder.domain.Participant;
import ladder.domain.ResultForParticipant;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.assertThatThrownBy;

public class ResultForParticipantTest {
    @Test
    void 결과를_생성한다() {
        assertThat(new ResultForParticipant("pobi", "꽝")).isNotNull();
    }

    @Test
    void 이름으로_결과를_조회한다() {
        String name = "pobi";
        ResultForParticipant resultForParticipant = new ResultForParticipant(name, "꽝");
        assertThat(resultForParticipant.getResultByName(name)).isEqualTo("꽝");
    }

    @Test
    void 이름을_조회한다() {
        String name = "pobi";
        ResultForParticipant resultForParticipant = new ResultForParticipant(name, "꽝");
        assertThat(resultForParticipant.getName()).isEqualTo(name);
    }

    @Test
    void 이름에_대한_결과가_없을_경우_예외를_반환한다() {
        String name = "pobi";
        ResultForParticipant resultForParticipant = new ResultForParticipant("pobi", "꽝");
        assertThatThrownBy(() -> resultForParticipant.getResultByName("crong"))
                .isInstanceOf(IllegalArgumentException.class)
                .hasMessage("참여자 ("  + name + ")가 존재하지 않습니다.");
    }
}
