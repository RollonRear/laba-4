package laba_3;

public class CountException extends RuntimeException {
	private static final long serialVersionUID = 122411L;

	CountException(){
		super();
		System.out.println("НЕДОПУСТИМОЕ КОЛИЧЕСТВО ПРЕДМЕТОВ");
	}
}
