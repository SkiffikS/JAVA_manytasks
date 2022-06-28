package lab6.task3;

public class Shape 
{
    double volume;

    static double getVolume(double volume)
    {
        return volume;
    }

    public static void main(String[] args) 
    {
        Cylinder cylinder = new Cylinder();
        Pyramid pyramid = new Pyramid();
        Ball ball = new Ball();
        SolidOfRevilution s = new SolidOfRevilution();

        double pi = Math.PI;
        // Volume Cylinder = pi * r^2 * h
        double r = s.radius;
        double Cylinder_volume = getVolume(pi * r * r * cylinder.height);
        // Volume Ball = 4 * pi * (r ^ 3 / 3)
        double Ball_volume = getVolume(4 * pi * (r * r * r / 3));
        // Volume Pyramid = 1/3 * S * h
        double Pyramid_volume = getVolume(1 * pyramid.s * pyramid.h / 3);

        System.out.println("volumes:\nCylinder " 
                        + Cylinder_volume + "\nBall"
                        + Ball_volume + "\nPyramid"
                        + Pyramid_volume);
    }
}

