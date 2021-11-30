package resources.types;

public enum CellType {
    EMPTY('*'), CROSS('X'), CIRCLE('O');
    private final char type;
    CellType(char type) {
        this.type = type;
    }

    public char getType() {
        return type;
    }
}
