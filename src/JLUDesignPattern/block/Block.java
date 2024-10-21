package JLUDesignPattern.block;

public abstract class Block implements IBlock {
    private int mX;
    private int mY;
    public int getX( )  { return mX; }
    public int getY( )  { return mY; }
    public void setXY( int x, int y ) { mX = x; mY = y; }
    abstract public void draw();
}
