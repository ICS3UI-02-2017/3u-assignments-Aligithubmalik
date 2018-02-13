/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Assignment1;

import becker.robots.City;
import becker.robots.Direction;
import becker.robots.RobotSE;
import becker.robots.Wall;

/**
 *
 * @author malia5277
 */
public class A1Q1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
  City kw = new City();
  RobotSE malik = new RobotSE (kw, 0, 2, Direction.WEST);
 //create a square wall
  new Wall (kw, 1, 2, Direction.NORTH);
  new Wall (kw, 1, 1, Direction.NORTH);
  new Wall (kw, 1, 1, Direction.WEST);
  new Wall (kw, 2, 1, Direction.WEST);
  new Wall (kw, 2, 1, Direction.SOUTH);
  new Wall (kw, 2, 2, Direction.SOUTH);
  new Wall (kw, 2, 2, Direction.EAST);
  new Wall (kw, 1, 2, Direction.EAST);
   
  //move the robot atound the walls counter clockwise and return to its starting position. 
  malik.move(2);
  malik.turnLeft();
  malik.move(3);
  malik.turnLeft();
  malik.move(3);
  malik.turnLeft();
  malik.move(3);
  malik.turnLeft();
  malik.move(1);
  
    }
    
}
