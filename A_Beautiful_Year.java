import java.io.*;
import java.util.Scanner;

public class A_Beautiful_Year{
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int year = scanner.nextInt();

        while(true){
        year ++;

        String temp = Integer.toString(year);

        boolean unique = true;
        for (int i = temp.length()-1; i>=0; i--){
            for (int j = i-1; j>=0;j--){
                if ( temp.charAt(i) == temp.charAt(j)){
                    unique = false;
                    break;
                }
            }
            if (!unique){
                break;
            }
        }
        if (unique){
            break;
        }
    }
        System.out.println(year);
        scanner.close();
    }
}