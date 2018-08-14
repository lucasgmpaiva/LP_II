java.util.ArrayList;

public class Library{

	private ArrayList<String> songs;

	public ArrayList<String> getSongs(){
		return songs;
	}

	public void addFile(String file){
		songs.add(file);
	}

	public int getNumberOfFiles(){
		return songs.size();
	}

	public void listFiles(){
		int index = 0;
		for(String song : songs){
			System.out.println(index++ + ": " + song);
		}	
	}

	public void removeFile(int pos){
		if(pos < 0 || pos >= songs.size){
			System.out.println("Índice Inválido");
		} else{
			
		}
	}
}
