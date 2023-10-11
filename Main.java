import processing.core.PApplet;

/**
 * Program that randomly draws an ellipse on the screen as well as displaying the current time
 * @author L. Chen
 *
 */
class Main {
  public static void main(String[] args) {
    
    String[] processingArgs = {"MySketch"};
	  Sketch mySketch = new Sketch();
	  PApplet.runSketch(processingArgs, mySketch);
  }
  
}