package JLUDesignPattern.Player;

import JLUDesignPattern.Player.util.Dir;
import JLUDesignPattern.block.Block;

import java.util.ArrayList;
import java.util.Random;

public abstract class PlayerImp {
    public abstract boolean advance();
    public abstract char flagChar(Dir d); //不同类型Player的显
 //缺省只走1步,子类不同值.因为player还是个抽象类所以这个方法其实用不到,把它改成abstract也可以
    public void forceAdvance() {//final是按理解自己加的，todo 感觉forceAdvance和advance职责不明
        // 确定移动步数
        int steps = decideSteps();
        boolean goon = true;
        while (goon && steps > 0) {
            goon = moveStep(); //向前移动一步
            --steps;
        }
    } //强制必须前进
    protected int decideSteps() {
        return 1;
    }
    //change to private is temporarily ok
    boolean moveStep() {
        //确定移动方向
        Dir dir = decideMoveDir();
        // 取得目标Block
        Block nextBlock = mpStand.getNeighbor(dir);
        // 进入目标Block，目标的进入方向正好与dir相反
        setStand(Dir.opposite(dir), nextBlock);
        //处理进入后果，返回是否可继续移动
        boolean goon = nextBlock.enterBy(mpPlayer);
        return goon;
    } //向前移动一步. 不能继续前进，返回false
    //change to private is temporarily ok
    Dir decideMoveDir() {
        // 取得所有可用方向(不含进入方向)，放入vector-dirs中
        ArrayList<Dir> dirs = new ArrayList<>();
        for ( int i = 0; i < Dir.TOTAL_COUNT; i++ ) {
            Dir d=Dir.values()[i];
            if ( d!=mEnterDir && mpStand.getNeighbor( d )!=null )
                dirs.add( d);
        }
        // 初始无进入方向时，任选一个方向
        if ( mEnterDir == Dir.UNKNOWN ) {
            //从dirs中随机选一个
            return dirs.get((new Random().nextInt(dirs.size())));
        }
        //只有进入方向，无其它可用方向，原路返回
        if ( dirs.size( ) == 0 ) {
            return mEnterDir;
        }
        //从dirs中随机选一个
        return dirs.get((new Random().nextInt(dirs.size())));
    }

    private Block mpStand; // 所在的Block
    private Dir mEnterDir = Dir.UNKNOWN;
    private String mName = "";
    private int mMoney = 0;
    private int mHp = 100;
    // getters/setters
    //@Data
    public String getName() {
        return mName;
    }

    public void setName(String name) {
        mName = name;
    }

    public int getMoney() {
        return mMoney;
    }

    public void setMoney(int m) {
        mMoney = m;
    }

    public int getHp() {
        return mHp;
    }

    public void setHp(int hp) {
        mHp = hp;
    }

    public Block getStand() {
        return mpStand;
    }

    public Dir getEnterDir() {
        return mEnterDir;
    }
    public void setStand(Dir enterDir, Block stand) {
        mEnterDir = enterDir;
        mpStand = stand;
    }
    //@Data

    private Player mpPlayer;
    void setPlayer(Player handler) {//包作用域代替友元
        mpPlayer = handler;
    }

    // 辅助（可选）
    public int addMoney(int add) {
        mMoney += add;
        return mMoney;
    }

    public int addHp(int add) {
        mHp += add;
        return mHp;
    }

}
