package SimUDuck;

import SimUDuck.Duck.Duck;
import SimUDuck.Duck.FlyRocketPowered;
import SimUDuck.Duck.ModelDuck;
import SimUDuck.Duck.MallardDuck;

public class Main {
    public static void main(String[] args) {
	    Duck mallard = new MallardDuck();
	    mallard.performQuack();
	    mallard.performFly();

	    Duck model = new ModelDuck();
	    model.performFly();
	    model.setFlyBehaviour(new FlyRocketPowered());
	    model.performFly();
    }
}
