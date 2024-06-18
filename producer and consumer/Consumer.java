package threading.proCom;

class Consumer implements Runnable {
    Counter counter;

    public Consumer(Counter counter) {
        this.counter = counter;
        Thread t = new Thread(this, "Consumer");
        t.start();
    }


    @Override
    public void run() {
        while (true) {
            counter.getCount();
            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
            }
        }
    }
}