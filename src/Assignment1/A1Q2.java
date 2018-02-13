/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Assignment1;

import becker.robots.City;
import becker.robots.Direction;
import becker.robots.RobotSE;
import becker.robots.Thing;
import becker.robots.Wall;

/**
 *
 * @author malia5277
 */
public class A1Q2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
     City kw = new City();
  RobotSE malik = new RobotSE (kw, 1, 2, Direction.SOUTH);
 //create a porch 
  new Wall (kw, 1, 2, Direction.NORTH);
  new Wall (kw, 1, 1, Direction.NORTH);
  new Wall (kw, 1, 1, Direction.WEST);
  new Wall (kw, 2, 1, Direction.WEST);
  new Wall (kw, 2, 1, Direction.SOUTH);
  new Wall (kw, 1, 2, Direction.SOUTH);
  new Wall (kw, 1, 2, Direction.EAST);
     
   new Thing(kw, 2, 2);
   
 
  //move the robot to collect thing 
 
  malik.turnRight();
  malik.move(1);
  malik.turnLeft();
  malik.move(1);
  malik.turnLeft();
  malik.move(1);
  malik.pickThing();
  malik.turnRight();
  malik.turnRight();
  malik.move(1);
  malik.turnRight();
  malik.move(1);
  malik.turnRight();
  malik.move(1);
  malik.turnRight();
  
    
    }
}
