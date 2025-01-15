package ladder;

import ladder.domain.Participant;
import ladder.domain.Participants;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;

public class ParticipantsTest {
    @Test
    void 참가자들을_문자열로_생성한다() {
        Participants participants = new Participants("pobi, test");
        assertThat(participants.size()).isEqualTo(2);
    }

    @Test
    void 참가자들을_객체로_생성한다() {
        Participant participant = new Participant("pobi");
        Participant participant2 = new Participant("test");

        Participants participants = new Participants(List.of(participant, participant2));
        assertThat(participants.size()).isEqualTo(2);
        assertThat(participants.getParticipants().get(0).getName()).isEqualTo("pobi");
    }
}
