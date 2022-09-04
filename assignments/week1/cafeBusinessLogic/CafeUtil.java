import java.util.ArrayList;

public class CafeUtil {
    
    public int getStreakGoal() {
        int numWeeks = 10;
        int i = 0;
        int sum = 0;
        while (i <= numWeeks) {
            sum = sum += i;
            i++;
        }
        return sum;
    }

    public double getOrderTotal(double[] lineItems) {
        double sum = 0;
        for (int i = 0; i < lineItems.length; i++) {
            sum = sum + lineItems[i];
        }
        return sum;
    }

    public ArrayList displayMenu(ArrayList<String> menu) {
        for (int i = 0; i < menu.size(); i++) {
            String order = String.format("%s %s", i, menu.get(i));
            System.out.println(order);
        }
        return menu;
    }

    public ArrayList addCustomer(ArrayList<String> customers) {
        System.out.println("Please enter your name:");
        String userName = System.console().readLine();
        String hello = String.format("Hello, %s", userName);
        customers.add(userName);
        System.out.println(hello);
        String wait = String.format("There are %s people in front of you", customers.size());
        System.out.println(wait);
        System.out.println(customers);
        return customers;
    }

    void printPriceChart(String product, double price, int maxQuantity) {
        String name = String.format("%s", product);
        System.out.println(name);
        for (int i =1; i<=maxQuantity; i++) {
            String prices = String.format("%s - $%s", i, (price*i));
            System.out.println(prices);
        }
    }
}