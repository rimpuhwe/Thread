package Generics;

import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a key value of string datatype: ");
        String data1 = sc.next();
        System.out.print("Enter the  value of Integer datatype: ");
        String data2 = sc.next();
        if(!(data1.isEmpty()) && !(data2.isEmpty())){
            Pair<String , Integer> pair = new Pair<>( data1 ,  Integer.parseInt(data2));
            System.out.println(pair);
        }

    }
}
