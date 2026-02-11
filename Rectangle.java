// A Rectangle class
public class Rectangle {
  
  // 4 instance attributes
  public double width;
  public double height;
  public double originX = 0.0;
  public double originY = 0.0;

  // 1 static attributes
  public static final int NUMBER_OF_SIDES = 4;

  // main constructor
  public Rectangle(double width, double height, double originX, double originY) {
    this.width = width;
    this.height = height;
    this.originX = originX;
    this.originY = originY;
  }

  // second constructor: 
  public Rectangle(double width, double height) {
    this(width, height, 0, 0);
  }

  // third constructor: 
  public Rectangle() {
  this(1,1,0,0);
  }

  // method: move the rectangle
  public void move(double dx, double dy) {
	   this.originX += dx;
	   this.originY += dy;
  }

  // method: compute the area of the rectangle
  public double getArea() {
    return this.width * this.height;
  }
  
  // method: compute the area of the rectangle
  public double getPerimeter() {
    return 2 * (this.width + this.height);
  }

  // method: scale a rectangle: same across both dimensions
  public void scale(double scaleFactor) {
    this.height = this.height * scaleFactor;
    this.width = this.width * scaleFactor;
  }
  
    // method: scale a rectangle, unique across each dimensions
  public void scale(double scaleFactorX, double scaleFactorY) {
    this.height = this.height * scaleFactorY;
    this.width = this.width * scaleFactorX;
  }

  public boolean isOverlappedWith(Rectangle rect) {
    boolean overlapping = false;
    if (this.originX >= rect.originX && this.originX <= rect.originX + rect.width)
       if (this.originY >= rect.originY && this.originY <= rect.originY + rect.height){
          overlapping = true;}

    if (this.originX <= rect.originX && this.originX >= rect.originX - rect.width)
       if (this.originY <= rect.originY && this.originY >= rect.originY - rect.height){
          overlapping = true;}

    return overlapping;
  }
}
