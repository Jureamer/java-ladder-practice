package ladder.domain;

public class Line {
    private boolean rightSide;
    private boolean isRight;
    public static final String RIGHT_SIDE_EXCEPTION = "맨 오른쪽 라인은 생성할 수 없습니다.";

    public Line(boolean isRight, boolean rightSide) {
        checkValidation(isRight, rightSide);
        this.isRight = isRight;
        this.rightSide = rightSide;
    }

    private void checkValidation(boolean isRight, boolean rightSide) {
        if (isRight && rightSide) {
            throw new IllegalArgumentException(RIGHT_SIDE_EXCEPTION);
        }
    }

    public Line(boolean isRight) {
        this(isRight, false);
    }

    public Line() {
        this(false, false);
    }

    public boolean isRight() {
        return this.isRight;
    }

    public void draw() {
        if (this.rightSide) {
            throw new IllegalArgumentException(RIGHT_SIDE_EXCEPTION);
        }
        this.isRight = true;
    }

    public boolean isRightSide() {
        return this.rightSide;
    }
}
