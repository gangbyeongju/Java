package ch06.exam09;

public class Calculator {
	//사각형 면적
	double area(double w) {
		return w * w;
	}
	
	double area(double w, double h) {
		return w * h;
	}
	
	//원의 면적
	double areaCircle(double r) {
		return r * r * Math.PI;
	}
	
}