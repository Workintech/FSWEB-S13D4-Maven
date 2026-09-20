package org.example;

public class Point {
    private int x;
    private int y;

    public Point(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    // 1. distance() -> (0,0) noktasına göre uzaklık
    public double distance() {
        return distance(0, 0);
    }

    // 2. distance(Point p) -> Başka bir Point objesine göre uzaklık
    public double distance(Point p) {
        if (p == null) {
            return distance(0, 0);
        }
        return distance(p.getX(), p.getY());
    }

    // 3. distance(int a, int b) -> (a,b) noktasına göre uzaklık
    public double distance(int a, int b) {
        int xDiff = this.x - a;
        int yDiff = this.y - b;
        return Math.sqrt(xDiff * xDiff + yDiff * yDiff);
    }
}