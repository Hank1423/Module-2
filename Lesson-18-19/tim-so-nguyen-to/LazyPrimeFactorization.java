class LazyPrimeFactorization implements Runnable {
    @Override
    public void run() {
        int number = 2;
        while (true) {
            if (isPrime(number)) {
                System.out.println("[" + Thread.currentThread().getName() + "] Tìm thấy: " + number);
            }
            number++;
        }
    }

    private boolean isPrime(int n) {
        if (n < 2) return false;
        for (int i = 2; i < n; i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }
}