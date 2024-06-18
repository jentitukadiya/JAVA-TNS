package threading.proCom;

class Producer implements Runnable {
    Counter counter;
    public Producer(Counter counter) {
        this.counter = counter;
        Thread t = new Thread(this, "Producer");
        t.start();
    }


    @Override
    public void run() {
        int i = 0;
        while (true) {
            counter.setCount(i++);
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
            }
        }
    }
}
