
import becker.robots.City;
import becker.robots.Direction;
import becker.robots.Robot;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author lalim9800
 */
public class a2q3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       City a2q3=new City();
       Robot lali= new Robot(a2q3,1,2,Direction.EAST);
       
      while(lali.getDirection() != Direction.NORTH){
          lali.turnLeft();
         
       
      
    }
}