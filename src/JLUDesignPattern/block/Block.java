package JLUDesignPattern.block;

import JLUDesignPattern.IO;
import JLUDesignPattern.Player.util.Dir;
import JLUDesignPattern.Player.Player;
import JLUDesignPattern.Player.util.PlayerMgr;

import java.util.ArrayList;
import java.util.Objects;

import static JLUDesignPattern.Player.util.Dir.LEFT;
import static JLUDesignPattern.Player.util.Dir.RIGHT;

public abstract class Block implements IBlock , Cloneable {
    public int getX( )  { return mX; }
    public int getY( )  { return mY; }
    public void setXY( int x, int y ) { mX = x; mY = y; }
    @Override
    final public void draw() {//final标识与文档差异
        Player player = PlayerMgr.getInstance().findPlayerOnBlock( this );
        if( player==null ) {
            IO.print( " " );
            IO.print(content());
            IO.print( " " );
        }// 无Player站
        else { //不同Player，显示不同的字符标记
            IO.print(player.flagChar( LEFT ));
            IO.print(content());
            IO.print(player.flagChar( RIGHT ));
        }
    }

    public Block clone( ) throws CloneNotSupportedException {//todo 函数体内try throw catch 和签名上throws有什么不同
        Block clone = (Block) super.clone();
        clone.mNeighbors = new Block[ Dir.TOTAL_COUNT ];
        /*
        for ( var pB : clone.mNeighbors )//这下体会到对象可互相访问的方便了
        {pB = null;}
        */

        //X，Y之后都会被set
        return clone;
    }

    abstract protected char content();

    // 左，上，右，下，的邻居
    public Block  getNeighbor( Dir d ) {
        if ( d == Dir.UNKNOWN ) return null;
        return mNeighbors[ d.ordinal() ];
    }

    public void setNeightbor(Dir d, Block b) {
        if ( d == Dir.UNKNOWN ) return;
        mNeighbors[d.ordinal()] = b;
    }

    private int mX;
    private int mY;
    private Block[]  mNeighbors=new Block[ Dir.TOTAL_COUNT ];//no final?

    // 辅助（可选）
    public boolean isLinked( Dir d )
    {
        if (d == Dir.UNKNOWN) return false;
        return mNeighbors[d.ordinal()] != null;
    }
}
