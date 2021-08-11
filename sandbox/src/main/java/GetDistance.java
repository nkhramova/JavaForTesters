
public class GetDistance {
    public static void main(String [] args){
        Point p = new Point(3, 5, 7, 1);

        String s = String.format("Расстояние между точками %d,%d и %d,%d = %f", p.p1_x, p.p1_y, p.p2_x, p.p2_y, p.distance());
        System.out.println(s);

    }
}
