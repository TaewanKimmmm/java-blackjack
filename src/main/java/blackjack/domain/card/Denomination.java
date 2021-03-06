package blackjack.domain.card;

public enum Denomination {
    ACE(1, "A"),
    TWO(2),
    THREE(3),
    FOUR(4),
    FIVE(5),
    SIX(6),
    SEVEN(7),
    EIGHT(8),
    NINE(9),
    JACK(10, "J"),
    QUEEN(10, "Q"),
    KING(10, "K");

    private final int score;
    private final String denomination;

    Denomination(int score) {
        this(score, String.valueOf(score));
    }

    Denomination(int score, String denomination) {
        this.score = score;
        this.denomination = denomination;
    }

    public boolean isAce() {
        return this == ACE;
    }

    public String getDenomination() {
        return denomination;
    }

    public int getScore() {
        return score;
    }
}
