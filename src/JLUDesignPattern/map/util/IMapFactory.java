package JLUDesignPattern.map.util;

import JLUDesignPattern.block.util.IBlockFactory;
import JLUDesignPattern.map.Map;

import java.util.List;

public interface IMapFactory {
    Map createMap(List<List<Integer>> mapData, IBlockFactory fac );
}
