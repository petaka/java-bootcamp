import static org.junit.Assert.*;

import org.junit.Test;


public class WordTest {

	@Test
	public void return_Word_test() {
		Word word = new Word("word");
		assertEquals(word.getWord(), "word");
	}

	@Test  
	public void wrapWord(){
		Word word = new Word("Hello World");
		assertEquals(word.wrap(word.getWord(), 5), "Hello, World");
	}
	
	@Test  
	public void wrapWord_II(){
		Word word = new Word("Hello World");
		assertEquals(word.wrap(word.getWord(), 3), "Hel, lo , Wor, ld");
	}
	
	@Test  
	public void wrapWord_III(){
		Word word = new Word("Hello World");
		assertEquals(word.wrap(word.getWord(), 20), "Hello World");
	}
}