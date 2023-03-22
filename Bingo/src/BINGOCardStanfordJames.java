public class BINGOCardStanfordJames {
    private static int[][] card;

    public BINGOCardStanfordJames() {
        card = new int[5][5];

        //Set the B column
        for (int i = 0; i < 5; i++) {
            card[i][0] = getRandomNumber(1, 15, card);
         }

        //Set the I column
        for (int i = 0; i < 5; i++) {
            card[i][1] = getRandomNumber(16, 30, card);
         }

        //Set the N column
        for (int i = 0; i < 5; i++) {
            if (i == 2) {
                card[i][2] = 0; //Free space
                continue;
            }
            card[i][2] = getRandomNumber(31, 45, card);
         }

        //Set the G column
        for (int i = 0; i < 5; i++) {
            card[i][3] = getRandomNumber(46, 60, card);
         }

        //Set the O column
        for (int i = 0; i < 5; i++) {
            card[i][4] = getRandomNumber(61, 75, card);
        }
    }

    //Generate a random number within the given range
    private int getRandomNumber(int min, int max, int[][] card) {
        int num = (int) (Math.random() * (max - min + 1)) + min;
        boolean duplicate = true;

        while (duplicate) {
            duplicate = false;

            //Check if num is a duplicate of any number already on the card
            for (int i = 0; i < card.length; i++) {
                for (int j = 0; j < card[i].length; j++) {
                    if (card[i][j] == num) {
                        duplicate = true;
                        num = (int) (Math.random() * (max - min + 1)) + min;
                        break;
                    }
                }
                if (duplicate) {
                    break;
                }
            }
        }

        return num;
    }

    //get function for the card array
    public int[][] getCard() {
        return card;
    }

    public void printBINGOCard() { //Method to reprint the current BINGO card
        System.out.print("B\tI\tN\tG\tO\n");
        for (int i = 0; i < card.length; i++) {
            for (int j = 0; j < card[i].length; j++) {
                System.out.print(card[i][j] + "\t");
            }
            System.out.println();
        }

    } //end of printBINGOCard

    public int[][] checkCard(int[][] card, int calledNum) { //This method checks to see if a number the user entered is on their card, if so, it becomes 0
        for (int i = 0; i < card.length; i++) {
            for (int j = 0; j < card[i].length; j++) {
                if (card[i][j] == calledNum) {
                    card[i][j] = 0;
                }
            }

        }
        return card;
    }

    public boolean checkBingo() {
        //Check rows
        for (int i = 0; i < card.length; i++) {
            boolean bingo = true;
            for (int j = 0; j < card[i].length; j++) {
                if (card[i][j] != 0) {
                    bingo = false;
                    break;
                }
            }
            if (bingo) {
                return true;
            }
        }
    
        //Check columns
        for (int j = 0; j < card[0].length; j++) {
            boolean bingo = true;
            for (int i = 0; i < card.length; i++) {
                if (card[i][j] != 0) {
                    bingo = false;
                    break;
                }
            }
            if (bingo) {
                return true;
            }
        }
    
        //Check diagonals
        boolean bingo = true;
        for (int i = 0; i < card.length; i++) {
            if (card[i][i] != 0) {
                bingo = false;
                break;
            }
        }
        if (bingo) {
            return true;
        }
    
        bingo = true;
        for (int i = 0; i < card.length; i++) {
            if (card[i][card.length - 1 - i] != 0) {
                bingo = false;
                break;
            }
        }
        if (bingo) {
            return true;
        }
    
        //No bingo
        return false;
    }
    

}
