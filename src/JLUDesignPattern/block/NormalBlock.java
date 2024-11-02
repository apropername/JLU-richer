package JLUDesignPattern.block;

import JLUDesignPattern.Player.Player;

public class NormalBlock extends Block {
    @Override
    public boolean enterBy(Player player) {
        return true; //可继续移动
    }

/*
    @Override
    public Block clone() {
        return null;
    }
*/

    @Override
    protected void drawText() {
        System.out.print(" A ");
    }
}
