package SimUDuck.Duck;

import SimUDuck.Fly.FlyBehaviour;

public class FlyRocketPowered implements FlyBehaviour {
    @Override
    public void fly() {
        System.out.println("I'm flying with Rocket!");
    }
}
