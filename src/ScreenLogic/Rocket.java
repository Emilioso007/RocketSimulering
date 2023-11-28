package ScreenLogic;

import processing.core.*;

public class Rocket {
  PApplet p;
  PImage photo;

  Rocket(PApplet p) {
    this.p = p;
    photo = p.loadImage("Rocket.png");
  }

  void show() {
    p.image(photo, p.width / 2 - 37, 300);
  }
}
