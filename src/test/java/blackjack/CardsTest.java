package blackjack;

import static org.assertj.core.api.Assertions.assertThat;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class CardsTest {

    @Test
    @DisplayName("비어 있는 카드 리스트 생성한다.")
    void createEmptyCards(){
        Cards cards = new Cards();
        assertThat(cards.isEmpty()).isTrue();
    }

    @Test
    @DisplayName("카드가 들어 있는 리스트를 생성한다.")
    void createCards() {
        List<Card> deck = new ArrayList<>(Arrays.asList(
            new Card(Denomination.THREE,Suit.SPADE),
            new Card(Denomination.SEVEN,Suit.DIAMOND)
        ));
        Cards cards = new Cards(deck);
        assertThat(cards).isEqualTo(new Cards(deck));
    }

    @Test
    @DisplayName("리스트에 든 카드를 보여준다.")
    void showOne(){
        List<Card> deck = new ArrayList<>(Collections.singletonList(new Card(Denomination.THREE,Suit.SPADE)));
        Cards cards = new Cards(deck);
        assertThat(cards.showCards()).isEqualTo("3스페이드");

        List<Card> deck2 = new ArrayList<>(Collections.singletonList(new Card(Denomination.SEVEN,Suit.DIAMOND)));
        Cards cards2 = new Cards(deck2);
        assertThat(cards2.showCards()).isEqualTo("7다이아몬드");

    }

    @Test
    @DisplayName("리스트에 든 카드들을 보여준다.")
    void show(){
        List<Card> deck = new ArrayList<>(Arrays.asList(
            new Card(Denomination.SEVEN,Suit.SPADE),
            new Card(Denomination.THREE,Suit.DIAMOND)
        ));
        Cards cards = new Cards(deck);

        assertThat(cards.showCards()).isEqualTo("7스페이드, 3다이아몬드");
    }

}
