/*
 * Class says hello in English language
 */

/**
 * Class says hello in English language
 * @author dan_r
 */
public class SayHelloInEnglish extends SayHello{
	@Override
	public void sayHello() {
		super.displayLine();
		System.out.println("Hello world!");
	}
}
