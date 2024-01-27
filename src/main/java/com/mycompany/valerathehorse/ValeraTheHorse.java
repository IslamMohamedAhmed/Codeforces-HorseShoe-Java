/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package com.mycompany.valerathehorse;

/**
 *
 * @author Islam Mohamed
 */
import java.util.*;

public class ValeraTheHorse {

    public static void main(String[] args) {
        int[] s = new int[10];
        int sum = 0;
        Scanner scan = new Scanner(System.in);
        for (int i = 0; i < 4; i++) {
            s[i] = scan.nextInt();

        }
        for (int j = 0; j < 4; j++) {

            for (int k = j + 1; k < 4; k++) {
                if (s[j] == s[k]) {
                    sum++;
               
                }
            }
                 if(sum==3 || sum==2){
                        break;
                    }

        }
        System.out.println(sum);
    }
}
