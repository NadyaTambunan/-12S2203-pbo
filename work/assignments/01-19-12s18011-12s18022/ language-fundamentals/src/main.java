/**
 * 
 * @author 19-12s18011 Nadya Tambunan
 * @author 19-12s18022 Alex Conro Marpaung
 */

import java.util.ArrayList;
import java.util.Scanner;
public class main {
    /* program entry point */
    public static void main(String[] _args) {
        System.out.println("Hello, world!");
        
        // declaring and manipulating primitive variables
        int gear = 1;
        boolean result = true;
        char capitalC = 'C';
        byte b = 100;
        
        System.out.println(gear + ", " + result + ", " + capitalC + ", " + b);
        
        gear++;
        result = !result;
        capitalC += 4;
        
        System.out.println(gear + ", " + result + ", " + capitalC + ", " + b);
        
        // 26 in hexadecimal and binary
        int hexVal = 0x1a;
        int binVal = 0b11010;
        
        System.out.println(hexVal + ", " + binVal);
        
        // intantiating and manipulating objects
        String name = "Wiro Sableng";
        Short gearObject = 1;
        Boolean resultObj = true;
        
        System.out.println(name + ", " + gearObject + ", " + resultObj);
        
        name = name.toUpperCase();
        gearObject++;
        resultObj = (result == false) || !resultObj;
        
        System.out.println(name + ", " + gearObject + ", " + resultObj);
        
        // array, collections, and loop
        int [][] numbers = new int[10][10];
        
        for (int i = 0; i < numbers.length; ++i) {
            for (int j = 0; j < numbers[i].length; ++j) {
                numbers[i][j] = i + j;
            }
        }
        
        for (int i = 0; i < numbers.length; ++i) {
            for (int j = 0; j < numbers[i].length; ++j) {
                System.out.print(numbers[i][j] + " ");
            }
            System.out.println();
        }

// Challenge
ArrayList<ArrayList<Integer>>nomor = new ArrayList<ArrayList<Integer>>();

int jumlah_data = new Scanner(System.in) .nextInt();
for (int x = 0; x < jumlah_data; x++){
    nomor.add(new ArrayList<Integer> ());
    for(int y = 0; y < jumlah_data; y++){
        nomor.get(x).add(x+y);
    }
}
for (int x = 0; x < jumlah_data; x++) {
    for (int y = 0; y < jumlah_data; y++){
        System.out.print(nomor.get(x).get(y) + " ");
    }
System.out.println();
        }
     }
}


