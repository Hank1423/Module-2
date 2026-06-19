public class NumberGenerator implements Runnable {
    @Override
    public void run(){
        try {
            for(int i = 0; i < 10; i++){
                String threadName = Thread.currentThread().getName();
                int hashCode = this.hashCode();
                System.out.println("Thread: " + threadName + " | Number: " + i + " | HashCode: " + hashCode);
                Thread.sleep(500);
            }
        } catch (InterruptedException e){
            System.out.println("Thread interrupted: " + e.getMessage());
        }
    }
}
