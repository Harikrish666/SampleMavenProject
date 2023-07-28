package inheritanceSample;

public class ChildFlower extends Flower {
	
	String name1 = "Child rose";
	
	public static void main(String [] args) {
		
		ChildFlower cf = new ChildFlower();
		System.out.println(cf.name);
	}

}
