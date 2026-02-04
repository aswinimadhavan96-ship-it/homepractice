class CircleArea1 extends Shape
 {
    CircleArea1(double radius)
	{
        super(radius);
    }


    double calculateArea()
	{
        return 3.14 * value * value;
    }
}
