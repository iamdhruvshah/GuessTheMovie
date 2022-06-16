public class Main {

    public static void main(String[] args) throws Exception {

        Game myGame = new Game();
        boolean theUserWon = myGame.theUserWon;

        //The result
        if (theUserWon) {

            System.out.println("Congrats, YOU WON!");

        } else {

            System.out.println("You just LOST! Try Again!");

        }

    }

}
