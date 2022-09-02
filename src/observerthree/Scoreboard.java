/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package observerthree;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Zucrem
 */
public class Scoreboard implements Source{
    private final ArrayList<MyObserver> list;
    private String someData;

    public Scoreboard() {
        this.list = new ArrayList<MyObserver>();
    }
    
    public int SetPeople(){
        Scanner sc = new Scanner(System.in);
        System.out.print("How many People watching : ");
        int j = sc.nextInt();
        return j;
    }
    
    public void setSomeData(String aData) {
	someData = aData;
	notifyObservers();
    }
    
    public String getSomeData() {
	return someData;
    }
    
    @Override
    public void register (MyObserver observer) {
        list.add(observer);
    }
    
    @Override
    public void notifyObservers() {
        for (int j = 0; j < list.size(); ++j) {
            list.get(j).update(this);
	}
    }
    
}
