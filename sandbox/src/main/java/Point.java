package main.java;

public class Point{

    public int x;
    public int y;

    public Point(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public double distance(Point p){
        return Math.sqrt(Math.pow((this.x - p.x),2) + Math.pow((this.y - p.y),2));
    }

}
