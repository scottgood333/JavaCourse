package hw1;

public class Round {
    int ball_1 = 0;
    int ball_2 = 0;
    int ball_3 = 0;
    int sum = 0;
    boolean isStrike = false;
    boolean isSpare = false;

    Round() {

    }

    public void setScore(int ball_1) {
        this.ball_1 = ball_1;
        this.sum = this.ball_1;
        setSum();
        setState();
    }

    public void setScore(int ball_1, int ball_2) {
        this.ball_1 = ball_1;
        this.ball_2 = ball_2;
        setSum();
        setState();
    }

    public void setScore(int ball_1, int ball_2, int ball_3) {
        this.ball_1 = ball_1;
        this.ball_2 = ball_2;
        this.ball_3 = ball_3;
        setSum();
        setState();
    }

    public void setState() {
        if (this.ball_1 == 10) {
            this.isSpare = false;
            this.isStrike = true;
        } else if ((this.ball_1 + this.ball_2) == 10) {
            this.isSpare = true;
            this.isStrike = false;
        } else {
            this.isSpare = false;
            this.isStrike = false;
        }
    }

    public void setSum() {
        this.sum = this.ball_1 + this.ball_2 + this.ball_3;
    }
}
