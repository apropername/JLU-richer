package JLUDesignPattern.Player;

public class UserPlayer extends Player {
    @Override
    public char flagChar(Dir d) {
        return ( d == Dir.LEFT ) ? '(' : ')';
    }
}
