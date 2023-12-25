package laba_3;

public class Light {
	private String properties;
	Light(){
		this.properties = "";
	}
	Light(String properties) {
		this.properties = properties;
	}
	public void setProp(String properties) {
		this.properties = properties;
	}
	public String getLight() {
		return properties + " светом";
	}
}
