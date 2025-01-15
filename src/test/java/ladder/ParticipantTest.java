package ladder;

import ladder.domain.Participant;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class ParticipantTest {
    @Test
    void 참가자를_생성한다() {
        Participant participant = new Participant("pobi");
        assertThat(participant).isNotNull();
    }

    @Test
    void 참가자의_이름을_가져온다() {
        Participant participant = new Participant("pobi");
        assertThat(participant.getName()).isEqualTo("pobi");
    }
}
