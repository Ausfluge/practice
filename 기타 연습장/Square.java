public class Square {
    public static void main(String[] args) {
        printSquare(3, 6);
    }

    public static void printSquare(int min, int max) {
        for (int repeat = min; repeat <= max; repeat++) {
            for (int num = repeat; num <= max; num++) {
                System.out.print(num);
            }
            for (int reset = 0; reset < repeat - min; reset++) {
                System.out.print(min + reset);
            }
            System.out.println();
        }
    }
}