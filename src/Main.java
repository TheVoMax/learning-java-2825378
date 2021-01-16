import java.util.Locale;
import java.util.Scanner;

public class Main {

    public static void main(String args[]) {
        String question = "Jaki mam kolor sciany?";
        String choiceOne = "zolty";
        String choiceTwo = "zielony";
        String choiceThree = "czerwony";

        String correctAnswer = choiceTwo;


        // Write a print statement asking the question
        System.out.println(question);
        // Write a print statement giving the answer choices
        System.out.println("a) " + choiceOne);
        System.out.println("b) " + choiceTwo);
        System.out.println("c) " + choiceThree);
        // Have the user input an answer
        System.out.println("Odpowiedz: ");
        // Retrieve the user's input
        Scanner scanner = new Scanner(System.in);
        String answer = scanner.next();

        // If the user's input matches the correctAnswer...
        if(correctAnswer.equals(answer.toLowerCase())){
            // then the user is correct and we want to print out a congrats message to the user.
            System.out.println("Poprawna odpowiedz!");
            // If the user's input does not match the correctAnswer...
        } else {
            // then the user is incorrect and we want to print out a message saying that the user is incorrect as well as what the correct choice was.
            System.out.println("Zle! Poprawna odpowiedz: " + correctAnswer);
        }


    }

}
