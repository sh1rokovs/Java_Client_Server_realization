package resources.components;

import resources.interfaces.ICell;
import resources.types.CellType;

import java.io.Serializable;

public class Cell implements ICell, Serializable {
    private final int rowNumber;
    private final int columnNumber;
    private CellType type;

    public void setType(CellType type) {
        this.type = type;
    }

    public CellType getType() {
        return type;
    }

    public int getRowNumber() {
        return rowNumber;
    }

    public int getColumnNumber() {
        return columnNumber;
    }

    @Override
    public boolean equals(Object obj) {
        Cell cell = (Cell) obj;
        return this.columnNumber == cell.getColumnNumber() && this.rowNumber == cell.getRowNumber();
    }

    public Cell(int rowNumber, int columnNumber, CellType type) {
        this.rowNumber = rowNumber;
        this.columnNumber = columnNumber;
        this.type = type;
    }
}
