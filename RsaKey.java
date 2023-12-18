package cryptography;

public class RsaKey {
	

public static Key getPublicKey(int p,int q)
{
	int mod=p*q;
	
	int phi=(p-1)*(q-1);
	int pow=Primes.coprime(phi);
	
	return new Key(pow,mod);
}

public static Key getPrivateKey(int p,int q)
{
	int mod=p*q;
	
	int phi=(p-1)*(q-1);
	int d=Primes.coprime(phi);
	int e=1;
	while(true)
	{
		if((d*e)%phi==1)
			break;
		e++;
	}
	return new Key(e,mod);
	
	
}
public static void main(String  args[])
{
	Key pvt_key=getPrivateKey(37,43);
	Key public_key=getPublicKey(37,43);
}



}
