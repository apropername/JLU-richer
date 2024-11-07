package JLUDesignPattern.Player;

import JLUDesignPattern.Player.util.Dir;

public class UserPlayerImp extends PlayerImp {
    @Override
    public boolean advance() {
        return false;
    }

    @Override
    public char flagChar(Dir d) {
        return d .equals(Dir.LEFT) ? '(' : ')';
    }

    @Override
    protected int decideSteps() {
        return 3;
    }
}
