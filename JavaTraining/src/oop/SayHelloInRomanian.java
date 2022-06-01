/*
 * Class says hello in Romanian language
 */

/**
 * Class says hello in Romanian language
 * @author dan_r
 */
public class SayHelloInRomanian extends SayHello{
	@Override
	public void sayHello() {
		super.displayLine();
		System.out.println("Salut lume!");
	}
}
