package threading.proCom;

class Counter {

    int count;
    boolean valueSet = false;

    public synchronized void getCount() {
        while (!valueSet) {
            try {
                wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        System.out.println("get : " + count + "\n");
        valueSet = false;
        notify();
    }

    public synchronized void setCount(int count) {
        while (valueSet) {
            try {
                wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        System.out.println("set : " + count);
        this.count = count;
        valueSet = true;
        notify();
    }
}
