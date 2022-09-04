import java.util.Date;
public class AlfredQuotes {
    
    public String basicGreeting() {
        // You do not need to code here, this is an example method
        return "Hello, lovely to see you. How are you?";
    }
    
    public String guestGreeting(String name) {
        String greeting = String.format("Hello, %s. Lovely to see you.", name);
        System.out.println(greeting);
        return greeting;
    }

    public String guestGreeting(String dayPeriod, String name) {
        String greeting = String.format("Good %s, %s. Lovely to see you.", dayPeriod, name);
        System.out.println(greeting);
        return greeting;
    }
    
    public String dateAnnouncement() {
        Date nowDate = new Date();
        String date = String.format("It is currently %s.", nowDate);
        System.out.println(date);
        return date;
    }
    
    public String respondBeforeAlexis(String conversation) {
        int alexis = conversation.indexOf("Alexis");
        int alfred = conversation.indexOf("Alfred");
        if (conversation.indexOf("Alexis") >= 0) {
            String snarky = "Right away, sir. She certainly isn't sophisticated enough for that.";
            System.out.println(snarky);
        } else if (conversation.indexOf("Alfred") >=0) {
            String oblige = "At your service. As you wish, naturally.";
            System.out.println(oblige);
        } else {
            String retire = "Right. And with that I shall retire.";
            System.out.println(retire);
        }
        return conversation;
    }
    
	// NINJA BONUS
	// See the specs to overload the guessGreeting method
    // SENSEI BONUS
    // Write your own AlfredQuote method using any of the String methods you have learned!
}

