package JLUDesignPattern.map.util;

import JLUDesignPattern.Player.util.Dir;
import JLUDesignPattern.block.Block;
import JLUDesignPattern.block.util.BlockType;
import JLUDesignPattern.block.util.IBlockFactory;
import JLUDesignPattern.map.Map;

import java.util.List;

public enum MapFactory implements IMapFactory {
    INSTANCE;
    public Map myCreateMap(List<List<Integer>> mapData, IBlockFactory fac) {
        Map map = new Map( );
        final var enumValues=BlockType.class.getEnumConstants();//todo:想不这么麻烦只能改变data容器声明的类型
        for ( var row : mapData ) {
            Block b = fac.createBlock(enumValues[row.get(1)]);
            b.setXY(row.get(7), row.get(8));
            map.addBlock( b );
        }
        // 遍历各Blcok，并指定邻居
        for ( var row : mapData ) {
            //由于是push_back存入vector，所以index就是创建的顺序
            int index = row.get(0) - 1;   // Blocks在Map中的序号
            Block  center = map.getBlockByIndex(index); //中心Blcok
            Block  neighbor = null;
            //左邻居
            neighbor = row.get(2) > 0 ? map.getBlockByIndex( row.get(2) - 1 ):null;
            center.setNeightbor( Dir.LEFT, neighbor );
            //右邻居
            neighbor = row.get(3) > 0 ? map.getBlockByIndex( row.get(3) - 1 ) :
                    null;
            center.setNeightbor( Dir.RIGHT, neighbor );
            //上邻居
            neighbor = row.get(4) > 0 ? map.getBlockByIndex( row.get(4) - 1 ) :
                    null;
            center.setNeightbor( Dir.UP, neighbor );
            //下邻居
            neighbor = row.get(5) > 0 ? map.getBlockByIndex( row.get(5) - 1 ) :
                    null;
            center.setNeightbor( Dir.DOWN, neighbor );
        }
        return map;
    }
    private MapDataSelector mapDataSelector;//因为实在不适合遵循文档使用建造者模式，所以将容易变化的 分支选择地图数据 分离到单独一个类中，当新增地图数据时则继承之并重写selectDataByID
    public void setMapDataSelector(MapDataSelector mapDataSelector) {
        this.mapDataSelector = mapDataSelector;
    }

    @Override//尽力不修改接口，所以下面这个函数看上去才这么没必要
    public Map createMap(MapID id, IBlockFactory fac) {//MapID相当于地图的模板即每个地块的位置 ，IBlockFactory决定了最终每个地块被怎样表示
        //这个方法的作用就是按照参数生成并排列地块、形成地图
        assert mapDataSelector != null;
        return myCreateMap(mapDataSelector.selectDataByID(id),fac);
    }
}
