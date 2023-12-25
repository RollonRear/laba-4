package laba_3;

public class Fire extends Item implements Fired {

	private boolean firing;

	Fire(int count, String name) {
		super(count, name);
	}
	Fire(String name) {
		super(name);
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

	@Override
	public void shine(Light light, Lighting lighting) {
		System.out.println(this.getItem()+ " освещает " + lighting.getLigtning() + " " + light.getLight());
		
	}
	@Override
	protected void getProp(String string) {
		// TODO Auto-generated method stub
		
	}
	


}
