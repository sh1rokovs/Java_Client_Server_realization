package resources.components;

import resources.interfaces.IPlayer;
import resources.types.PlayerType;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Random;

public class Player implements IPlayer, Serializable {
    private String id;
    private final String name;
    private final PlayerType type;
    private ArrayList<Link> links;

    public void setId(String id) {
        this.id = id;
    }

    public String getId() {
        return id;
    }

    @Override
    public boolean equals(Object obj) {
        Player player = (Player) obj;
        return this.id.equals(player.id);
    }

    public Player(String name, PlayerType type, int linksMaxSize) {
        this.name = name;
        this.type = type;
        this.links = new ArrayList<>(linksMaxSize);
        this.id = new Random() + name;
    }

    public void setLinks(ArrayList<Link> links) {
        this.links = links;
    }

    public String getName() {
        return name;
    }

    public PlayerType getType() {
        return type;
    }

    public ArrayList<Link> getLinks() {
        return links;
    }

    @Override
    public Link findLink(Cell cell) throws Exception {
        for (Link link : links) {
            if (link.get(0).equals(cell) || link.get(1).equals(cell)) {
                return link;
            }
        }

        throw new Exception("Link не найден");
    }
}
