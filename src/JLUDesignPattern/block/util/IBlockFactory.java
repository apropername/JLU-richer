package JLUDesignPattern.block.util;

import JLUDesignPattern.block.Block;

public interface IBlockFactory {
    Block createBlock(BlockType type);
}
