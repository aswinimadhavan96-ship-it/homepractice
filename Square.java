class Square extends Shape
 {
    Square(double side)
	{
        super(side);
    }

    double calculateArea() 
	{
        return value * value; // Area = side^2
    }
}
