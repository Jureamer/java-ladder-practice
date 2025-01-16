package ladder.domain;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Participants {
    private List<Participant> participants = new ArrayList<>();
    private final String DELIMITER = ",";
    private final int MIN_PARTICIPANTS = 2;
    private final int MAX_PARTICIPANTS = 10;

    public Participants(String participants) {
        String[] names = participants.split(DELIMITER);
        checkValidation(names.length);

        Arrays.stream(names)
                .forEach(name -> this.participants.add(new Participant(name.strip())));
    }

    public Participants(List<Participant> participants) {
        checkValidation(participants.size());
        this.participants = participants;
    }

    private void checkValidation(int length) {
        if (length > MAX_PARTICIPANTS || length < MIN_PARTICIPANTS) {
            throw new IllegalArgumentException("참여자는 " + MIN_PARTICIPANTS + " 이상 " + MAX_PARTICIPANTS + " 이하만 가능합니다.");
        }
    }

    public int size() {
        return participants.size();
    }

    public List<Participant> getParticipants() {
        return participants;
    }

    public List<String> getNames() {
        return participants.stream()
                .map(Participant::getName)
                .collect(Collectors.toList());
    }
}
