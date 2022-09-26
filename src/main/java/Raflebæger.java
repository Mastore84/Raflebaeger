import java.util.Random;

public class Raflebæger {

    private int numberOfDice;
    private int[] dice;


    public Raflebæger(int numberOfDice){
        this.numberOfDice = numberOfDice;
        dice = new int[numberOfDice];
    }

    public int ryst() {
        Random rand = new Random();
        int sum = 0;
        //Loop for each number of dice
        for (int i = 0; i < numberOfDice; i++){
            //random number between 1 and 6
            int randomNumber = rand.nextInt(6) + 1;
            //add to array
            dice[i] = randomNumber;
            //adds and return total number of facings
            sum = sum + randomNumber;
        }
        return sum;
    }

    //return dice
    public int[] se(){
        return dice;
    }
}
