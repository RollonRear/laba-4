package laba_3;

public class Game {
	private String name;
	private TypeIm type;
	Game (String name){
		this.name = name;
	}
	public void be() {
		System.out.println(name + " была " + type.get());
	}
	public void giveIm(int im) throws NoOpinion {
		if (im == 1) {
			type = TypeIm.INTERESTING;
		} else if (im == 2) {
			type = TypeIm.NONINTERESTING;
		} else new NoOpinion();
	}
	enum TypeIm {
		INTERESTING("интересная"),
		NONINTERESTING("неинтересная");
		
		private String name;
		
		TypeIm(String name) {
			this.name = name;
		}
		String get() {
			return name;
		}
	}
}
