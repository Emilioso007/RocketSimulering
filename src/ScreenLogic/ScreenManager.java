package ScreenLogic;

import SimulationLogic.RocketLogic;
import processing.core.*;

public class ScreenManager {
  PApplet p;
  Rocket rocket;
  RocketLogic rl;

  public ScreenManager(PApplet p) {
    this.p = p;
    rocket = new Rocket(p);
    rl = new RocketLogic(p);
  }

  public void show() {
    p.background(0);
    rocket.show();
    rl.logic();

  }
}
