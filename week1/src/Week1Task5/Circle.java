package Week1Task5;

public class Circle {
    //成员变量
    double radius; //圆半径
    //成员方法
    public double getArea(){ //求圆面积
        double area = 3.14 * radius * radius;
        return area;
    }

    public double getPerimeter(){ //求圆周长
        double perimeter = 2 * 3.14 * radius;
        return perimeter;
    }
}
