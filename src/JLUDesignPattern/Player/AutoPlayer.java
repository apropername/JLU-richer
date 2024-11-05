package JLUDesignPattern.Player;

import JLUDesignPattern.Player.util.Dir;

public class AutoPlayer extends Player {
    @Override
    public char flagChar(Dir d) {
        return ( d == Dir.LEFT ) ? '[' : ']';
    }
    @Override
    public boolean advance( )  { forceAdvance( ); return true;}//todo 为了配合startRound而设置的返回值，为此还创造了forceAdvance函数，关键不爽。可以把 forceA// dvance 改成advance ，把advance改为符合其意义的
    @Override
    protected int decideSteps( )  { return 4; }

}
