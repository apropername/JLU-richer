package JLUDesignPattern.block;

import JLUDesignPattern.Player.Dir;
import JLUDesignPattern.Player.Player;
import JLUDesignPattern.Player.PlayerMgr;
import JLUDesignPattern.map.util.MapMgr;

import static JLUDesignPattern.Player.Dir.LEFT;
import static JLUDesignPattern.Player.Dir.RIGHT;

public abstract class Block implements IBlock {
    private int mX;
    private int mY;
    private Block[]  mNeighbors=new Block[ Dir.TOTAL_COUNT ];//no final?

    public int getX( )  { return mX; }
    public int getY( )  { return mY; }
    public void setXY( int x, int y ) { mX = x; mY = y; }
    @Override
    public void draw() {
        Player player = PlayerMgr.getInstance().findPlayerOnBlock( this );
        if( player==null ) { drawText();}// 无Player站
        else { //不同Player，显示不同的字符标记
            System.out.print(player.flagChar( LEFT ));
            drawText();
            System.out.print(player.flagChar( RIGHT ));
        }
    }
    abstract public void drawText();

    // 左，上，右，下，的邻居
    public Block  getNeighbor( Dir d ) {
        if ( d == Dir.UNKNOWN ) return null;
        return mNeighbors[ d.ordinal() ];
    }

    public void setNeightbor(Dir d, Block b) {
        if ( d == Dir.UNKNOWN ) return;
        mNeighbors[d.ordinal()] = b;
    }

    /*
    public: // 辅助（可选）
    bool isLinked( Dir::Direction d ) const
    {
        if (d == Dir::UNKNOWN) return false;
        return mNeighbors[d];
    }*/
}
