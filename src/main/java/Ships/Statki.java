package Ships;

public class Statki {

    private int[] numbers = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
    private char[] chars = {'A', 'B', 'C', 'D', 'E', 'F', 'G', 'H', 'I', 'J'};

    public void plansza() {

        for (int i = 0; i <= numbers.length; i++) {
            for (int j = 0; j <= chars.length; j++) {
                if (i == 0 && j == 0) {
                    System.out.print(String.format("%4s", String.format("%-4s", " ")));
                }
                if (i == 0 && j != 0) {
                    System.out.print(String.format("%4s", String.format("%-4s", chars[j - 1])));
                }
                if (i != 0 && j == 0) {
                    System.out.print(String.format("%4s", String.format("%-4s", numbers[i - 1])));
                }
                if (i != 0 && j != 0)
                    System.out.print(String.format("%4s", String.format("%-4s", "_")));
            }
            System.out.println();
        }
    }
}
