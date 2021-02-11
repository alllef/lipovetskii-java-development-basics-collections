public class Circle {

   private int xCoord;
   private int yCoord;
   private double radius;

    public int getxCoord() {
        return xCoord;
    }

    public void setxCoord(int xCoord) {
        this.xCoord = xCoord;
    }

    public int getyCoord() {
        return yCoord;
    }

    public void setyCoord(int yCoord) {
        this.yCoord = yCoord;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public Circle(int xcoord, int ycoord, double radius) {
        xCoord = xcoord;
        yCoord = ycoord;
        this.radius = radius;
    }

    static Circle generateCircle(){

        int tmpxCoord = (int) (Math.random() * 7);
        int tmpyCoord = (int)(Math.random()*7);
        double radius = Math.random()*3;

        return new Circle(tmpxCoord,tmpyCoord,radius);
    }

    @Override
    public String toString() {
        return "Circle{" +
                "xCoord=" + xCoord +
                ", yCoord=" + yCoord +
                ", radius=" + radius +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Circle circle = (Circle) o;

        if (xCoord != circle.xCoord) return false;
        if (yCoord != circle.yCoord) return false;
        return Double.compare(circle.radius, radius) == 0;
    }

    @Override
    public int hashCode() {
        int result;
        long temp;
        result = xCoord;
        result = 31 * result + yCoord;
        temp = Double.doubleToLongBits(radius);
        result = 31 * result + (int) (temp ^ (temp >>> 32));
        return result;
    }
}
