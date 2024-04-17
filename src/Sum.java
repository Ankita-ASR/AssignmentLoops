public class Sum {
    public static void main(String[] args) {
        int sum = 0;
        for (int i = 2; i <= 100; i++) {
            if (i % 2 == 0) {
                sum = sum + i;
            }
        }
        System.out.printf("%d\n", sum);
        /* The sum of all squares between 1 and 100 (inclusive).*/
        int SquareSum = 0;
        for (int i = 1; i <= 10; i++) {
            for (int j = 1; j <= 10; j++) {
                if ((i * j) <=100) {
                    SquareSum = SquareSum + i*j;
                }
            }
        }
        System.out.printf("%d\n", SquareSum);
    }
}

