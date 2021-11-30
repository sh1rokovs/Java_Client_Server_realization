package resources.types;

public enum PlayerType {
    CROSS('X'), CIRCLE('O');
    private final char type;

    PlayerType(char type) {
        this.type = type;
    }

    public char getType() {
        return type;
    }
}
