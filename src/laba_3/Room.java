package laba_3;

public class Room implements Lighting {
	private String name;
	private boolean lighting;
	
	Room(String name){
		this.name = name;
	}
	
	@Override
	public void shining(Light light) {
		System.out.println(name + " сияет" );
		lighting = true;
	}

	@Override
	public void unshining() {
		System.out.println("в " + name + " потемнело" );
		lighting = false;
	}

	@Override
	public String getLigtning() {
		return name;
	}
	
}
