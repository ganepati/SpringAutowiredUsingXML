package beans;

public class Car {
	
	private Engine engine;
	//if we have a declaration with setter then only that parameters having dependent parameters.   
	
	public void setEngine(Engine engine) {
		this.engine = engine;
	}
	public Engine getEngine() {
		return engine;
	}

	public void printData(){
		System.out.println("Model Year :  "+engine.getModelYear() );
	}

}
