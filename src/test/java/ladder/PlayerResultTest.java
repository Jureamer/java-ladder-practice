package ladder;

import ladder.domain.Participant;
import ladder.domain.PlayerResult;
import ladder.domain.ResultForParticipant;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;

public class PlayerResultTest {

    private PlayerResult playerResult;
    @BeforeEach

    void setUp() {
        List<ResultForParticipant> results = List.of(
                new ResultForParticipant("pobi", "꽝"),
                new ResultForParticipant("crong", "꽝"),
                new ResultForParticipant("honux", "당첨")
        );
        playerResult = new PlayerResult(results);
    }
    @Test
    void 참가자들의_결과를_생성한다() {
        assertThat(playerResult).isNotNull();
    }

    @Test
    void 이름으로_결과를_조회한다() {
        assertThat(playerResult.getResultByName("pobi")).isEqualTo("꽝");
        assertThat(playerResult.getResultByName("crong")).isEqualTo("꽝");
        assertThat(playerResult.getResultByName("honux")).isEqualTo("당첨");
    }

    @Test
    void 이름과_결과를_모두_조회한다() {
        assertThat(playerResult.getPlayerResult()).hasSize(3);
        assertThat(playerResult.getPlayerResult().get(0).getName()).isEqualTo("pobi");
        assertThat(playerResult.getPlayerResult().get(0).getResult()).isEqualTo("꽝");
        assertThat(playerResult.getPlayerResult().get(1).getName()).isEqualTo("crong");
    }
}
