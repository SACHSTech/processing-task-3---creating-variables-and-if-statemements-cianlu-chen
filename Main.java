import processing.core.PApplet;

/**
 * Program that randomly draws Moley in a random place
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