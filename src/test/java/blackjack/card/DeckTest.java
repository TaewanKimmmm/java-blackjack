package blackjack.card;

import blackjack.domain.card.Card;
import blackjack.domain.card.Deck;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class DeckTest {

    @DisplayName("덱을 생성한다.")
    @Test
    void createDeck() {
        Deck deck = new Deck(Card.values());
        assertThat(deck).isEqualTo(new Deck(Card.values()));
    }
}
