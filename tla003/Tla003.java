/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package com.mycompany.tla003;

import java.util.*;

/**
 *
 * @author Student's Account
 */
public class Tla003 {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        Stack<String> sta = new Stack<>();

        System.out.println("Enter words and press enter again to stop: ");

        while (true) {
            String word = scan.nextLine();
            if (word.trim().isEmpty()) {
            break; 
            } 
            sta.push(word);
        }
        System.out.println("Reversed: ");
        while(!sta.isEmpty()) {
            System.out.println (sta.pop() + "");
        }
    }
}
