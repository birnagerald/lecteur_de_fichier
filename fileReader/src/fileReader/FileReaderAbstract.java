package fileReader;

import java.util.ArrayList;

abstract class FileReaderAbstract  implements FileReaderInterface {
	
	public abstract void readFile();
	public abstract void displayFile();
	public abstract void displayFileUpDown();
	public abstract void readFilePal();
	public abstract ArrayList<String> readFileByCara();


}