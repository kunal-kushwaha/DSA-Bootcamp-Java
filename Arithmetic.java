class Arithmetic{
	public static void main(String args[]){
		int a=5,b=789;
		float f1=89.456f,f2=46.36f;//declare floats with f at end
		double d1=45.235252;
		//int isum=a+b+f1+f2+d1;   Removed both these lines since it cant be performed
		//float fsum=a+b+f1+f2+d1;
		double dsum=a+b+f1+f2+d1;
		int difofab=a-b;
		//System.out.println("Integer Sum of all numbers is "+ isum);
		//System.out.println("Float Sum of all numbers is "+ fsum);
		System.out.println("Double Sum of all numbers is "+ dsum);
		System.out.println("Difference of a and b is "+ difofab);
	}
}

//Note downs

/* 1.We cant assign a value of bigger size to another variable whose datatypes 
  size is less than the earlier one
  2.for eg we cant assign a double value to an integer variable explicitly
  3.this is called Lossy coversion 
  4.In order to this we need to use explicit methods for conversion
  
  */
  
//Key points

/* Declare float variables with letter f
  */
  
  