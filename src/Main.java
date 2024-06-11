// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sca = new Scanner(System.in);
        double itmenPrice;
        double shipiCost;


        System.out.println("Enter item price.");
        itmenPrice = sca.nextDouble();
        if(itmenPrice >= 100) {
            System.out.println("Your shipping is free! Total cost is " + itmenPrice);
        }
        else {
            shipiCost = itmenPrice * 0.02;
            System.out.println("Your shipping cost is " + shipiCost + " and your total is " + (shipiCost + itmenPrice));
        }

    }
}