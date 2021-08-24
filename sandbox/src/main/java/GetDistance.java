package main.java;

public class GetDistance {
    public static void main(String [] args){
        Point p1 = new Point(3, 5);
        Point p2 = new Point(7, 1);

        String s = String.format("Расстояние между точками %d,%d и %d,%d = %f", p1.x, p1.y, p2.x, p2.y, p1.distance(p2));
        System.out.println(s);

    }
}
