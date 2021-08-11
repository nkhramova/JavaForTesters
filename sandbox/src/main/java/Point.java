public class Point{

    public int p1_x;
    public int p2_x;
    public int p1_y;
    public int p2_y;

    public Point(int p1_x, int p1_y, int p2_x, int p2_y) {
        this.p1_x = p1_x;
        this.p1_y = p1_y;
        this.p2_x = p2_x;
        this.p2_y = p2_y;
    }

    public double distance(){
        return Math.sqrt(Math.pow((this.p2_x - this.p1_x),2) + Math.pow((this.p2_y - this.p2_y),2));
    };

}
