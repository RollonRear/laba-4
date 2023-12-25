package laba_3;

public class Log extends Item{
	
	private TypeTree type;
	private String size;
	Log(String name) {
		super(name);
	}
	Log(int count, String name) {
		super(count, name);
	}
	public void setTypeTree(TypeTree type) {
		this.type = type;
	}
	public void setSize(String size) {
		this.size = size;
	}
	@Override
	String getItem() {
		if (count != 1)
			return( size  + type.getType() + " " + name + " в количестве " + count);
		else return( size + type.getType() + name);
	}
	@Override
	protected void getProp(String string) {
		// TODO Auto-generated method stub
		
	}
}
