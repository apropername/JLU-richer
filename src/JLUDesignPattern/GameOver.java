package JLUDesignPattern;

public enum GameOver implements GameState{
    INSTANCE;
    @Override
    public void process() {
        IO.println("Bye bye~~");
    }
}
