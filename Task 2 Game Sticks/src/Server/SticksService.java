package Server;

import resources.components.Board;
import resources.components.Player;
import resources.types.CellType;
import resources.types.PlayerType;

import java.rmi.RemoteException;
import java.util.ArrayList;

public class SticksService implements ISticksService {
    private Board board;
    private ArrayList<Player> players;
    private Player currentPlayer;
    private static final int MAX_PLAYERS = 2;

    @Override
    public Board getBoard() {
        return board;
    }

    public SticksService(int boardSize) throws RemoteException {
        super();
        try {
            this.board = new Board(boardSize);
            this.players = new ArrayList<>(2);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @Override
    public Player addPlayer(String name) throws RemoteException {
        if (this.players.size() == MAX_PLAYERS) {
            throw new RemoteException("Подключено максимальное количество игроков!");
        } else {
            PlayerType type = this.players.size() == 0 ? PlayerType.CROSS : PlayerType.CIRCLE;
            Player player = new Player(name, type, this.board.getSize() * 2);
            if (players.size() == 0) {
                currentPlayer = player;
            }
            players.add(player);
            return player;
        }
    }

    @Override
    public boolean isMyTurn(Player player) throws RemoteException {
        return currentPlayer.equals(player) && players.size() > 1;
    }

    @Override
    public boolean isGameOver() {
        return false;
    }

    private int getCurrentPlayerIndex(Player player) {
        for (int playerIndex = 0; playerIndex < players.size(); playerIndex++) {
            if (players.get(playerIndex).equals(player)) {
                return playerIndex;
            }
        }

        return -1;
    }

    private void toggleCurrentPlayer(Player player) {
        for (Player pl : players) {
            if (!pl.equals(player)) {
                currentPlayer = pl;
            }
        }
    }

    @Override
    public void setPlayerNewLink(Player player, String move) throws Exception {
        int parsedMove = Integer.parseInt(move);
        int row = parsedMove / 10;
        int col = parsedMove % 10;

        if (isRightPlace(row, col)) {
            int playerIndex = getCurrentPlayerIndex(player);
            Player movingPlayer = players.get(playerIndex);
            CellType type = movingPlayer.getType() == PlayerType.CROSS ? CellType.CROSS : CellType.CIRCLE;
            this.board.setCell(row, col, type);
            toggleCurrentPlayer(player);
        } else {
            throw new Exception("Неверное место");
        }
    }

    private boolean isRightPlace(int row, int col) {
        int maxSize = this.board.getSize();
        return row >= 0 && col >= 0 && row < maxSize && col < maxSize;
    }
}

