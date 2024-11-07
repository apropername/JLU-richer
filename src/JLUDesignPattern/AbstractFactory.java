package JLUDesignPattern;

import JLUDesignPattern.block.util.IBlockFactory;
import JLUDesignPattern.map.util.IMapFactory;
import JLUDesignPattern.menu.util.IMenuFactory;

public interface AbstractFactory extends IBlockFactory, IMapFactory, IMenuFactory {
}
