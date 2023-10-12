import processing.core.PApplet;
import java.util.Random; 

public class Sketch extends PApplet {
	
  public void settings() {
    size(500, 500);
  }

  // Random background colour values
  Random randomRColour = new Random();
  int intRandomRColour = randomRColour.nextInt(256);

  Random randomGColour = new Random();
  int intRandomGColour = randomGColour.nextInt(256);

  Random randomBColour = new Random();
  int intRandomBColour = randomBColour.nextInt(256);

  public void setup() {
    background(intRandomRColour, intRandomGColour, intRandomBColour);
  }

  // Random X and Y location
  Random randomWidth = new Random();
  int intRandomX = randomWidth.nextInt(200);

  Random randomHeight = new Random();
  int intRandomY = randomHeight.nextInt(200);

  public void draw() {
    // Current time
    int intHour = hour();
    int intMinute = minute();
    int intSecond = second();

    println(intHour + ":" + intMinute + ":" + intSecond);

    // Body of house
    stroke(224, 202, 158);
    fill(224, 202, 159);
    rect((float) (width / 14), (float) (height / 2), (float) (width / (7.0 / 4.0)), (float) (height / (14.0 / 9.0)));

    // Roof
    stroke(96, 41, 41);
    fill(96, 41, 41);
    quad((float) (width / 7.0), (float) (height / (7.0 / 2.0)), (float) (width / (28.0 / 15.0)), (float) (height / (7.0 / 2.0)), (float) (width / (7.0 / 5.0)), (float) (height / (35.0 / 19.0)), 0, (float) (height / (35.0 / 19.0)));

    // Door
    rect((float) (width / (7.0 / 3.0)), (float) (height / (14.0 / 9.0)), (float) (width / 7), (float) (height / (7.0 / 2.0)));

    // Grass
    stroke(74, 186, 93);
    fill(74, 186, 93);
    rect(0, height - (float) (height / 14.0), width, (float) (height / 14.0));

    // Window
    stroke(148, 175, 255);
    fill(148, 175, 255);
    ellipse((float) (width / (14.0/ 3.0)), (float) (height / (7.0 / 5.0)), (float) (width / (35.0 / 4.0)), (float) (height / (70.0 / 13.0)));

    // Sun
    stroke(255, 230, 66);
    fill(255, 230, 66);
    ellipse(width, 0, (float) (width / 2.0), (float) (height / 2.0));

    line((float) (width / (7.0 / 5.0)), (float) (height / (35.0)), (float) (width / (7.0 / 4.0)), (float) (height / 14.0));
    line((float) (width / (70.0 / 53.0)), (float) (height / (35.0 / 4.0)), (float) (width / (14.0 / 9.0)), (float) (height / (35.0 / 6.0)));
    line((float) (width / (70.0 / 57.0)), (float) (height / (70.0 / 9.0)), (float) (width / (7.0 / 5.0)), (float) (height / (70.0 / 17.0)));
    line((float) (width / (70.0 / 61.0)), (float) (height / (140.0 / 19.0)), (float) (width / (14.0 / 11.0)), (float) (height / (35.0 / 11.0)));
    line((float) (width / (14.0 / 13.0)), (float) (height / 5.0), (float) (width / (10.0 / 9.0)), (float) (height / (140.0 / 47.0)));
    line((float) (width / (70.0 / 69.0)), (float) (height / (70.0 / 17.0)), (float) (width / (35.0 / 34.0)), (float) (height / (14.0 / 5.0)));

    // Clouds
    stroke(255, 255, 255);
    fill(255, 255, 255);
    ellipse((float) (width / (35.0 / 9.0)), (float) (height / (140.0 / 11.0)), (float) (width / 7.0), (float) (height / (70.0 / 9.0)));
    ellipse((float) (width / (70.0 / 23.0)), (float) (height / (28.0 / 3.0)), (float) (width / 7.0), (float) (height / (70.0 / 9.0)));
    ellipse((float) (width / (35.5 / 8.0)), (float) (height / (140.0 / 13.0)), (float) (width / (35.5 / 6.0)), (float) (height / (70.0 / 9.0)));

    ellipse((float) (width / (7.0  / 5.0)), (float) (height / (140.0 / 19.0)), (float) (width / (35.0 / 6.0)), (float) (height / (28.0 / 3.0)));
    ellipse((float) (width / (70.0 / 53.0)), (float) (height / (28.0 / 3.0)), (float) (width / (140.0 / 27.0)), (float) (height / (70.0 / 9.0)));
    ellipse((float) (width / (70.0 / 47.0)), (float) (height / (140.0 / 13.0)), (float) (width / (35.0 / 6.0)), (float) (height / 7.0));

    // Ellipse size varying with location
    /**if(intRandomX > 250 && intRandomY > 250){
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
    */

    // Moley
    stroke(0, 0, 0);
    fill(0, 0, 0);
    rect((float) (width / (100.0 / 21.0) + intRandomX), (float) (height / (10.0 / 7.0) + intRandomX), (float) (width / (350.0 / 3.0)), (float) (height / 35.0));

    stroke(49, 34, 160);
    fill(49, 34, 160);
    ellipse((float) (width / (14.0 / 3.0) + intRandomX), (float) (height / (70.0 / 53.0) + intRandomX), (float) (width / 10.0), (float) (height / (35.0 / 3.0)));

    stroke(255, 230, 66);
    fill(255, 230, 66);
    ellipse((float) (width / (14.0 / 3.0) + intRandomX), (float) (height / (140.0 / 107.0) + intRandomX), (float) (width / 35.0), (float) (height / 70.0));
    ellipse((float) (width / (14.0 / 3.0) + intRandomX), (float) (height / (175.0 / 122.0) + intRandomX), (float) (width / (175.0 / 2.0)), (float) (height / (175.0 / 2.0)));

    stroke(0, 0, 0);
    fill(0, 0, 0);
    ellipse((float) (width / (70.0 / 13.0) + intRandomX), (float) (height / (70.0 / 53.0) + intRandomX), (float) (width / (140.0 / 3.0)), (float) (height / 140.0));
    ellipse((float) (width / (70.0 / 17.0) + intRandomX), (float) (height / (70.0 / 53.0) + intRandomX), (float) (width / (140.0 / 3.0)), (float) (height / 140.0));
  }
}