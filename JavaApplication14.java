/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication14;
import java.util.Scanner;

public class JavaApplication14 {

    public static void main(String[] args) {
       
        Scanner sc=new Scanner(System.in);
        int N=sc.nextInt();
        int fact=1;
        for(int x=1;x<=N;x++){
            fact *= x;
        
   }
   System.out.println(fact);
}

}
    
    

