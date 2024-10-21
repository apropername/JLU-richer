package JLUDesignPattern.map.util;

import JLUDesignPattern.block.util.IBlockFactory;
import JLUDesignPattern.map.Map;

public interface IMapFactory {
    Map createMap(MapID id, IBlockFactory fac );
}
