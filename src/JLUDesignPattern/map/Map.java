package JLUDesignPattern.map;

import JLUDesignPattern.block.Block;

import java.util.ArrayList;

public  class Map implements IMap {
    private ArrayList<Block> mBlocks=new ArrayList<>();//todo:compare to List<> declare?
    public ArrayList<Block> getBlocks() {return mBlocks;}//ArrayList is closest
    public Block getBlockByIndex( int index )  { return mBlocks.get(index); }
    public void addBlock( Block p ) { mBlocks.add( p ); }

    @Override
    public void show() {
    //决定坐标如何表现，在终端控制台上就是 打印空白符.应该是耦合了地图模板要求mBlocks从前到后只能是 向下或向右
            System.out.println();
            int lastX = 1;
            int lastY = 0;
            for ( var block : mBlocks ) {
                int curX = block.getX( );
                int curY = block.getY( );
                while ( lastY < curY ) {System.out.print("\n\t"); ++lastY; lastX = 1; }
                while ( lastX < curX ) {
                    System.out.print("   ");
                    ++lastX;
                }
                block.draw( );
                lastX = curX + 1;
            }
        System.out.println();
        System.out.println();
    }
}
