/*
 * This is a generic box.
 */
package oot.generics;

/**
 * This is a generic box.
 * @author dan_r
 * @param <T> T is generic type that can be replaced with a local type on call.
 */
public class Box<T extends Number>{
	private T content;

	public T getContent() {
		return content;
	}

	public void setContent(T content) {
		this.content = content;
	}
	
}
