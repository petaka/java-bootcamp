import static org.junit.Assert.*;


import org.junit.Test;


public class testList {

	@Test
	public void testOpenFile() {

		File file = new File("name");
		file.open(file);
		assertEquals(file.getList(), "name: ");
	}
	

@Test
public void testAddFile() {

	File file = new File("name");
	file.open(file);
	File file2 = new File ("file 2");
	file.open(file2); 
	
	assertEquals(file.getList(), "file 2: name: ");
}
@Test
public void testDuplicateFiles() {

	File file = new File("name");
	File file2 = new File ("file 2");
	File file3 = new File ("file 3");
	File file4 = new File ("file 2");
	file.open(file); 
	file.open(file2);
	file.open(file3);
	file.open(file4);
	assertEquals(file.getList(), "file 2: file 3: name: ");
}

@Test
public void testListSize() {

	File file = new File("file 1"); 
	File file2 = new File ("file 2");
	File file3 = new File ("file 3");
	File file4 = new File ("file 4");
	File file5 = new File("file 5");
	File file6 = new File ("file 6");
	File file7 = new File ("file 7");
	File file8 = new File ("file 8");
	File file9 = new File("file 9");
	File file10 = new File ("file 10");
	File file11 = new File ("file 11");
	File file12 = new File ("file 12");
	File file13 = new File("file 13");
	File file14 = new File ("file 14");
	File file15 = new File ("file 15");
	File file16 = new File ("file 16");
	file2.open(file); 
	file2.open(file2);
	file2.open(file3);
	file2.open(file4); 
	file2.open(file5);
	file2.open(file6);
	file2.open(file7); 
	file2.open(file8);
	file2.open(file9);
	file2.open(file10);
	file2.open(file11);
	file2.open(file12);
	file2.open(file13); 
	file2.open(file14);
	file2.open(file15);
	file2.open(file16);
	
	assertEquals(file2.getList(), "file 16: file 15: file 14: file 13: file 12: file 11: file 10: file 9: file 8: file 7: file 6: file 5: file 4: file 3: file 2: ");
}
}
