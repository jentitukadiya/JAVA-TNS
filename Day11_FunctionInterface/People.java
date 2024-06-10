package Day11_FunctionInterface;

public class People implements Greeting {
    public void fun() {
        System.out.println("Hello");
    }

    public static void main(String[] args) {
        People ob = new People();
        ob.fun();
    }
}
