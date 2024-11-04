package JLUDesignPattern.block;


import JLUDesignPattern.IO;
import JLUDesignPattern.Player.Player;

public class TripBlock extends Block {
    @Override
    public boolean enterBy(Player player) {
        player.addHp( -15 );
        return true;
    }

    /*@Override
    public Block clone() {
        return null;
    }*/

    @Override
    protected char content(){
        return 'C';
    }
}
