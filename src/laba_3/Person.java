package laba_3;

public class Person {
	private String name;
	Person(String name){
		this.name = name;
	}
	public void tofire(Fired fired) {
		System.out.println(name + " зажёг " + fired.toString());
	}
	public void notofire(Fired fired) {
		System.out.println(name + " потушил " + fired.toString() );
	}
	public void stand() {
		System.out.println(name + " встал" );
	}
	public void drop(Item obj, Item sub) {
		System.out.println(name + " кинул в " + obj.getItem() + " " + sub.getItem());
	}
	public void ask(String what) {
		System.out.println(name + " спросил: '" + what + "'");
	}
	public void ask(Item what) {
		System.out.println(name + " спросил разрешения на " + what.getItem());
	}
	public void say(String what) {
		System.out.println(name + " сказал: '" + what + "'");
	}
	public void get(Item item) {
		System.out.println(name + " получил " + item.getItem());
	}
	public void parse(Item item) {
		System.out.println(name + " разобрал " + item.getItem());
	}
	public void assemble(Item item) {
		System.out.println(name + " собрал " + item.getItem());
	}
	public void noimagine(String item) {
		System.out.println(name + " не мог представить " + item);
	}
	public void bored() {
		System.out.println(name + " наскучило");
	}
	public void offer(String what) {
		System.out.println(name + " предложил " + what);
	}
}