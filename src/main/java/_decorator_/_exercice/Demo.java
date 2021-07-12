package _decorator_._exercice;

public class Demo {
	public static void main(String[] args) {
		// exemple de données à sauvegarder encrypter et compresser
		String data = "Name,Salary\nJohn Smith,100000\nSteven Jobs,912000";

		FileDataSource fileDataSource = new FileDataSource("OutputDemo.txt");

		Encryptor encryptor = new Encryptor();
		Compressor compressor = new Compressor();
		String encrypted = encryptor.encode(data);
		String encryptedAndCompressed = compressor.compress(encrypted);
		fileDataSource.writeData(encryptedAndCompressed);

		// TODO refactoriser en utilisant le pattern decorator

		String readData = fileDataSource.readData();

		System.out.println("- Input ----------------");
		System.out.println(data);
		System.out.println("- Encoded --------------");
		System.out.println(readData);
		System.out.println("- Decoded --------------");
		System.out.println(encryptor.decode(compressor.decompress(readData)));

		// With decorator
		System.out.println("- With Decorator ----------------");

		FileDataSourceInterface fileDataSource2 = new Encrypt(new Compress(new FileDataSource("OutputDemo2.txt")));

		String readData2 = fileDataSource2.readData();

		System.out.println("- Input ----------------");
		System.out.println(data);
		System.out.println("- decoded --------------");
		System.out.println(readData2);
		// Encrypting data and writing it
		fileDataSource2.writeData(data);
	}
}