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
public class A1Q3 {
    private static City kw;

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
   
   City kw = new City();
   
    RobotSE malik = new RobotSE (kw, 3, 0, Direction.EAST);
   new Thing(kw, 3, 1);
    
    
    //create a mountain  
  new Wall (kw, 3, 2, Direction.WEST);
  new Wall (kw, 3, 2, Direction.NORTH);
  new Wall (kw, 2, 3, Direction.WEST);
  new Wall (kw, 1, 3, Direction.WEST);
  new Wall (kw, 1, 3, Direction.NORTH);
  new Wall (kw, 1, 3, Direction.EAST);
  new Wall (kw, 2, 4, Direction.NORTH);
  new Wall (kw, 2, 4, Direction.EAST);
  new Wall (kw, 3, 4, Direction.EAST);
 
    }
}
