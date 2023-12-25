package laba_3;

public abstract class Item {
	protected int count;
	protected String name;
	Item(String name){
		this.count = 1;
		this.name = name;
	}
	Item(int count, String name) throws CountException{
		if (count < 1) {
			throw new CountException();
		} else this.count = count;
		this.name = name;
	}
	void updateCount(int count) throws CountException {
		if (count < 1) {
			throw new CountException();
		} else this.count = count;
	}
	String getItem() {
		if (count != 1)
			return (name + " в количестве " + count);
		else return (name + " ");
	}
	@Override
	public String toString() {
		return this.getItem();
	}
	@Override
	public boolean equals(Object obj) {
		return super.equals(obj);
	}
	@Override
	public int hashCode() {
		return super.hashCode() + count;
	}
	protected abstract void getProp(String string);
}
