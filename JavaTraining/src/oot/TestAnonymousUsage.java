/*
 * Testing anonymous classes usage
 */
package oot;

/**
 * Testing anonymous classes usage
 * @author dan_r
 */
public class TestAnonymousUsage {
	interface SayHello{
		public void sayHello();
	}
	
	/**
	 * @param args the command line arguments
	 */
	public static void main(String[] args) {
		// usage fo classical local class
		class SayHelloInEnglish implements SayHello{

			@Override
			public void sayHello() {
				System.out.println("Hello world!");
			}
		
		}
		SayHelloInEnglish englishObject = new SayHelloInEnglish();
		englishObject.sayHello();
		//  same code using an anonymous class
		SayHello englishAnonymousObject = () -> {
			System.out.println("Hello world!");
		};
		englishAnonymousObject.sayHello();
		// use anonymous code for German Language
		SayHello germanAnonymousObject = () -> {
			System.out.println("Hallo Welt!");
		};
		germanAnonymousObject.sayHello();	
		// say hello in Romanian
		SayHello romanianAnonymousObject = () -> {
			System.out.println("Salut lume!");
		};
		romanianAnonymousObject.sayHello();
	}			
}
