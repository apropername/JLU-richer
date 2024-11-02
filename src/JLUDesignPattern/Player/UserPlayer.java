package JLUDesignPattern.Player;

import JLUDesignPattern.Player.util.Dir;

public class UserPlayer extends Player {
    @Override
    public char flagChar(Dir d) {
        return ( d == Dir.LEFT ) ? '(' : ')';
    }
    @Override
    public boolean advance( )  { return false; }
    @Override
    protected int decideSteps( )  { return 3; }
}
