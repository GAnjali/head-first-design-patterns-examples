package SimUDuck.Duck;

import SimUDuck.Fly.FlyNoWay;
import SimUDuck.Quack.Quack;

public class ModelDuck extends Duck {

    public ModelDuck(){
        quackBehaviour = new Quack();
        flyBehaviour = new FlyNoWay();
    }
    @Override
    public void display() {
        System.out.println("I'm a model Duck");
    }
}
