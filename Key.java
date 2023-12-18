package cryptography;

public class Key {
	int power;
	int mod;
	public Key(int power, int mod)
	{
		this.power=power;
		this.mod=mod;
	}
	public Key() {
		
	}
	public String toString()
	{
		return "("+power+","+mod+")";
	}

}
