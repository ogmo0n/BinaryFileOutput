import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class BinaryFileOutput {

	public static void main(String[] args) throws IOException {

		writeToFile();
		readFromFile();
	}
	
	public static void writeToFile() throws IOException {
		
		FileOutputStream outStream = new FileOutputStream("cOdden.dat");
		DataOutputStream outputFile = new DataOutputStream(outStream);
		System.out.println("Starting to write to file");
		outputFile.writeInt(5);
		outputFile.writeDouble(9.95);
		System.out.println("Finished writing to file\n");
		outputFile.close();
	} // end method writeToFile
	
	public static void readFromFile() throws IOException {
		
		FileInputStream inStream = new FileInputStream("cOdden.dat");
		DataInputStream inputFile = new DataInputStream(inStream);
		int fileInt = 0;
		double fileDbl = 0.0;
		System.out.println("Starting to read file");
		fileInt = inputFile.readInt();
		System.out.print("Int: " + fileInt + "\n");
		fileDbl = inputFile.readDouble();
		System.out.println("Double: " + fileDbl);
		inputFile.close();
		System.out.println("Finished reading from file");
	} // end method readFromFile
}