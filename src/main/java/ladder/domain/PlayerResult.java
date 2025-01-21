package ladder.domain;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class PlayerResult {
    private List<ResultForParticipant> results = new ArrayList<>();

    public PlayerResult(List<ResultForParticipant> results) {
        this.results = results;
    }

    public String getResultByName(String name) {
        return results.stream()
                .filter(result -> result.getName().equals(name))
                .findFirst()
                .orElseThrow(() -> new IllegalArgumentException("참여자(" + name + ")가 존재하지 않습니다."))
                .getResult();
    }

    public List<ResultForParticipant> getParticipantResults() {
        return results;
    }

    public List<ResultForParticipant> getPlayerResult() {
        return results;
    }
}