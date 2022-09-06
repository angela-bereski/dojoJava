import java.util.ArrayList;
import java.util.Arrays;

public class TestPuzzle {
    public static void main(String[] args) {
        PuzzleJava appTest = new PuzzleJava();

        System.out.println("\n---Get Ten Rolls Test---\n");
        int[] rolls = {};
        System.out.println(appTest.getTenRolls(rolls));

        System.out.println("\n\n---Get Random Letter Test---\n");
        char[] randomLetter = {};
        System.out.println(appTest.getRandomLetter(randomLetter));

        System.out.println("\n\n---Generate Password---\n");
        String newPassword = "";
        System.out.println(appTest.generatePassword(newPassword));

        //System.out.println("\n\n---Get New Password Set---\n");
        //ArrayList<String> newerPassword = new ArrayList<String>();
        //appTest.getNewPasswordSet(newerPassword);
        
    }
}
        