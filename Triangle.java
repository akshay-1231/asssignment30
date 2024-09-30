
package assignment30;

public class Triangle {
           private double s1;
           private double s2;
           private double s3;
           
          
	public Triangle(double s1, double s2, double s3) {
			super();
			this.s1 = s1;
			this.s2 = s2;
			this.s3 = s3;
		}

    public double perimeter() {
    	return s1+s2+s3;
    }
    public double area()
    {
    	  double s=perimeter()/2;
          return Math.sqrt(s * (s - s1) * (s - s2) * (s - s3));
    	  
    }




	public static void main(String[] args) {
		// TODO Auto-generated method stub
         Triangle triangle =new Triangle(3,4,5);
         System.out.printf("Perimeter of the triangle:%2f ", triangle.perimeter());
         System.out.printf("area of the triangle:%2f",triangle.area());
	}

}
