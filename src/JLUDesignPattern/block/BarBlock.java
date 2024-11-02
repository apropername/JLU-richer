package JLUDesignPattern.block;

import JLUDesignPattern.Player.Player;

public class BarBlock extends Block {
    @Override
    public boolean enterBy(Player player) {
        return false; //被阻拦，停止移动
    }

    /*@Override
    public Block clone() {
        return null;
    }*/

    @Override
    protected void drawText(){
        System.out.print(" D ");
    }
}
