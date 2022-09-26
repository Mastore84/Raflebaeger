public class Main {

    public static void main(String[] args) {
        Raflebæger raflebæger = new Raflebæger(2);

        int totalNumberOfFacings = raflebæger.ryst();
        System.out.println(totalNumberOfFacings);
        int[] dice = raflebæger.se();
        for (int number : dice){
            System.out.println(number);
        }
    }
}

