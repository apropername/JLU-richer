package JLUDesignPattern.Player;

public class AutoPlayer extends Player {
    @Override
    public char flagChar(Dir d) {
        return ( d == Dir.LEFT ) ? '[' : ']';
    }
}
