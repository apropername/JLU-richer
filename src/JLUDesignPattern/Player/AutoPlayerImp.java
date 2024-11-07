package JLUDesignPattern.Player;

import JLUDesignPattern.Player.util.Dir;

public class AutoPlayerImp extends PlayerImp {
    @Override
    public char flagChar(Dir d) {
        return d .equals(Dir.LEFT) ? '[' : ']';
    }
    @Override
    public boolean advance( )  { forceAdvance( ); return true;}//todo 为了配合startRound而设置的返回值，为此还创造了forceAdvance函数，关键不爽。可以把 forceAdvance 改成advance ，把advance改为符合其意义的
    @Override
    protected int decideSteps( )  { return 4; }

}
