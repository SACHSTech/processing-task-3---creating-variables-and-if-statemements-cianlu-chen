import processing.core.PApplet;
import java.util.Random; 

public class Sketch extends PApplet {
	
  public void settings() {
    size(500, 500);
  }

  // Current time
  int intHour = hour();
  int intMinute = minute();
  int intSecond = second();

  // Random Moley colour values
  Random randomMoleyColour1 = new Random();
  int intRandomMoleyColour1 = randomMoleyColour1.nextInt(256);

  Random randomMoleyColour2 = new Random();
  int intRandomMoleyColour2 = randomMoleyColour2.nextInt(256);

  Random randomMoleyColour3 = new Random();
  int intRandomMoleyColour3 = randomMoleyColour3.nextInt(256);

  // Background based current time
  public void setup() {
    if(intHour >= 7 && intHour < 12){
      background(188, 86, 60);
    }

    else if(intHour >= 12 && intHour < 17){
      background(41, 174, 222);
    }

    else if(intHour >= 17 && intHour < 19){
      background(132, 55, 199);
    }

    else{
      background(19, 23, 87);
    }
  }

  // Random X and Y location
  Random randomWidth = new Random();
  int intRandomX = randomWidth.nextInt(500);

  Random randomHeight = new Random();
  int intRandomY = randomHeight.nextInt(500);

  public void draw() {
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
    if(intHour >= 6 && intHour <= 18){
      stroke(255, 230, 66);
      fill(255, 230, 66);
      ellipse(width, 0, (float) (width / 2.0), (float) (height / 2.0));

      line((float) (width / (7.0 / 5.0)), (float) (height / (35.0)), (float) (width / (7.0 / 4.0)), (float) (height / 14.0));
      line((float) (width / (70.0 / 53.0)), (float) (height / (35.0 / 4.0)), (float) (width / (14.0 / 9.0)), (float) (height / (35.0 / 6.0)));
      line((float) (width / (70.0 / 57.0)), (float) (height / (70.0 / 9.0)), (float) (width / (7.0 / 5.0)), (float) (height / (70.0 / 17.0)));
      line((float) (width / (70.0 / 61.0)), (float) (height / (140.0 / 19.0)), (float) (width / (14.0 / 11.0)), (float) (height / (35.0 / 11.0)));
      line((float) (width / (14.0 / 13.0)), (float) (height / 5.0), (float) (width / (10.0 / 9.0)), (float) (height / (140.0 / 47.0)));
      line((float) (width / (70.0 / 69.0)), (float) (height / (70.0 / 17.0)), (float) (width / (35.0 / 34.0)), (float) (height / (14.0 / 5.0)));
    }

    // Clouds
    stroke(255, 255, 255);
    fill(255, 255, 255);
    ellipse((float) (width / (35.0 / 9.0)), (float) (height / (140.0 / 11.0)), (float) (width / 7.0), (float) (height / (70.0 / 9.0)));
    ellipse((float) (width / (70.0 / 23.0)), (float) (height / (28.0 / 3.0)), (float) (width / 7.0), (float) (height / (70.0 / 9.0)));
    ellipse((float) (width / (35.5 / 8.0)), (float) (height / (140.0 / 13.0)), (float) (width / (35.5 / 6.0)), (float) (height / (70.0 / 9.0)));

    ellipse((float) (width / (7.0  / 5.0)), (float) (height / (140.0 / 19.0)), (float) (width / (35.0 / 6.0)), (float) (height / (28.0 / 3.0)));
    ellipse((float) (width / (70.0 / 53.0)), (float) (height / (28.0 / 3.0)), (float) (width / (140.0 / 27.0)), (float) (height / (70.0 / 9.0)));
    ellipse((float) (width / (70.0 / 47.0)), (float) (height / (140.0 / 13.0)), (float) (width / (35.0 / 6.0)), (float) (height / 7.0));

    // Moley
    stroke(0, 0, 0);
    fill(0, 0, 0);
    rect((float) (width / (100.0 / 21.0) - 90 + intRandomX), (float) (height / (10.0 / 7.0) - 350 + intRandomY), (float) (width / (350.0 / 3.0)), (float) (height / 35.0));

    if(intRandomX > 250 && intRandomY > 250){
      stroke(49, 34, 160);
      fill(49, 34, 160);
    }

    else if(intRandomX < 250 && intRandomY < 250){
      stroke(intRandomMoleyColour1, intRandomMoleyColour2, intRandomMoleyColour3);
      fill(intRandomMoleyColour1, intRandomMoleyColour2, intRandomMoleyColour3);
    }

    else if(intRandomX > 250 && intRandomY < 250){
      stroke(intRandomMoleyColour2, intRandomMoleyColour3, intRandomMoleyColour1);
      fill(intRandomMoleyColour2, intRandomMoleyColour3, intRandomMoleyColour1);
    }

    else if(intRandomX < 250 && intRandomY > 250){
      stroke(intRandomMoleyColour3, intRandomMoleyColour1, intRandomMoleyColour2);
      fill(intRandomMoleyColour3, intRandomMoleyColour1, intRandomMoleyColour2);
    }

    else{
      stroke(49, 34, 160);
      fill(49, 34, 160);
    }

    ellipse((float) (width / (14.0 / 3.0) - 90 + intRandomX), (float) (height / (70.0 / 53.0) - 350 + intRandomY), (float) (width / 10.0), (float) (height / (35.0 / 3.0)));

    stroke(255, 230, 66);
    fill(255, 230, 66);
    ellipse((float) (width / (14.0 / 3.0) - 90 + intRandomX), (float) (height / (140.0 / 107.0) - 350 + intRandomY), (float) (width / 35.0), (float) (height / 70.0));
    ellipse((float) (width / (14.0 / 3.0) - 90 + intRandomX), (float) (height / (175.0 / 122.0) - 350 + intRandomY), (float) (width / (175.0 / 2.0)), (float) (height / (175.0 / 2.0)));

    stroke(0, 0, 0);
    fill(0, 0, 0);
    ellipse((float) (width / (70.0 / 13.0) - 90 + intRandomX), (float) (height / (70.0 / 53.0) - 350 + intRandomY), (float) (width / (140.0 / 3.0)), (float) (height / 140.0));
    ellipse((float) (width / (70.0 / 17.0) - 90 + intRandomX), (float) (height / (70.0 / 53.0) - 350 + intRandomY), (float) (width / (140.0 / 3.0)), (float) (height / 140.0));
  }
}