package cryptography;
import java.math.BigInteger;

public class Encryptor {
	static int enc_dec(int n,Key key)
	{
		
		;
		
		return new BigInteger(n+"").pow(key.power).remainder(new BigInteger(key.mod+"")).intValue();
	}
	
	static String crypt(String s,Key k)
	{
		String str="";
		for(int i=0;i<s.length();i++)
		{
			int ch=s.charAt(i);
			str+=(char)(enc_dec(ch,k));
			
		}
		return str;
	}
	

		
	public static void main(String[] args) {
		int p=37;int q=43;
		Key publicKey=RsaKey.getPublicKey(p, q);
		Key privateKey=RsaKey.getPrivateKey(p, q);
		System.out.println(publicKey.toString()+"\n"+privateKey.toString());
		
		
		String str="BigInteger class is used for the mathematical operation which involves very big integer calculations that are outside the limit of all available primitive data types.\r\n"
				+ "\r\n"
				+ "In this way, BigInteger class is very handy to use because of its large method library and it is also used a lot in competitive programming. \r\n"
				+ "Now below is given a list of simple statements in primitive arithmetic and its analogous statement in terms of BigInteger objects.";
		String enc=crypt(str,publicKey);
		System.out.println(enc);
		String dec=crypt(enc,privateKey);
		System.out.println(dec);
		
		
		
		

	}

}
