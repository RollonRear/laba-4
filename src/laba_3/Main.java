package laba_3;

import java.io.ObjectInputStream.GetField;
import java.util.ArrayList;
import java.util.List;

public class Main {

	public static void main(String[] args) throws NoOpinion {
		Class<?> classes[] = new Class[12];
		Class<?> firedClasses[] = new Class[3];
		
		Person karlson = new Person("Карлсон");
		Person littleboy = new Person("Малыш");
		Fire fire = new Fire("Огонь");
		Log log = new Log(2, "полено");
		log.setSize(" больших ");
		log.setTypeTree(TypeTree.BIRCH);
		ComeIn comin = new ComeIn ("камин");
		Room room = new Room("комната");
		Lamp lamp = new Lamp("Керосиновая лампа");
		Light light = new Light("свет");
		light.setProp("теплым, живым");
		Things things= new Things("вещи");
		Workbench workbench = new Workbench("верстак");
		Roof roof = new Roof("потолок");
		Game game = new Game("Игра");
		classes[0] = Person.class;
		classes[1] = Fire.class;
		classes[2] = Log.class;
		classes[3] = ComeIn.class;
		classes[4] = Room.class;
		classes[5] = Lamp.class;
		classes[6] = Light.class;
		classes[7] = Things.class;
		classes[8] = Workbench.class;
		classes[9] = Roof.class;
		classes[10] = Game.class;
		classes[11] = Person.class;
		
		int k = 0;
		for(int i = 0; i< 12; i++) {
			//println(classes[i].getInterfaces());
			if(classes[i].getInterfaces().length != 0) {
				//System.out.println(classes[i].getInterfaces()[0].toString());
				if (classes[i].getInterfaces()[0].toString().equals("interface laba_3.Fired")) {
					//System.out.println(classes[i]);
					firedClasses[k] = classes[i	];
					k++;
				}
			}
		}
		
		karlson.stand();
		karlson.drop(fire, log);
		System.out.print("Когда ");
		comin.nofire();
		room.unshining();
		karlson.tofire(lamp);
		lamp.hanging(roof, workbench);
		lamp.shine(light, room);
		lamp.shine(light, things);
		things.wallow(workbench);
		littleboy.ask("Не могли бы мы чем-нибудь обменятся");
		karlson.say("Я готов. Но когда ты захочешь что-нибудь взять, ты должен сперва спросить у меня разрешения. Иногда я буду говорить «да», а иногда — «нет»… Хотя чаще всего я буду говорить «нет», потому что всё это моё и я не хочу ни с чем расставаться, а то я не играю.");
		{
			class AllThings extends Things{
				private Item place;
				AllThings(String name, Item place) {
					super(name);
					this.place = place;
				}
				@Override
				String getItem() {
					return (super.getItem() + " на " + place.getItem());
				}
				
			}
			AllThings allthings = new AllThings("все вещи", workbench);
			littleboy.ask(allthings);
		}
		Item clock = new Item("будильник") {
			private String prop;
			protected void getProp(String prop){
				this.prop = prop;
			}
			@Override
			String getItem() {
				return (prop + super.getItem());
			}
		};
		clock.getProp("старый разбитый ");
		littleboy.get(clock);
		System.out.print("Который ");
		karlson.parse(clock);
		System.out.print("А потом ");
		karlson.assemble(clock);
		
		game.giveIm(1);
		game.be();
		littleboy.noimagine("ничего более увлекательного");
		karlson.bored();
		karlson.offer("постолярничать");
		karlson.say("Это самое веселое на свете занятие, и можно сделать так много чудесных вещиц");
	}

}
