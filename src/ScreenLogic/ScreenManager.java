package ScreenLogic;

import SimulationLogic.LogicManager;
import processing.core.*;

public class ScreenManager {
  PApplet p;
  Rocket rocket;
  LogicManager lm;

  public ScreenManager(PApplet p) {
    this.p = p;
    rocket = new Rocket(p);
    lm = new LogicManager(p);
  }

  public void show() {
    p.background(0);
    rocket.show();
    lm.logic();

  }
}
