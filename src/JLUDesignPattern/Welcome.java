package JLUDesignPattern;

public enum Welcome implements GameState{
    INSTANCE;
    private App context;
    public void setContext(App context) {this.context = context;}//TODO enum单例默认调用无参构造，没能实现组合关系，暂用聚合
    @Override
    public void process() {
        IO.println("Welcome!");
        context.changeState(Playing.INSTANCE);
    }
}
