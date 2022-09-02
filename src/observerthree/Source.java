/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package observerthree;

/**
 *
 * @author Zucrem
 */
public interface Source {
    public void notifyObservers();
    public void register(MyObserver observer);
}
