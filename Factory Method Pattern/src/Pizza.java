
public abstract class Pizza {

	String name;
	
	void Prepare(){
		System.out.println("Preparing "+name);
	}
	
	void Bake(){
		System.out.println("Baking...");
	}
	
	void Cut(){
		System.out.println("Cutting...");
	}
	
	void Box(){
		System.out.println("Place into Box...");
	}
	
	public String Getname(){
		return name;
	}
}
