package JLUDesignPattern.block;

import JLUDesignPattern.IO;
import JLUDesignPattern.Player.Player;

public class BarBlock extends Block {

    @Override
    public boolean enterBy(Player player) {
        return false; //被阻拦，停止移动
    }



    @Override
    protected char content(){
        return 'D';
    }
}
