package resources.components;

import resources.interfaces.ILink;

import java.io.Serializable;

public class Link implements ILink, Serializable {
    private final Cell[] link = new Cell[2];

    public Link(Cell initialCell) {
        this.link[0] = initialCell;
    }

    public Cell[] getLink() {
        return link;
    }

    private boolean isRightIndex(int index) {
        return index >= 0 && index < 2;
    }

    @Override
    public void set(int index, Cell cell) {
        if (isRightIndex(index)) {
            this.link[index] = cell;
        }
    }

    @Override
    public Cell get(int index) throws Exception {
        if (isRightIndex(index)) {
            return this.link[index];
        }

        throw new Exception("Out of length");
    }
}
