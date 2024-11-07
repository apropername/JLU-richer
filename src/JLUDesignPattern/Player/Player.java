package JLUDesignPattern.Player;

import JLUDesignPattern.Player.util.Dir;
import JLUDesignPattern.block.Block;

import java.util.ArrayList;
import java.util.Random;

public class Player implements IPlayer {
    public boolean advance() {
        return mImp.advance();
    }
    public void forceAdvance() {
        mImp.forceAdvance();
    }
    public char flagChar(Dir side) {
        return mImp.flagChar(side);
    }

    public  void setImp( PlayerImp pImp ) {
        mImp=pImp;
        mImp.setPlayer( this );   //让Player与PlayerImp双向关联
    }
    public PlayerImp getImp() {
        return mImp;
    }
    private PlayerImp mImp;
}