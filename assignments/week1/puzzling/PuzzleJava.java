import java.util.Random;
import java.util.Arrays;
import java.util.ArrayList;


public class PuzzleJava {

    Random randMachine = new Random();
    
    public int[] getTenRolls(int[] rolls) {
        
        int[] randomArray = new int[10];
        for (int i = 0; i < randomArray.length; i++) {
            randomArray[i] = randMachine.nextInt(20);
            randomArray[i] = randomArray[i] + 1;
            System.out.println(randomArray[i]);
        }
        return rolls;
    }

    public char[] getRandomLetter(char[] letter) {
        char[] alphabet = {'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z'};
        int randLet = randMachine.nextInt(25);
        System.out.println(alphabet[randLet]);
        return letter;
    }

    public String generatePassword(String password) {
        char[] alphabet = {'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z'};
        password = "";
        for (int i = 0; i<8; i++) {
            int randLet = randMachine.nextInt(25);
            char charPassword = alphabet[randLet];
            password = password + charPassword;
        }
        return password;
    }

    //public ArrayList<String> getNewPasswordSet(ArrayList<String> newPass) {
        //int length = 1234;
        //String newNew = "";
        //for (int i = 0; i<length; i++) {
            //newNew = generatePassword();
            //System.out.println(newNew);
        //}
        //return newPass;
    //}

}