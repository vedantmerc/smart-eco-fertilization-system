import java.util.*;

public class Practice {
    public static void main(String[] args) {
        int a = 10;
        int b = 20;
        int c = 30;
        int d = 40;
        int e = 50;
        if (a > b && a > c && a > d && a > e) {
            System.out.println(" a is largest number");

        } else if (b > a && b > c && b > d && b > e) {
            System.out.println(" b is largest number");

        } else if (c > b && c > a && c > d && c > e) {
            System.out.println(" c is largest number");

        } else if (d > b && d > c && d > a && d > e) {
            System.out.println(" d is largest number");

        } else {
            System.out.println("e is largest number");
        }
    }
}