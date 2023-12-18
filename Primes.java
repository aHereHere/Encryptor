package cryptography;

public class Primes {
	public static boolean isPrime(int n)
	{
		if (n <= 1) 
            return false; 
  
       
        for (int i = 2; i <= Math.sqrt(n); i++) 
            if (n % i == 0) 
                return false; 
  
        return true; 
	}
	public static int coprime(int n)
	{
		for(int i=2;i<n;i++)
			if(areCoprime(n,i))return i;
		return -1;
	}
	public static boolean areCoprime(int a,int b)
	{
		
		for(int i=2;i<=Math.min(a, b);i++)
			if(a%i==0&&b%i==0)return false;
		return true;
	}
	}
