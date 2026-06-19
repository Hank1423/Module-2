public class Main {
    public static void main(String[] args){
        NumberGenerator gen1 = new NumberGenerator();
        NumberGenerator gen2 = new NumberGenerator();

        Thread thread1 = new Thread(gen1, "Generator 1");
        Thread thread2 = new Thread(gen2, "Generator 2");

        thread1.setPriority(Thread.MAX_PRIORITY);
        thread2.setPriority(Thread.MIN_PRIORITY);

        System.out.println("Thread running");
        thread1.start();
        thread2.start();
    }
}
