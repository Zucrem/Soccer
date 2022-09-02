/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package observerthree;

/**
 *
 * @author Zucrem
 */
public class Viewer implements MyObserver {
    @Override
    public void update(Source o) {
        System.out.println(
	 "live result: " 
                + ((Scoreboard)o).getSomeData() + "\n");
    }
}
