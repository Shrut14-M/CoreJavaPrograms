package com.constructorInBuiltMethods;

public class Circle {
int radius;
public Circle(int radius) {
	this.radius= radius;
	float area= 3.14f * radius* radius;
	System.out.println("Area of Circle is=" +area);
}
@Override
public String toString() {
	return "Circle [radius=" + radius + "]";
}

}
