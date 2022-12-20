package workingWithFiles;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		getFileInfo();
		readFile();
		writeFile();
		System.out.println("*********************");
		readFile();
	}
	
	public static void createFile() {
		File file = new File(
				"C:\\eclipse-workspace\\files\\student.txt");
		try {
			if (file.createNewFile()) {
				//uzantıda student dosyasını olşuturur.
				//Aynı zamanda true false döner.
				System.out.println("Dosya oluşturuldu.");
			}else {
				System.out.println("Dosya zaten mevcut");
			}
		} catch (IOException e) { //oluşturur.
			e.printStackTrace();
		}
	}
	public static void getFileInfo() {
		File file = new File(
				"C:\\eclipse-workspace\\files\\student.txt");
		if(file.exists()){ //dosya eğer var ise !
			System.out.println("Dosya adı : "+ file.getName());
			System.out.println("Dosya yolu : "+ file.getAbsolutePath());
			System.out.println("Dosya okunabilir mi ? : "+ file.canRead());
			System.out.println("Dosya yazılabilir mi ? : "+ file.canWrite());
			System.out.println("Dosya boyutu nedir ? : "+ file.length());	
		}
	}
	public static void readFile() {
		File file = new File(
				"C:\\eclipse-workspace\\files\\student.txt");
		//scannerla konsoldan bilgi almıştık.
		//
		try {
			Scanner reader = new Scanner(file);
			while (reader.hasNextLine()) { // okunacak satır varsa döngü devam eder.
				String line = reader.nextLine();
				System.out.println(line);
			}
			reader.close();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
	}
	public static void writeFile() {
		try {
// FileWriter file = new FileWriter("C:\\eclipse-workspace
//			\\files\\student.txt");
			BufferedWriter writer = new BufferedWriter(new FileWriter(
					"C:\\eclipse-workspace\\files\\student.txt",true));
			// sonuna true yazmazsak dosyayı baştan yazar. yani üzerine yazar.
			// true yazınca dosyayı ekleme formatında aç demektir. 
			writer.newLine(); // yeni satır oluşturur.
			writer.write("Ahmet");
			System.out.println("Dosyaya yazıldı.");
			writer.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
