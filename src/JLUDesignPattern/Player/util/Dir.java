package JLUDesignPattern.Player.util;

public enum Dir {
    LEFT, UP, RIGHT, DOWN, UNKNOWN;
    public static final int TOTAL_COUNT= Dir.values().length-1;//除掉UNKNOWN
    static public Dir opposite(Dir in) {
        if(in == UNKNOWN) return UNKNOWN;
        return Dir.values()[(in.ordinal()+2)%TOTAL_COUNT];
    }
    static public Dir turnLeft( Dir in ){
        if(in == UNKNOWN) return UNKNOWN;
        return Dir.values()[(in.ordinal()+1)%TOTAL_COUNT];
    }
    static public Dir turnRight( Dir in ){
        if(in == UNKNOWN) return UNKNOWN;
        return Dir.values()[(in.ordinal()+3)%TOTAL_COUNT];
    }
}
