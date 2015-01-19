
public class Word {

	private String word;
	public Word(String word) {
		this.word=word;// TODO Auto-generated constructor stub
	}
	public String getWord() {
		// TODO Auto-generated method stub
		return word;
	}
	public Object wrap(String word, int length) {
		String input = word;
		String res="";
		int start=0;
		
		while(input.length() !=0){
			if(input.length() > length){
		res += input.substring(start, length) + ", ";
		input=input.substring(length+start);
		 input=input.trim();
			}
			else 
			{
				res+=input.substring(start);
				break;
			
			}
	}
return res;
}
}