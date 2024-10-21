package JLUDesignPattern.map;

import JLUDesignPattern.block.Block;

import java.util.ArrayList;

public  class Map implements IMap {
    private ArrayList<Block> mBlocks=new ArrayList<>();
    public ArrayList<Block> getBlocks() {return mBlocks;}//ArrayList is closest
    public Block getBlockByIndex( int index )  { return mBlocks.get(index); }
    public void addBlock( Block p ) { mBlocks.add( p ); }

    @Override
    public void show() {
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
