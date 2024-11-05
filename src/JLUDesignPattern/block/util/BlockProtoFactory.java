package JLUDesignPattern.block.util;

import JLUDesignPattern.block.*;

import java.util.ArrayList;

public enum BlockProtoFactory implements IBlockFactory{
    INSTANCE;
    public static BlockProtoFactory getInstance(){
        return INSTANCE;
    }
    BlockProtoFactory() {//enum构造器默认private
        mProtoBlocks.add(new NormalBlock());//现在只是采用口头约定确保A按照与类型枚举的一致顺序插入样本。todo 可以将样本容器mProtoBlocks也改成 类型与对象的映射
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
