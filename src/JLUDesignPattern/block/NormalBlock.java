package JLUDesignPattern.block;

import JLUDesignPattern.IO;
import JLUDesignPattern.Player.Player;

public class NormalBlock extends Block {
    @Override
    public boolean enterBy(Player player) {
        return true; //可继续移动
    }



    @Override
    protected char content() {
        return 'A';
    }
}
