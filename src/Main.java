public class Main {
    public static void main(String[] args) {
        // объявление и заполнение первого массива
        int h;
        int g = 0;
        int[] A = new int[ (17 - 1) / 2 + 1 ];
        for (h = 1; h <= 17; h++) {
            if(h % 2 == 1) {
                A[g] = h;
            } else {
                g++;
            }
        }
        // объявление и заполнение второго массива
        final int X_SIZE = 19;
        final double MIN_RANGE = -5.0;
        final double MAX_RANGE = 13.0;
        double[] x = new double[X_SIZE];

        for (int i = 0; i < X_SIZE; i++) {
            x[i] = ((Math.random() * (MAX_RANGE - MIN_RANGE)) + MIN_RANGE);
        }
        // объявление и заполнение третьего массива
        final int A_FIRST_SIZE = 9;
        final int A_SECOND_SIZE = 19;
        double[][] a = new double[A_FIRST_SIZE][A_SECOND_SIZE];
        double cache;

        for (int i = 0; i < A_FIRST_SIZE; i++) {
            for (int j = 0; j < A_SECOND_SIZE; j++) {
                if(A[i] == 7) {
                    cache = Math.pow(Math.E, x[j]);
                    cache = Math.pow ((cache * (1 - Math.tan(x[j]))), 2);
                    cache = Math.pow(Math.E, cache);
                } else if (A[i] == 1 || A[i] == 3 || A[i] == 13 || A[i]==15) {
                    cache = Math.pow((x[j] + Math.PI),3);
                    cache = Math.pow(((Math.pow(x[j] * (x[j] - 1), 3) - 1) / (Math.asin((x[j] + 4) / 18))),cache);
                    cache = Math.pow(Math.E, cache);
                } else {
                    cache = Math.cbrt(Math.sin(x[j])) + Math.PI;
                    cache = Math.atan(Math.cos(x[j])) * cache + 1;
                    cache = Math.pow((Math.PI* cache), 3);
                }
                a[i][j] = cache;
            }
        }
        // Вывод итогового массива
        for (int i = 0; i < A_FIRST_SIZE; i++) {
            for (int j = 0; j < A_SECOND_SIZE; j++) {
                System.out.printf("%.2f  ", a[i][j] );
            }
            System.out.println();
        }
    }
}







