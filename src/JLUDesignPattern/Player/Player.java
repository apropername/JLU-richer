package JLUDesignPattern.Player;

import JLUDesignPattern.block.Block;
//@Data
public abstract class Player implements IPlayer {
    public abstract char flagChar(Dir d); //不同类型Player的显
    public boolean advance( ) { return true;}
    // getters/setters
    //@Data
    public  String  getName( )  { return mName; }
    public void  setName( String  name ) { mName = name; }
    public int   getMoney( )  { return mMoney; }
    public void  setMoney( int m ) { mMoney = m; }
    public int   getHp( )  { return mHp; }
    public void  setHp( int hp ) { mHp = hp; }
    public Block  getStand( )  { return mpStand; }
    public Dir getEnterDir( )  { return mEnterDir; }
    //@Data
    public void  setStand(Dir enterDir, Block  stand ) {
        mEnterDir = enterDir;
        mpStand = stand;
    }

    // 辅助（可选）
    public int   addMoney( int add ) { mMoney += add; return mMoney; }
    public int   addHp( int add ) { mHp += add; return mHp; }

    private Block mpStand; // 所在的Block
    private Dir  mEnterDir = Dir.UNKNOWN;
    private String mName = "";
    private int mMoney = 0;
    private int mHp = 100;
};