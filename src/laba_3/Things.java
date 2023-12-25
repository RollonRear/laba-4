package laba_3;

public class Things extends Item implements Lighting {

	Things(String name) {
		super(name);
	
	}
	Things(int count, String name) {
		super(count, name);
	}
	public void wallow(Item item) {
		System.out.println(name + " валяется на " + item.getItem());
	}
	@Override
	public void shining(Light light) {
		System.out.println(name + " сияет" );
		boolean lighting = true;
	}

	@Override
	public void unshining() {
		System.out.println("в " + name + " потемнело" );
		boolean lighting = false;
	}

	@Override
	public String getLigtning() {
		return name;
	}
	@Override
	protected void getProp(String string) {
		// TODO Auto-generated method stub
		
	}

}
