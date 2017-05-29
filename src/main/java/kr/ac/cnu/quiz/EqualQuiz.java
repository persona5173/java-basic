package kr.ac.cnu.quiz;

/**
 * Created by rokim on 2017. 5. 25..
 */
public class EqualQuiz extends Object {
    private int i;

    public EqualQuiz(int i) {
        this.i = i;
    }

    public int getI() {
        return i;
    }

    public void setI(int i) {
        this.i = i;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj instanceof EqualQuiz) {
            return this.i == ((EqualQuiz)obj).getI();
        }

        return false;
    }
}
