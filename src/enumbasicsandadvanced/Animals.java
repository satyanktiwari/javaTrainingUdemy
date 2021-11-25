package enumbasicsandadvanced;

public enum Animals {
	Cat("Dual"), Dog("silky"), Mouse("Catty");
	
	private String name;

	Animals(String name){
		this.name=name;
	}

	public String getName() {
		return name;
	}
	
	public String toString() {
		return "This adnimal is called:" + name;
	}
	
}
