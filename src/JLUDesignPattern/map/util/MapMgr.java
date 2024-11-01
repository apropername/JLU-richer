package JLUDesignPattern.map.util;

import JLUDesignPattern.block.util.IBlockFactory;
import JLUDesignPattern.map.Map;

public enum MapMgr {
    // protected:
    //    MapMgr( ) = default;
    INSTANCE;
    public static MapMgr getInstance(){return INSTANCE;}//之前用枚举代替文档中的模板实现单例，都是直接调用INSTANCE，从此处开始为了与文档保持接口一致 增加该方法
    private Map mCurMap=null;
    public Map activedMap( ) { return mCurMap; }
    // 建立给定编号的地图，MapFactory中的Block，由blockFac负责创建
    public void setActiveMap( MapID mapID, IMapFactory  mapFac,IBlockFactory blockFac ){
        Map map = mapFac.createMap( mapID, blockFac );
        mCurMap =map;
    }
}
