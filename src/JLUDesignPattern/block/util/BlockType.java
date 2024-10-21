package JLUDesignPattern.block.util;

public enum BlockType {
    NORMAL_BLOCK,
    MONEY_BLOCK,
    TRIP_BLOCK,
    BAR_BLOCK;
    public static final int TOTAL_COUNT=BlockType.values().length;
}
//TODO: TOTAL_COUNT = Type::BAR_BLOCK + 1