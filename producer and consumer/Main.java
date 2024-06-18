package threading.proCom;

public class Main {
    public static void main(String[] args) {
        Counter counter = new Counter();
        new Producer(counter);
        new Consumer(counter);
    }
}


