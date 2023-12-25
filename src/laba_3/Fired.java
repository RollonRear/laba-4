package laba_3;

public interface Fired {
	void fire();
	void nofire();
	void shine(Light light, Lighting lighting);
	@Override
	String toString();
}
