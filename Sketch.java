import processing.core.PApplet;
import processing.core.PImage;
import java.util.Random;
public class Sketch extends PApplet {

  PImage imgMeteor;

  // x and y coordinates for meteor
  Random random = new Random();
  float fltMeteorX = random( 1, 400);
  float fltMeteorY = random(1, 400);
  float MeteorSpeedX = 5;
  float MeteorSpeedY = 5;
  
  
  // define colours
  int black = color(0);
  int white = color(255);
  int purple = color(255, 0 ,255);

  public void settings() {
    size(400, 400);
  }

  public void setup() {
    background(0, 0, 0);
    // load meteor
    imgMeteor = loadImage("spaceMeteors_003.png");
    // resize meteor
    imgMeteor.resize(imgMeteor.width/3, imgMeteor.height/3);
    // load missile

    // resize missile

    // load rocket

    // resize rocket

  }

  public void draw() {
    background(black);
    // draw meteor and move


    image(imgMeteor, fltMeteorX, fltMeteorY);

    fltMeteorX += MeteorSpeedX;
    fltMeteorY += MeteorSpeedY;


    if (fltMeteorX >= width-imgMeteor.width ) {
      MeteorSpeedX *= -1;
    }
        if (fltMeteorX <= 0) {
      MeteorSpeedX *= -1;
    }

        if (fltMeteorY >= height-imgMeteor.height ) {
      MeteorSpeedY *= -1;
    }

            if (fltMeteorY <= 0 ) {
      MeteorSpeedY *= -1 ;
    }

    //image(imgMeteor, mouseX, mouseY);

    // draw missile and move


    // draw rocket and move

  }
}