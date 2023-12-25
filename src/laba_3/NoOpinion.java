package laba_3;

import java.util.Objects;

public class NoOpinion extends Exception {
	private static final long serialVersionUID = 1890799L;

	NoOpinion(){
		super();
		System.out.println("УБЕРИ СВОЁ МНЕНИЕ ОБ ИГРЕ ПОДАЛЬШЕ");
	}
}
