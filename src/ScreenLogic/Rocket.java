package ScreenLogic;

import processing.core.*;

public class Rocket {
  PApplet p;

  Rocket(PApplet p) {
    this.p = p;
  }

  void show() {
    p.stroke(0); // Set stroke color to black

    p.fill(178, 188, 186);
    p.rectMode(p.CENTER);
    p.rect(p.width / 2, 380, 30, 100);

    p.fill(251, 48, 14);
    p.triangle(p.width / 2 - 30, 430, p.width / 2 - 15, 430, p.width / 2 - 15, 400);

    p.fill(251, 48, 14);
    p.triangle(p.width / 2 + 30, 430, p.width / 2 + 15, 430, p.width / 2 + 15, 400);

  }
}
