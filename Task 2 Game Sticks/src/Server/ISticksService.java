package Server;

import resources.components.Board;
import resources.components.Player;

import java.rmi.Remote;
import java.rmi.RemoteException;

public interface ISticksService extends Remote {
    Player addPlayer(String name) throws RemoteException;

    boolean isMyTurn(Player player) throws RemoteException;

    boolean isGameOver() throws RemoteException;

    Board getBoard() throws RemoteException;

    void setPlayerNewLink(Player player, String move) throws Exception;
}
