package JLUDesignPattern.Player;

import JLUDesignPattern.Player.util.Dir;

public class AutoPlayer extends Player {
    @Override
    public char flagChar(Dir d) {
        return ( d == Dir.LEFT ) ? '[' : ']';
    }
    @Override
    public boolean advance( )  { forceAdvance( ); return true;}
    @Override
    protected int decideSteps( )  { return 4; }

}
