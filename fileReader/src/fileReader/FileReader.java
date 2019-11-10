package fileReader;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class FileReader extends FileReaderAbstract {
	
	File file;
	ArrayList<String> contentFile;
	ArrayList<String> contentFilePal;
	
	public FileReader (String nameFile) {
	
		this.file = new File(nameFile);
		this.contentFile = new ArrayList<String>();
		this.contentFilePal = new ArrayList<String>();
	}
	
	public void readFile() {
	
	try{
		InputStream flux=new FileInputStream(this.file); 
		InputStreamReader lecture=new InputStreamReader(flux);
		BufferedReader buff=new BufferedReader(lecture);
		String ligne;
		while ((ligne=buff.readLine())!=null){
			this.contentFile.add(ligne);
		}
		buff.close(); 
		}		
		catch (Exception e){
		System.out.println(e.toString());
		}
	}
	
	public void displayFile() {
		for(int i = 0; i < this.contentFile.size(); i++) {
			System.out.println(this.contentFile.get(i));
		}
	}
	
	public void displayFileUpDown() {
		for(int i = this.contentFile.size()-1; i >= 0; i--) {
			System.out.println(this.contentFile.get(i));
		}
	}
	
	public void readFilePal() {
		for(int i = this.contentFile.size() - 1; i >= 0; i--) {
			for(int j = this.contentFile.get(i).length() - 1; j >= 0 ;j--) {
				this.contentFilePal.add(Character.toString(this.contentFile.get(i).charAt(j)));
			}
		}
		for(int i = 0; i < this.contentFilePal.size(); i++) {
			System.out.print(this.contentFilePal.get(i));
		}
		
		// TODO: if the result is the same word as the start then it's a palindrome
	}
	
	public ArrayList<String> readFileByCara() {
		for(int i = 0; i < this.contentFile.size(); i++) {
			for(int j = 0; j < this.contentFile.get(i).length() ;j++) {
				this.contentFilePal.add(Character.toString(this.contentFile.get(i).charAt(j)));
			}
		}
		return contentFilePal;
	}
	
}
