package school.mjc.stage0.conditions.task1;

public class PositiveNumberDeterminer {
    public void isPositive(int numberToBeDetermined) {
        boolean positive = numberToBeDetermined > 0;

        if (positive == true) {
            System.out.println(true);
        } else {
            System.out.println(false);
        }
    }

    public static void main(String[] arg){
        PositiveNumberDeterminer newPositiveNumberDeterminer = new PositiveNumberDeterminer();
        newPositiveNumberDeterminer.isPositive(-10);

    }
}
