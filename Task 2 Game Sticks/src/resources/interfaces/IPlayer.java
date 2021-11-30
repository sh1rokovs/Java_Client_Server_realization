package resources.interfaces;

import resources.components.Cell;
import resources.components.Link;

public interface IPlayer {
    Link findLink(Cell cell) throws Exception;
}
