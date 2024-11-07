package JLUDesignPattern.map.util;

import JLUDesignPattern.block.util.IBlockFactory;
import JLUDesignPattern.map.Map;

import java.util.List;

import static JLUDesignPattern.block.util.BlockType.*;
import static JLUDesignPattern.block.util.BlockType.MONEY_BLOCK;

public enum MapMgr {
    INSTANCE;

    static final List<List<Integer>> TOWN_MAPData = java.util.List.of(
            //data格式, 例如口字形，共8个Block
            // 每行  {   ID  type,    Left, Right, Up,Down, IniValue, posX, posY}
            List.of(1, NORMAL_BLOCK.ordinal(), 0, 2, 0, 4, 0, 1, 1),
            List.of(2, NORMAL_BLOCK.ordinal(), 1, 3, 0, 0, 0, 2, 1),
            List.of(3, NORMAL_BLOCK.ordinal(), 2, 0, 0, 5, 0, 3, 1),
            List.of(4, NORMAL_BLOCK.ordinal(), 0, 0, 1, 6, 0, 1, 2),
            List.of(5, NORMAL_BLOCK.ordinal(), 0, 0, 3, 8, 0, 3, 2),
            List.of(6, NORMAL_BLOCK.ordinal(), 0, 7, 4, 0, 0, 1, 3),
            List.of(7, NORMAL_BLOCK.ordinal(), 6, 8, 0, 0, 0, 2, 3),
            List.of(8, NORMAL_BLOCK.ordinal(), 7, 0, 5, 0, 0, 3, 3)
            );
    final static List<List<Integer>> CITY_MAPData = java.util.List.of(
            java.util.List.of(1, MONEY_BLOCK.ordinal(), 0, 2, 0, 6, 0, 1, 1),
            java.util.List.of(2, MONEY_BLOCK.ordinal(), 1, 3, 0, 0, 0, 2, 1),
            java.util.List.of(3, MONEY_BLOCK.ordinal(), 2, 4, 0, 7, 0, 3, 1),
            java.util.List.of(4, MONEY_BLOCK.ordinal(), 3, 5, 0, 0, 0, 4, 1),
            java.util.List.of(5, MONEY_BLOCK.ordinal(), 4, 0, 0, 8, 0, 5, 1),
            java.util.List.of(6, NORMAL_BLOCK.ordinal(), 0, 0, 1, 9, 0, 1, 2),
            java.util.List.of(7, NORMAL_BLOCK.ordinal(), 0, 0, 3, 11, 0, 3, 2),
            java.util.List.of(8, NORMAL_BLOCK.ordinal(), 0, 0, 5, 13, 0, 5, 2),
            java.util.List.of(9, BAR_BLOCK.ordinal(), 0, 10, 6, 14, 0, 1, 3),
            java.util.List.of(10, BAR_BLOCK.ordinal(), 9, 11, 0, 0, 0, 2, 3),
            java.util.List.of(11, BAR_BLOCK.ordinal(), 10, 12, 7, 15, 0, 3, 3),
            java.util.List.of(12, BAR_BLOCK.ordinal(), 11, 13, 0, 0, 0, 4, 3),
            java.util.List.of(13, BAR_BLOCK.ordinal(), 12, 0, 8, 16, 0, 5, 3),
            java.util.List.of(14, TRIP_BLOCK.ordinal(), 0, 0, 9, 17, 0, 1, 4),
            java.util.List.of(15, TRIP_BLOCK.ordinal(), 0, 0, 11, 19, 0, 3, 4),
            java.util.List.of(16, TRIP_BLOCK.ordinal(),  0,  0,  13, 21,0,  5,  4 ),
            java.util.List.of(17, MONEY_BLOCK.ordinal(), 0,  18, 14, 0, 0,  1,  5 ),
            java.util.List.of(18, MONEY_BLOCK.ordinal(), 17, 19, 0,  0, 0,  2,  5 ),
            java.util.List.of(19, MONEY_BLOCK.ordinal(), 18, 20, 15, 0, 0,  3,  5 ),
            java.util.List.of(20, MONEY_BLOCK.ordinal(), 19, 21, 0,  0, 0,  4,  5 ),
            java.util.List.of(21, MONEY_BLOCK.ordinal(), 20, 22, 16, 0, 0,  5,  5 ),
            java.util.List.of(22, MONEY_BLOCK.ordinal(), 21, 23, 0,  0, 0,  6,  5 ),
            java.util.List.of(23, MONEY_BLOCK.ordinal(), 22, 24, 0,  0, 0,  7,  5 ),
            java.util.List.of(24, MONEY_BLOCK.ordinal(), 23, 0,  0,  0, 0,  8,  5 )
    );

    public static MapMgr getInstance(){return INSTANCE;}
    private Map mCurMap=null;
    public Map activedMap( ) { return mCurMap; }

    // 建立给定编号的地图、MapFactory中的Block由blockFac负责创建
    public void setActiveMap( MapID mapID, IMapFactory  mapFac,IBlockFactory blockFac ){
        switch (mapID) {
            case TOWN_MAP :
                mCurMap=mapFac.createMap(TOWN_MAPData, blockFac);
                break;
            case CITY_MAP :
                mCurMap=mapFac.createMap(CITY_MAPData, blockFac);
                break;
        }
    }
}
