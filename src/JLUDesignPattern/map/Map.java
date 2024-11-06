package JLUDesignPattern.map;

import JLUDesignPattern.IO;
import JLUDesignPattern.block.Block;

import java.util.ArrayList;
import java.util.List;

public  class Map implements IMap {
    private List<Block> mBlocks=new ArrayList<>();
    public List<Block> getBlocks() {return mBlocks;}//ArrayList is closest
    public Block getBlockByIndex( int index )  { return mBlocks.get(index); }
    public void addBlock( Block p ) { mBlocks.add( p ); }

    @Override
    public void show() {
    //决定坐标/布局 如何表现，在终端控制台上就是 打印空白符.todo 因为在 输出流打印 所以耦合mBlocks所存有从左到右且从上到下的顺序，可以做排序来消除耦合
        IO.print("\n" );
        int lastX = 1;
        int lastY = 0;
        for ( var block : mBlocks ) {
            int curX = block.getX( );
            int curY = block.getY( );
            while ( lastY < curY ) {IO.print("\n\t"); ++lastY; lastX = 1; }
            while ( lastX < curX ) {
                IO.print("   ");
                ++lastX;
            }
            block.draw( );
            lastX = curX + 1;
        }
        IO.print("\n\n" );
    }
}
