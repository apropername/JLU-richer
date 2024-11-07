package JLUDesignPattern.block;


import JLUDesignPattern.IO;
import JLUDesignPattern.Player.Player;

public class MoneyBlock extends Block {
    @Override
    public boolean enterBy(Player player) {
        player.getImp().addMoney( 100 );
        return true;    }

    @Override
    protected char content() {
        return 'B';
    }
}
