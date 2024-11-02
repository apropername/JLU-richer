package JLUDesignPattern.block;


import JLUDesignPattern.IO;
import JLUDesignPattern.Player.Player;

public class MoneyBlock extends Block {
    @Override
    public boolean enterBy(Player player) {
        player.addMoney( 100 );
        return true;    }
/*
    @Override
    public Block clone() {
        return null;
    }*/

    @Override
    protected void drawText() {
        IO.print(" B ");
    }
}
