/*
 * Class says hello in German language
 */

/**
 * Class says hello in German language
 * @author dan_r
 */
public class SayHelloInGerman extends SayHello{
	@Override
	public void sayHello() {
		super.displayLine();
		System.out.println("Hallo Welt!");
	}
}
