package StrategyProject;

public class BackToStart {
    protected int option;
    protected void back(){
        if (option == 1234){
            new Game().run();
        }
    }
}
