/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Examples;

import becker.robots.City;
import becker.robots.Direction;
import becker.robots.RobotSE;
import becker.robots.Thing;
import becker.robots.Wall;

/**
 * Learning how to use the robots
 *
 * @author malia5277
 */
public class RobotExample {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        // Create a City for the Robot   
        City kw = new City();
        RobotSE malik;
        //sets where malik starts and is looking
        malik = new RobotSE(kw, 2, 3, Direction.EAST);
        
        
        new Wall (kw, 2, 5, Direction.WEST);
        new Thing(kw, 2,4);
        //moves malik; one spot forward 


        //put a robot in kw
        malik.move();
        //malik.move(5);
        
        malik.pickThing();
        
        


        //Sets where marcel starts and is looking 

    }
}
