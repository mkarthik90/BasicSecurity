
public class PKCS7 {

	public String getString(String data) {
		final int SIXTEEN = 16;
		int availableBytes = data.length() % 16;
		if (availableBytes == 0) {
			return data;
		}

		int bytesToBeAdded = SIXTEEN - availableBytes;
		StringBuilder finalData = new StringBuilder(data);
		for (int i = 0; i < bytesToBeAdded; i++) {
			char c = Character.forDigit(bytesToBeAdded, 16);
			finalData.append(c);
		}
		return finalData.toString();
	}

	public static void main(String[] args) {

		PKCS7 obj = new PKCS7();
		System.out.println(obj.getString(""));

	}

}
