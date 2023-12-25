package laba_3;

public class Lamp extends Item implements Fired {
	private boolean firing;
	Lamp(String name) {
		super(name);
	}
	Lamp(int count, String name) {
		super(count, name);
	}
	@Override
	public void fire() {
		System.out.println(this.getItem()+ "горит");
		this.firing = true;
		
	}
	@Override
	public void nofire() {
		System.out.println(this.getItem()+ "потух");
		this.firing = false;
	}
	public void hanging(Item under, Item on) {
		System.out.println(this.getItem()+ "висел у " + under.getItem() + "над " + on.getItem());
		this.firing = false;
	}
	@Override
	public void shine(Light light, Lighting lighting) {
		System.out.println(this.getItem()+ " освещает " + lighting.getLigtning() + " " + light.getLight());
		
	}
	@Override
	protected void getProp(String string) {
		// TODO Auto-generated method stub
		
	}

	
}
