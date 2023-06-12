import java.util.Random;

class NumberGenerator implements Runnable {
    private Random random = new Random();

    public void run() {
        while (true) {
            int number = random.nextInt(100);
            System.out.println("Generated number: " + number);

            if (number % 2 == 0) {
                new Thread(() -> System.out.println("Square of " + number + ": " + (number * number))).start();
            } else {
                new Thread(() -> System.out.println("Cube of " + number + ": " + (number * number * number))).start();
            }

            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}

public class MultiThreadApp {
    public static void main(String[] args) {
        Thread numberGeneratorThread = new Thread(new NumberGenerator());
        numberGeneratorThread.start();
    }
}
