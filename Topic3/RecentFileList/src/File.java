
import java.util.ArrayList;
public class File {
	
private String name;
private ArrayList<String> fileList = new ArrayList<String>();

public File(String name){
	this.name=name;
	
}

public void open(File file) {
	
	if (fileList != null){
		
	fileList.add(0, file.getName());
	this.removeDuplicates();
	this.checkSize();
}
}

public void removeDuplicates(){
	

	for (int i=1; i<fileList.size(); i++){
		if(fileList.get(0).equals(fileList.get(i)))
		{
			fileList.remove(i);
			break;
		}
}
}
public void checkSize(){
	if(fileList.size()>15){
		fileList.remove(15);
	}
}
public String getName() {
	return name;
}
public String getList(){
	String list="";
	if(fileList != null){
	for (int i=0; i< fileList.size(); i++){
		list += fileList.get(i) + ": ";
		}
	
	}
	else{
		return "";
	}
	return list;
}

}
