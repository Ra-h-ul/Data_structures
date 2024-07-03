public class Get_factorial_I {

    public static void Fact(int N, int ANS) {
        if (N == 0) {
            System.out.println(ANS);
            return;
        }
        Fact(N - 1, ANS * N);
    }

    public static void Fact(int N) {
        Fact(N, 1);
    }

    public static void main(String[] args) {

        Fact(0);
    }
}
