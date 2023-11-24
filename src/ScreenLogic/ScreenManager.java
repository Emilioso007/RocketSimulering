package ScreenLogic;

import processing.core.*;

public class ScreenManager {
  PApplet p;
  Rocket rocket;

  public ScreenManager(PApplet p) {
    this.p = p;
    rocket = new Rocket(p);
  }

  public void show() {
    p.background(0);
    rocket.show();

  }
}
