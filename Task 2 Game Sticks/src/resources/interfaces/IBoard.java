package resources.interfaces;

import resources.components.Cell;
import resources.components.Player;
import resources.types.CellType;

import java.util.ArrayList;

public interface IBoard {
    void printBoard();
    Cell getCell(int row, int col);
    void setCell(int row, int col, CellType type);
}
