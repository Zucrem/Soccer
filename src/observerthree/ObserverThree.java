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
public class ObserverThree {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Viewer obj1 = new Viewer();
        Scoreboard obj = new Scoreboard();
        int people = obj.SetPeople();
        System.out.println();
        for (int i = 0;i < people;i++) obj.register(obj1);
        while (true){
        System.out.print("Enter Score ");
        String score = sc.nextLine();
        if (score.equals("")) break;
        System.out.println();
        obj.setSomeData(score);
        }
    }
}
