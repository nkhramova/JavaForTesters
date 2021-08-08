
public class GetDistance {
    public static void main(String [] args){
        Point p1 = new Point();
        p1.x = 2;
        p1.y = 5;

        Point p2 = new Point();
        p2.x = 7;
        p2.y = 3;

        String s = String.format("Расстояние между точками %d,%d и %d,%d = %f", p1.x, p1.y, p2.x, p2.y, Point.distance(p1, p2));
        System.out.println(s);

    }
}
