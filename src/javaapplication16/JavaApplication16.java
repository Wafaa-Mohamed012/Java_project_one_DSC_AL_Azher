package javaapplication16;

import java.util.Scanner;

public class JavaApplication16 {
    static int j = 0 , s = 5 ;
    static boolean []seats = new boolean[10];
    static Scanner input = new Scanner(System.in);
    public static void main(String[] args) {
        
  
        
        // start fun 
        // FALSE THIS MEAN THAT IS SEAT IS EMPTY 
        // TRUE THIS IS MEAN THAT IS SEAT IS FULL
        start();
        while (s < 10 || j < 5) {            
            System.out.println("Enter 1 to book first , enter 2 to book eqonomic");
            int v = input.nextInt();
            switch(v)
            {
                case 1:
                    book(v);
                    break;
                case 2:
                    book(v);
                    break;
                default:
                    System.out.println("Enter valed number");
                    break;
            }
        }
         System.err.println("All seats are booked ): ");    
    }
    
    public static void book(int val) {
        if(isFirstFull() && isEquFull())
            System.err.println("All seats booked");
        else if(isEquFull()){
            System.err.println("sorry all first seats is booked to book first enter 1 to exit enter 0 ");
            int z = input.nextInt();
            if(z == 0)
                System.exit(0);
            else{
                if(val == 1){
                    seats[j]=true;
                    System.out.println("you are booked seat number " + (j+1));
                    j++;
                }
                else{
                    seats[s]=true;
                    System.out.println("you are booked seat number " + (s+1));
                    s++;
                }
            }
        }
    }
    
    public static boolean isFirstFull() {
        int count = 0;
        for (int i = 0; i < 5; i++) {
            if(seats[i] == true)
                count++;
        }
        return (count == 5);
    }
    
    public static boolean isEquFull() {
        
        int count = 0;
        for (int i = 5; i < 10; i++) {
            if(seats[i] == true)
                count++;
        }
        return (count == 5);
    }
    
    public static void start() {
        for (int i = 0; i < 10; i++) {
            seats[i] = false;
        }
    }
    
}