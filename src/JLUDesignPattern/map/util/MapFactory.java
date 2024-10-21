package JLUDesignPattern.map.util;

import static JLUDesignPattern.block.util.BlockType.*;
import JLUDesignPattern.block.Block;
import JLUDesignPattern.block.util.BlockType;
import JLUDesignPattern.block.util.IBlockFactory;
import JLUDesignPattern.map.Map;

import java.util.Arrays;
import java.util.List;

public enum MapFactory implements IMapFactory {
    INSTANCE;
    // = default   protected MapFactory( ){}
    static final List<List<Integer>> TOWN_MAPdata = Arrays.asList(
            //data格式, 例如口字形，共8个Block
            // 每行  {   ID  type,    Left, Right, Up,Down, IniValue, posX, posY}
            Arrays.asList(1, NORMAL_BLOCK.ordinal(), 0, 2, 0, 4, 0, 1, 1),
            Arrays.asList(2, NORMAL_BLOCK.ordinal(), 1, 3, 0, 0, 0, 2, 1),
            Arrays.asList(3, NORMAL_BLOCK.ordinal(), 2, 0, 0, 5, 0, 3, 1),
            Arrays.asList(4, NORMAL_BLOCK.ordinal(), 0, 0, 1, 6, 0, 1, 2),
            Arrays.asList(5, NORMAL_BLOCK.ordinal(), 0, 0, 3, 8, 0, 3, 2),
            Arrays.asList(6, NORMAL_BLOCK.ordinal(), 0, 7, 4, 0, 0, 1, 3),
            Arrays.asList(7, NORMAL_BLOCK.ordinal(), 6, 8, 0, 0, 0, 2, 3),
            Arrays.asList(8, NORMAL_BLOCK.ordinal(), 7, 0, 5, 0, 0, 3, 3)
    );
    static final List<List<Integer>> CITY_MAPdata = Arrays.asList(
            Arrays.asList(1, MONEY_BLOCK.ordinal(), 0, 2, 0, 6, 0, 1, 1),
            Arrays.asList(2, MONEY_BLOCK.ordinal(), 1, 3, 0, 0, 0, 2, 1),
            Arrays.asList(3, MONEY_BLOCK.ordinal(), 2, 4, 0, 7, 0, 3, 1),
            Arrays.asList(4, MONEY_BLOCK.ordinal(), 3, 5, 0, 0, 0, 4, 1),
            Arrays.asList(5, MONEY_BLOCK.ordinal(), 4, 0, 0, 8, 0, 5, 1),
            Arrays.asList(6, NORMAL_BLOCK.ordinal(), 0, 0, 1, 9, 0, 1, 2),
            Arrays.asList(7, NORMAL_BLOCK.ordinal(), 0, 0, 3, 11, 0, 3, 2),
            Arrays.asList(8, NORMAL_BLOCK.ordinal(), 0, 0, 5, 13, 0, 5, 2),
            Arrays.asList(9, BAR_BLOCK.ordinal(), 0, 10, 6, 14, 0, 1, 3),
            Arrays.asList(10, BAR_BLOCK.ordinal(), 9, 11, 0, 0, 0, 2, 3),
            Arrays.asList(11, BAR_BLOCK.ordinal(), 10, 12, 7, 15, 0, 3, 3),
            Arrays.asList(12, BAR_BLOCK.ordinal(), 11, 13, 0, 0, 0, 4, 3),
            Arrays.asList(13, BAR_BLOCK.ordinal(), 12, 0, 8, 16, 0, 5, 3),
            Arrays.asList(14, TRIP_BLOCK.ordinal(), 0, 0, 9, 17, 0, 1, 4),
            Arrays.asList(15, TRIP_BLOCK.ordinal(), 0, 0, 11, 19, 0, 3, 4),
            Arrays.asList(16, TRIP_BLOCK.ordinal(),  0,  0,  13, 21,     0,  5,  4 ),
            Arrays.asList(17, MONEY_BLOCK.ordinal(), 0,  18, 14, 0,      0,  1,  5 ),
            Arrays.asList(18, MONEY_BLOCK.ordinal(), 17, 19, 0,  0,      0,  2,  5 ),
            Arrays.asList(19, MONEY_BLOCK.ordinal(), 18, 20, 15, 0,      0,  3,  5 ),
            Arrays.asList(20, MONEY_BLOCK.ordinal(), 19, 21, 0,  0,      0,  4,  5 ),
            Arrays.asList(21, MONEY_BLOCK.ordinal(), 20, 22, 16, 0,      0,  5,  5 ),
            Arrays.asList(22, MONEY_BLOCK.ordinal(), 21, 23, 0,  0,      0,  6,  5 ),
            Arrays.asList(23, MONEY_BLOCK.ordinal(), 22, 24, 0,  0,      0,  7,  5 ),
            Arrays.asList(24, MONEY_BLOCK.ordinal(), 23, 0,  0,  0,      0,  8,  5 )
            );
    @Override
    public Map createMap(MapID id, IBlockFactory fac) {
        List<List<Integer>> MAPdata;
        switch (id) {
            case TOWN_MAP:
                MAPdata = TOWN_MAPdata;
                break;
            case CITY_MAP:
                MAPdata = CITY_MAPdata;
                break;
            default:return null;
        }
        Map map = new Map( );
        final var enumValues=BlockType.class.getEnumConstants();//todo:想不这么麻烦只能改变data容器声明的类型
        for ( var row : MAPdata ) {
            Block b = fac.createBlock(enumValues[row.get(1)]);
            b.setXY(row.get(6), row.get(7));
            map.addBlock( b );
        }
        return map;
    }
}
