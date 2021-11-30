package resources.interfaces;

import resources.components.Cell;

public interface ILink {
    void set(int index, Cell cell);
    Cell get(int index) throws Exception;
}
