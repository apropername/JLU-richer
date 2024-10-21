package JLUDesignPattern.map.util;

import JLUDesignPattern.block.util.IBlockFactory;
import JLUDesignPattern.map.Map;

public enum MapMgr {
    // protected:
    //    MapMgr( ) = default;
    INSTANCE;
    private Map mCurMap=null;
    public Map activedMap( ) { return mCurMap; }
    // 建立给定编号的地图，MapFactory中的Block，由blockFac负责创建
    public void setActiveMap( MapID mapID, IMapFactory  mapFac,IBlockFactory blockFac ){
        Map map = mapFac.createMap( mapID, blockFac );
        mCurMap =map;
    }
}
