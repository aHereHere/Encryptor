package cryptography;
import java.io.*;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
public class FileEncryptor {
	static String getString(String fileName) throws IOException
	{
		
		BufferedReader reader = new BufferedReader(new FileReader(fileName));
		StringBuilder stringBuilder = new StringBuilder();
		String line = null;
		String ls = System.getProperty("line.separator");
		while ((line = reader.readLine()) != null) {
			stringBuilder.append(line);
			stringBuilder.append(ls);
		}
		
		stringBuilder.deleteCharAt(stringBuilder.length() - 1);
		reader.close();

		String content = stringBuilder.toString();
		return content;
	}
static	public void save(String s)
	{
		Path path
        = Paths.get("D:\\enc.txt");

    
    String str
        = s;

    
    try {
      
        Files.writeString(path, str,
                          StandardCharsets.UTF_8);
    }

   
    catch (IOException ex) {
        
        System.out.print("Invalid Path");
	}}
	public static void main(String[] args) throws IOException {
		String fileName="D:\\info.txt";
		String info=getString(fileName);
		int p=37;int q=43;
		Key publicKey=RsaKey.getPublicKey(p, q);
		Key privateKey=RsaKey.getPrivateKey(p, q);
		String enc=Encryptor.crypt(info, publicKey);
		save(enc);
		String dec=Encryptor.crypt(getString("D:\\enc.txt"), privateKey);
		System.out.println(dec);
		
	}

}
