package JLUDesignPattern;

import JLUDesignPattern.menu.Menu;
import JLUDesignPattern.menu.util.MenuMgr;

public enum Playing implements GameState{
    INSTANCE;
    private App context;
    public void setContext(App context) {this.context = context;}//TODO enum单例默认调用无参构造，没能实现组合关系，暂用聚合
    public void process() {
        Menu pMenu = MenuMgr.getInstance().activedMenu();
        if(!pMenu.process()){ context.changeState(GameOver.INSTANCE);}
    }
}
