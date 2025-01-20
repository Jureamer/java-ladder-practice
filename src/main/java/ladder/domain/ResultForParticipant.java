package ladder.domain;

import java.util.HashMap;
import java.util.Map;

public class ResultForParticipant {
    private Map<String, String> result = new HashMap<>();

    public ResultForParticipant(Participant participant, String result) {
        this(participant.getName(), result);
    }

    public ResultForParticipant(String name, String result) {
        this.result.put(name, result);
    }

    public String getResultByName(String name) {
        if (!result.containsKey(name)) {
            throw new IllegalArgumentException("참여자("  + name + ")가 존재하지 않습니다.");
        }
        return result.get(name);
    }

    public String getName() {
        return result.keySet().stream().findFirst().get();
    }

    public String getResult() {
        return result.values().stream().findFirst().get();
    }
}
