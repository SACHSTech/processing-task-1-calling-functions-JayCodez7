import processing.core.PApplet;

public class Sketch extends PApplet {
	
	
  /**
   * Called once at the beginning of execution, put your size all in this method
   */
  public void settings() {
	// put your size call here
    size(400, 400);
  }

  /** 
   * Called once at the beginning of execution.  Add initial set up
   * values here i.e background, stroke, fill etc.
   */
  public void setup() {
    background(17, 176, 250);
  }

  /**
   * Called repeatedly, anything drawn to the screen goes here
   */
  public void draw() {

	// Field
    fill(0, 148, 7);
    ellipse(125, 400, 400, 250);

  // Draw house
  
    // base
    fill(117, 51, 0);
    rect(200, 200, 200, 200);

    // roof
    fill(168, 35, 12);
    triangle(200, 200, 400, 200, 300, 125);

    // windows
    fill(171, 200, 255);
    rect(220, 230, 50, 50);

    fill(171, 200, 255);
    rect(330, 230, 50, 50);

    line(245, 230, 245, 280);
    line(220, 255, 270, 255);

    line(355, 230, 355, 280);
    line(330, 255, 380, 255);

    // door
    fill(168, 95, 0);
    rect(275, 300, 50, 115);

    // doorknob
    ellipse(315, 350, 7, 7);

  // Draw sun
    fill(255, 230, 0);
    ellipse(50, 50, 75, 75);
  }
  
  // define other methods down here.
}