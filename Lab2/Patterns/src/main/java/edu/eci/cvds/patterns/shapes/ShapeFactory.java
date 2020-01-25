package edu.eci.cvds.patterns.shapes;
public class ShapeFactory{
	public static void main(String shape){
		switch(shape){
			case "Quadrilateral" :
				RegularShapeType forma=RegularShapeType.Quadrilateral;
				system.out.println(forma.getNumberOfEdges());
				break;
			/*case "Triangle":
				new Triangle();
				break;
			case "Hexagon":
				new Hexagon();
				break;
				
			case "Pentagon":
				new Pentagon();
				break;*/
			default : System.out.println("Figura no renoconcida.");
			break;
		}
	}
}