import java.util.Scanner;

public class BINGOGameStanfordJames {

    public static void main(String[] args) {

        boolean hasWon = false;
        Scanner input = new Scanner(System.in);

        System.out.println("Welcome to BINGO! Enter 'Start' to play!"); //Prompt the user to enter "Start" to begin BINGO-ing 

        String response = input.next(); //Check for "Start"

        BINGOCardStanfordJames card = new BINGOCardStanfordJames(); //Create a new card

        if (response.equals("Start") || response.equals("start")) {

            int[][] bingo = new int[5][5]; //create a new array that will become the card

            bingo = card.getCard(); //make 'bingo' =  to 'card'

            card.printBINGOCard();//function that prints the card initially

            do{ //Runs the game until the user wins / gets bingo
                nextMove(input, card, bingo);
                 hasWon = card.checkBingo();
            }
            while (hasWon == false);

            if (hasWon == true) {// when won
                System.out.println("Congratulations! You are today's Big Bingo Champion!");
            }

        } else { //if 'start' is not entered, give this message
            System.out.println(
                    "========================================================\nYou must enter 'Start' before entering the BINGOverse\n========================================================");
        }

    }// end of main

    public static void nextMove(Scanner input, BINGOCardStanfordJames card, int[][] bingo) { // method to prompt the user each turn
        System.out.println("What would you like to do?: \n 1) Call a number\n 2) Check your card");
        int calledNum = 0; 
        String choice = input.next(); //1 or 2 

        if (choice.equals("1")) {// if user chooses 1 
            System.out.print("Enter the called number: ");
            calledNum = input.nextInt();//User enters the called number
            card.checkCard(bingo, calledNum);//card function checks to see if there's a match 
            bingo = card.getCard();//card update
            card.printBINGOCard();

        }

        if (choice.equals("2")) { //if user chooses 2 
            card.printBINGOCard();
        }
    }

}
