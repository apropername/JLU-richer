package JLUDesignPattern.Player;

import JLUDesignPattern.block.Block;
import JLUDesignPattern.map.util.MapMgr;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public enum PlayerMgr {
    INSTANCE;
    static public PlayerMgr getInstance() {return INSTANCE;}
    static final String[] names = {"赵一伤", "钱二败", "孙三毁", "李四摧", "周五输", "吴六破", "郑七灭", "王八衰"};
    //重置游戏人数（重新开始）
    public void resetPlayers( int num ){
        //确保至少一个玩家, 至多8个
        if ( num < 1 ) num = 1;
        if ( num > 8 )  num = 8;
        //释放原有players
        mPlayers.clear( );
        //取第一个Blcok
        Block firstBlock = MapMgr.getInstance( ).activedMap( ).getBlockByIndex( 0 );
        //建立全部玩家
        for ( int i = 0; i < num; i++ ) {
            Player player = null;
            if ( i == num - 1 ) {
                //最后一个是用户玩家 todo:目前看来只是口头约定，没有机制表明
                player = new UserPlayer( );
            } else {
                player = new AutoPlayer( );
            }
            player.setName( names[ i ] );
            //设置Player的初始位置
            player.setStand( Dir.UNKNOWN, firstBlock );
            mPlayers.add( player );
        }
        //当前Player,为第一个
        setActivePlayer( mPlayers.getFirst() );
    }
    // getters/setters
    public ArrayList<Player>  getAllPlayers( )  { return mPlayers; }
    void  addPlayer( Player p ) { mPlayers.add(p); }
    Player getActivePlayer( )  { return mActivePlayer; }
    void   setActivePlayer( Player player ) { mActivePlayer = player; }
    
    // 激活下一个
    public Player nextPlayer( ){
        // 当前次序
        Iterator<Player> it = mPlayers.iterator();
        while ( it.hasNext() ) {
            Player curPlayer=it.next();
            if(curPlayer==mActivePlayer) {
                if ( (curPlayer) != mPlayers.getLast() ) {
                    //下一个Player
                    setActivePlayer(it.next());
                } else {
                    //已到最后，取第一个
                    setActivePlayer( mPlayers.getFirst() );
                }
            }
        }
        return mActivePlayer;
    }
    public Player findPlayerOnBlock( Block block )  {
        Player  found = null;
        // 若多个玩家站Block，返回UserPlayer todo:也只是口头规范
        for ( var  player : mPlayers ) {
            if ( player.getStand() == block ) {
                found = player;//原cpp代码player.get()之谜
            }
        }
        return found;
    }

//    protected PlayerMgr( ) = default;
    
    private Player mActivePlayer;     //当前活动Player
    private ArrayList<Player> mPlayers=new ArrayList<>();
}
