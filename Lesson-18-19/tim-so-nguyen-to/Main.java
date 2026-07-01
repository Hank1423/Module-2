public class Main {
    public static void main(String[] args) {
        LazyPrimeFactorization lazyTask = new LazyPrimeFactorization();
        OptimizedPrimeFactorization optimizedTask = new OptimizedPrimeFactorization();

        Thread lazyThread = new Thread(lazyTask, "Luồng lười biếng - Lazy");
        Thread optimizedThread = new Thread(optimizedTask, "Luồng tối ưu - Optimized");

        System.out.println("Bắt đầu cuộc đua tìm số nguyên tố giữa 2 luồng\n");

        lazyThread.start();
        optimizedThread.start();
    }
}