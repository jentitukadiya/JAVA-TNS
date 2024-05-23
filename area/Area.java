package area;

import java.util.Scanner;

public class Area {
    double length;
    double breadth;


    public Area(double length, double breadth) {
        this.length = length;
        this.breadth = breadth;
    }

    public Area(){
        this.length = 0;
        this.breadth = 0;
    }

    public void setDim(double len, double brd) {
        length = len;
        breadth = brd;
    }

    public void setDim() {
        // Scanner scanner = new Scanner(System.in);
        // System.out.print("Enter length of rectangle: ");
        // length = scanner.nextDouble();

        // System.out.print("Enter breadth of rectangle: ");
        // breadth = scanner.nextDouble();

        // scanner.close();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        try{
            System.out.println("Enter length: ");
            this.length = Integer.parseInt(br.readLine());
            System.out.println("Enter breadth: ");
            this.breadth = Integer.parseInt(br.readLine());
        } catch (IOException e) {
            e.printStackTrace();
            System.out.println("Enter numeric value only");
        }
    }

    public double getArea() {
        return length * breadth;
    }

    public static void main(String[] args) {
        Area area = new Area();

        area.setDim(3.3, 5.0);
        System.out.println(area.getArea());

        Area area2 = new Area();
        area2.setDim();
        System.out.println(area2.getArea());
    }

}
