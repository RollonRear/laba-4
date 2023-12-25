package laba_3;

public enum TypeTree {
	OAK ("Дубовых"),
	BIRCH ("Берёзовых"),
	ACACIA ("Акациевых"),
	PINE ("Сосновых"),
	MAPLE ("Клённных");
	
	private String type;
	TypeTree(String type){
		this.type = type;
	}
	public String getType () {
		return type;
	}
}
