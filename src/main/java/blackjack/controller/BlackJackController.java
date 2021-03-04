package blackjack.controller;

import blackjack.domain.GameTable;
import blackjack.domain.user.Player;
import blackjack.view.InputView;
import blackjack.view.OutputView;

import java.util.List;
import java.util.stream.Collectors;

public class BlackJackController {
    private static final String PLAYER_COUNT_ERROR_MESSAGE = "플레이어 수는 1명 이상이어야 합니다.";

    public void run() {
        try {
            OutputView.printPlayersGuideMessage();
            List<Player> players = makePlayers(InputView.inputPlayers());
            validatePlayersNumber(players);
            GameTable gameTable = new GameTable(players);
            gameTable.playGame();
        } catch (IllegalArgumentException exception) {
            OutputView.printErrorMessage(exception);
        }
    }

    private void validatePlayersNumber(List<Player> players) {
        if (players.size() < 1) {
            throw new IllegalArgumentException(PLAYER_COUNT_ERROR_MESSAGE);
        }
    }

    private List<Player> makePlayers(List<String> inputPlayers) {
        return inputPlayers.stream().map(Player::new).collect(Collectors.toList());
    }
}
