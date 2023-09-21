import java.util.Scanner;

public class ScottTipCalculator {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("How much people are in your group? : ");
        String party = scan.nextLine();
        System.out.println("Tip percentage?");
        double tipPercent = scan.nextDouble();

        scan.nextLine();

        System.out.println("Name an item you want to eat: ");
        String item1 = scan.nextLine();
        System.out.println("What is the cost of this item: ");
        double item1cost = scan.nextDouble();

        scan.nextLine();

        System.out.println("Name another item you want to eat: ");
        String item2 = scan.nextLine();
        System.out.println("What is the cost of this item: ");
        double item2cost = scan.nextDouble();

        scan.nextLine();

        System.out.println("Name another item you want to eat: ");
        String item3 = scan.nextLine();
        System.out.println("What is the cost of this item: ");
        double item3cost = scan.nextDouble();

        scan.nextLine();

        System.out.println("Name another item you want to eat: ");
        String item4 = scan.nextLine();
        System.out.println("What is the cost of this item: ");
        double item4cost = scan.nextDouble();

        double totalCost = item1cost + item2cost + item3cost + item4cost;
        System.out.println("Total Cost Before Tip: " + totalCost);
        tipPercent *= .01;
        double totalTip = (totalCost * tipPercent);
        System.out.println("Total tip: " + totalTip);
    }
}
