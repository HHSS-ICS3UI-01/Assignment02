
import becker.robots.City;
import becker.robots.Direction;
import becker.robots.Robot;
import becker.robots.Wall;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Peter
 */
public class A2Q4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //make city
        City kw = new City();
        
        //make robot
        Robot karel = new Robot(kw, 0,0, Direction.EAST);
        
        //make castle
        new Wall(kw, 1,1, Direction.SOUTH);
        new Wall(kw, 1,1, Direction.EAST);
        new Wall(kw, 1,1, Direction.NORTH);
        new Wall(kw, 1,1, Direction.WEST);
        new Wall(kw, 1,4, Direction.SOUTH);
        new Wall(kw, 1,4, Direction.EAST);
        new Wall(kw, 1,4, Direction.NORTH);
        new Wall(kw, 1,4, Direction.WEST);
        new Wall(kw, 4,1, Direction.SOUTH);
        new Wall(kw, 4,1, Direction.EAST);
        new Wall(kw, 4,1, Direction.NORTH);
        new Wall(kw, 4,1, Direction.WEST);
        new Wall(kw, 4,4, Direction.SOUTH);
        new Wall(kw, 4,4, Direction.EAST);
        new Wall(kw, 4,4, Direction.NORTH);
        new Wall(kw, 4,4, Direction.WEST);
        new Wall(kw, 2,2, Direction.NORTH);
        new Wall(kw, 2,2, Direction.WEST);
        new Wall(kw, 2,3, Direction.NORTH);
        new Wall(kw, 2,3, Direction.EAST);
        new Wall(kw, 3,2, Direction.WEST);
        new Wall(kw, 3,2, Direction.SOUTH);
        new Wall(kw, 3,3, Direction.EAST);
        new Wall(kw, 3,3, Direction.SOUTH);
        
        while (karel.frontIsClear()) {
            karel.move();
            karel.move();
            karel.turnLeft();
            karel.turnLeft();
            karel.turnLeft();
            karel.move();
            karel.turnLeft();
            karel.move();
            karel.turnLeft();
            karel.move();
            karel.turnLeft();
            karel.turnLeft();
            karel.turnLeft();
            karel.move();
            karel.move();
            karel.turnLeft();
            karel.turnLeft();
            karel.turnLeft();
        }
    }
    
}
