import processing.core.PApplet;
import java.util.Random; 

public class Sketch extends PApplet {
	
  public void settings() {
    size(500, 500);
  }

  Random randomRColour = new Random();
  int intRandomRColour = randomRColour.nextInt(256);

  Random randomGColour = new Random();
  int intRandomGColour = randomGColour.nextInt(256);

  Random randomBColour = new Random();
  int intRandomBColour = randomBColour.nextInt(256);

  public void setup() {
    background(intRandomRColour, intRandomGColour, intRandomBColour);
  }

  Random randomWidth = new Random();
  int intRandomX = randomWidth.nextInt(501);

  Random randomHeight = new Random();
  int intRandomY = randomHeight.nextInt(501);

  public void draw() {
    int intHour = hour();
    int intMinute = minute();
    int intSecond = second();

    println(intHour + ":" + intMinute + ":" + intSecond);

    if(intRandomX > 250 && intRandomY > 250){
      stroke(234, 153, 46);
      ellipse (intRandomX, intRandomY, 300, 100);
    }

    else if(intRandomX < 250 && intRandomY < 250){
      stroke(46, 153, 345);
      ellipse (intRandomX, intRandomY, 100, 200);
    }

    else if(intRandomX < 250 || intRandomY < 250){
      stroke(214, 6, 26);
      ellipse (intRandomX, intRandomY, 250, 180);
    }

    else{
      stroke(42, 55, 167);
      ellipse (intRandomX, intRandomY, 100, 100);
    }
  }
}