package edu.eci.cvds.patterns.shapes;

import edu.eci.cvds.patterns.shapes.concrete.*;

public class ShapeFactory{
	public static Shape create(RegularShapeType shape){
		switch(shape.name()){
			case "Triangle":
				return new Triangle();
			case "Quadrilateral":
				return new Quadrilateral();
			case "Pentagon":
				return new Pentagon();
			case "Hexagon":
				return new Hexagon();
			default : System.out.println("Figura no renoconcida.");
			return null;
		}
	}
}