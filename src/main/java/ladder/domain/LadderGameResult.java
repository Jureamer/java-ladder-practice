package ladder.domain;

import java.util.List;
import java.util.stream.Collectors;

public class LadderGameResult {
    private final String DELIMITER = ",";
    private List<String> results;

    public LadderGameResult(String s, int size) {
        String[] splitedString = s.split(DELIMITER);
        checkValidation(splitedString, size);
        results = List.of(splitedString).stream()
                .map(String::strip)
                .collect(Collectors.toList());
    }

    private void checkValidation(String[] splitedString, int size) {
        if (splitedString.length != size) {
            throw new IllegalArgumentException("결과의 개수가 참가자의 수와 다릅니다.");
        }
    }

    public String getResultByIndex(int index) {
        return results.get(index);
    }
}
