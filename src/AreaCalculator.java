import java.util.Scanner;
public class AreaCalculator{
	float  length;
	float  breath;
	float  radius;
	double base;
	double height;
/*
AreaCalculator(float  length,float  breath){
	this.length = length;
	this.breath = breath;
}
AreaCalculator(float length,float breath){
	this.length = length;
	this.breath = breath;
}
AreaCalculator(float base,float height){
	this.length = length;
	this.breath = breath;
}

*/


float calculateArea(float rad1){
	return((float)(Math.PI*rad1*rad1));
}
float calculateArea(float len1, float breadth1){
	return(len1*breadth1);
}
double calculateArea(double base, double height){
	return(.5*height* base);
}

public static void main(String [] args){
	Scanner sc = new Scanner(System.in);
	float r1;
	AreaCalculator A1 = new AreaCalculator();
	System.out.println("enter the radius");
	r1 = sc.nextFloat();
	System.out.print("enter the length");
	float l1 = sc.nextFloat();
	System.out.println("enter the breath");
	float b1 = sc.nextFloat();
	System.out.print("enter the base");
	double base1 = sc.nextDouble();
	System.out.println("enter the height");
	double h1 = sc.nextDouble();
	float areaC = A1.calculateArea(r1);
	float areaR = A1.calculateArea(l1,b1);
	double areaT = A1.calculateArea(base1,h1);
	System.out.printf("%.2f\n",areaC);
	System.out.printf("%.2f\n",areaR);
	System.out.printf("%.2f\n",areaT);
}
}

