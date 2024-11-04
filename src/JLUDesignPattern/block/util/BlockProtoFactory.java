package JLUDesignPattern.block.util;

import JLUDesignPattern.block.*;

import java.util.ArrayList;

public enum BlockProtoFactory implements IBlockFactory{
    INSTANCE;
    public static BlockProtoFactory getInstance(){
        return INSTANCE;
    }
    BlockProtoFactory() {//默认private
        mProtoBlocks.add(new NormalBlock());
        mProtoBlocks.add(new MoneyBlock());
        mProtoBlocks.add(new TripBlock());
        mProtoBlocks.add(new BarBlock());
    }

    public void changePrototype(BlockType type, Block sample) {
        mProtoBlocks.set(type.ordinal(), sample);
    }
    @Override
    public Block createBlock(BlockType type) {
        try {
            return mProtoBlocks.get(type.ordinal()).clone();
        } catch (CloneNotSupportedException e) {
            throw new RuntimeException(e);
        }
    }
    private ArrayList<Block> mProtoBlocks=new ArrayList<>(BlockType.TOTAL_COUNT);
}
