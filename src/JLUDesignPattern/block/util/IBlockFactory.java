package JLUDesignPattern.block.util;

import JLUDesignPattern.Player.Player;
import JLUDesignPattern.block.Block;

public interface IBlockFactory {
    Block createBlock(BlockType type);
}
