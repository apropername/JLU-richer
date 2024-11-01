package JLUDesignPattern.block.util;

import JLUDesignPattern.block.*;

public enum BlockFactory implements IBlockFactory {
    INSTANCE;
    @Override
    public Block createBlock(BlockType type) {
        return switch (type) {
            case NORMAL_BLOCK -> new NormalBlock();
            case MONEY_BLOCK -> new MoneyBlock();
            case TRIP_BLOCK -> new TripBlock();
            case BAR_BLOCK -> new BarBlock();
            case null, default -> {
                assert false;
                yield null;//TODO :semantic : return switch & yield ?
            }
        };
    }
}
