import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String a;
        int i = 1;
        while(in.hasNext()){
           a = in.nextLine();
           System.out.println(i+" "+a);
           i++;
       }
    }
}