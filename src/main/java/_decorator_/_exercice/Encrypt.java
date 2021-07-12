package _decorator_._exercice;

public class Encrypt extends FileDataSourceDecorator {
	private Encryptor encryptor = new Encryptor();

	Encrypt(FileDataSourceInterface source) {
		super(source);
	}

	@Override
	public void writeData(String data) {
		super.writeData(encryptor.encode(data));
	}

	@Override
	public String readData() {
		return encryptor.decode(super.readData());
	}
}
