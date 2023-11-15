import java.util.ArrayList;
import java.util.HashSet;
import java.util.Random;

public class Roulette {

    private int[] straightUp, street, corner, topLine, doubleStreet, firstColumn, secondColumn, thirdColumn, firstDozen, secondDozen, thirdDozen, odd, even, red, black, oneToEighteen, nineteenToThirtysix;
    private ArrayList<Integer> oddList, evenList, redList, blackList, oneToEighteenList, nineteenToThirtysixList, zeroList;
    private HashSet<Integer> oddSet, evenSet, redSet, blackSet, oneToEighteenSet, nineteenToThirtysixSet;

    public Roulette() {

        straightUp = new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20, 21, 22, 23, 24, 25, 26, 27, 28, 29, 30, 31, 32, 33, 34, 35, 36};
        // street = new int[] {};
        // corner = new int[] {};
        // topLine = new int[] {};
        // doubleStreet = new int[] {};
        // firstColumn = new int[] {};
        // secondColumn = new int[] {};
        // thirdColumn = new int[] {};
        // firstDozen = new int[] {};
        // secondDozen = new int[] {};
        // thirdDozen = new int[] {};
        odd = new int[]{1, 3, 5, 7, 9, 11, 13, 15, 17, 19, 21, 23, 25, 27, 29, 31, 33, 35};
        even = new int[]{2, 4, 6, 8, 10, 12, 14, 16, 18, 20, 22, 24, 26, 28, 30, 32, 34, 36};
        red = new int[]{32, 19, 21, 25, 34, 27, 36, 30, 23, 5, 16, 1, 14, 9, 18, 7, 12, 3};
        black = new int[]{15, 4, 2, 17, 6, 13, 11, 8, 10, 24, 33, 20, 31, 22, 29, 28, 35, 26};
        oneToEighteen = new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18};
        nineteenToThirtysix = new int[]{19, 20, 21, 22, 23, 24, 25, 26, 27, 28, 29, 30, 31, 32, 33, 34, 35, 36};

        oddList = new ArrayList<>();
        evenList = new ArrayList<>();
        redList = new ArrayList<>();
        blackList = new ArrayList<>();
        oneToEighteenList = new ArrayList<>();
        nineteenToThirtysixList = new ArrayList<>();
        zeroList = new ArrayList<>();

        oddSet = new HashSet<>();
        evenSet = new HashSet<>();
        redSet = new HashSet<>();
        blackSet = new HashSet<>();
        oneToEighteenSet = new HashSet<>();
        nineteenToThirtysixSet = new HashSet<>();

        for (int i : odd) {
            oddSet.add(i);
        }

        for (int i : even) {
            evenSet.add(i);
        }

        for (int i : red) {
            redSet.add(i);
        }

        for (int i : black) {
            blackSet.add(i);
        }

        for (int i : oneToEighteen) {
            oneToEighteenSet.add(i);
        }

        for (int i : nineteenToThirtysix) {
            nineteenToThirtysixSet.add(i);
        }

    }

    public int spin() {
        Random r = new Random();
        int num = 0;

        num = r.nextInt(0, 36);
        return num;
        
    }

    public void result() {
        int num = spin();

        if (oddSet.contains(num)) {
            oddList.add(num);
        }

        if (evenSet.contains(num)) {
            evenList.add(num);
        }

        if (redSet.contains(num)) {
            redList.add(num);
        }

        if (blackSet.contains(num)) {
            blackList.add(num);
        }

        if (oneToEighteenSet.contains(num)) {
            oneToEighteenList.add(num);
        }

        if (nineteenToThirtysixSet.contains(num)) {
            nineteenToThirtysixList.add(num);
        }

        if (num == 0) {
            zeroList.add(num);
        }
    }

    public static void main(String[] args) {
        Roulette roulette = new Roulette();
        // System.out.println(roulette.spin());

        for(int i = 0; i < 100; i++) {
            roulette.result();
        }
        System.out.println("0 - " + roulette.zeroList);
        System.out.println("Odd - " + roulette.oddList);
        System.out.println("Even - " + roulette.evenList);
        System.out.println("Red - " + roulette.redList);
        System.out.println("Black - " + roulette.blackList);
        System.out.println("1-18 - " + roulette.oneToEighteenList);
        System.out.println("19-36 - " + roulette.nineteenToThirtysixList);
    }

}