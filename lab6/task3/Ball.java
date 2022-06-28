package lab6.task3;
//package task3;

public class Ball 
{
    public static void main(String[] args) {
        double pi = Math.PI;
        double Cylinder_volume = pi * 5.5 * 5.5 * 7.5;
        double Ball_volume = pi * 4 * (5.5 * 5.5 * 5.5 / 3);
        double Pyramid_volume = 9.2 * 4.3 / 3;
        System.out.println("volumes:\nCylinder " 
                        + Cylinder_volume + "\nBall"
                        + Ball_volume + "\nPyramid"
                        + Pyramid_volume);
    }
}

