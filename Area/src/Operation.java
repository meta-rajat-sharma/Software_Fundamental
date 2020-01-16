
public class Operation {
	/*
	 * Used for Finding Area of Triangle
	 * @param base : for getting base
	 * @param height : for getting height 
	 * @return (base*height)/2 : for returning area
	 */
	public double AreaTriangle(double base,double height){
		return (base*height)/2;
	}
	/*
	 * Used for Finding Area of Rectangle
	 * @param base : for getting base
	 * @param height : for getting height
	 * @return base*height : for returning Area
	 */
	public double AreaRectangle(double base,double height){
		return (base*height);
	}
	/*
	 * Used for Finding Area of Square
	 * @param side : for getting side
	 * @return side*side : for returning Area
	 */
	public double AreaSquare(double side){
		return (side*side);
	}
	/*
	 * Used for Finding Area of Circle
	 * @param radius : for getting radius
	 * @return PI*radius*radius : for returning Area
	 */
	public double AreaCircle(double radius){
		return (Math.PI*radius*radius);
	}
}
