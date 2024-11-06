package JLUDesignPattern.map.util;

import java.util.List;

import static JLUDesignPattern.block.util.BlockType.NORMAL_BLOCK;

public class MapDataSelectorTest extends MapDataSelector{
    static final List<List<Integer>> NEWData = List.of(
            //data格式, 例如口字形，共8个Block
            // 每行  {   ID  type,    Left, Right, Up,Down, IniValue, posX, posY}
            List.of(1, NORMAL_BLOCK.ordinal(), 0, 0, 0, 0, 0, 1, 1));
    @Override
    public List<List<Integer>> selectDataByID(MapID id) {
        return switch (id) {
            case TOWN_MAP->TOWN_MAPData;//经过测试，静态成员完全拷贝基类的引用，指向同一对象。所以继续使用static定义Data即可。
            case CITY_MAP->CITY_MAPData;
            case TEST->NEWData;
        };
    }
}
