public class CafeJava {
    public static void main(String[] args) {
        // APP Variables
        String generalGreeting = "Welcome to Cafe Java, ";
        String pendingMessage = ", your order will be ready shortly";
        String readyMessage = ", your order is ready";
        String displayTotalMessage = "Your total is $";
        
        // MENU Variables
        double mochaPrice = 3.75;
        double coffeePrice = 2.10;
        double lattePrice = 3.25;
        double cappuccinoPrice = 2.75;

        //CUSTOMER NAME Variables
        String customer1 = "Cindhuri";
        String customer2 = "Sam";
        String customer3 = "Jimmy";
        String customer4 = "Noah";

        //ORDER completions
        boolean isReadyOrder1 = false;
        boolean isReadyOrder2 = true;
        boolean isReadyOrder3 = true;
        boolean isReadyOrder4 = false;

        //APP INTERACTION SIMULATION

        System.out.println(generalGreeting + customer1);
        System.out.println(customer1 + pendingMessage);

        if (isReadyOrder4 == false) {
            System.out.println(customer4 + pendingMessage);
        } else {
            System.out.println(customer4 + readyMessage);
            System.out.println(displayTotalMessage + cappuccinoPrice);
        }

        System.out.println(displayTotalMessage + (lattePrice*2));
        if (isReadyOrder2 == false) {
            System.out.println(customer2 + pendingMessage);
        } else {
            System.out.println(customer2 + readyMessage);
            System.out.println(displayTotalMessage + (lattePrice*2));
        }

        System.out.println(displayTotalMessage + (lattePrice-coffeePrice));
    }
}
