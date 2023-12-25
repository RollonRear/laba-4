package laba_3;

public class ComeIn extends Item implements Fired{
	private boolean firing;
	ComeIn(String name) {
		super(name);
	}
	ComeIn(int count, String name) {
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
	@Override
	public void shine(Light light, Lighting lighting) {
		System.out.println(this.getItem()+ " освещает " + lighting.getLigtning() + " " + light.getLight());
		
	}
	@Override
	protected void getProp(String string) {
		// TODO Auto-generated method stub
		
	}
}
