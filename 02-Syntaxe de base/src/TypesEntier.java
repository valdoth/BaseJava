
public class TypesEntier {
	
	public static void main(String[] args) {
		
		int counter = 10; 
		counter++;
		System.out.println(counter);
		counter--;
		System.out.println(counter);
		
		// Les 4 types entires: 
		// byte	: 1 octet  -128 à 127
		byte monOctet = 100;
		System.out.println(monOctet);
		// short : 2 octet  -32768 à 32767
		short monShort = 30000;
		System.out.println(monShort);
		// int : 4 octet	-2**32 a (2**32)-1
		int monInt = 2_000_000_000;
		System.out.println(monInt);
		// long: 8 octect	-2**64 à (2**64)-1
		long monLong = 10_000_000_000L;
		System.out.println(monLong);
		
		// Les 4 bases de numérique
		int decimalValue = 10;			// 10 digits de 0 à 9
		System.out.println(decimalValue);
		int binaryValue = 0b1001;		// 2 digits 0 et 1
		System.out.println(binaryValue);
		int octalValue = 010;			// 8 digits de 0 à 7
		System.out.println(octalValue);
		int hexadecimalValue = 0xff;	// 16 digits de 0...9A...F
		System.out.println(hexadecimalValue);
		
		// Les operateurs sur valeurs entieres: ++ --, + - * / %, += -= *= /= %=
		int a = 33;
		int b = 44;
		int result = a + b;
		System.out.println(result);
		
		byte b1 = 100;
		byte b2 = 100;
		int sum = b1 + b2;
		System.out.println(sum);
		
	}

}
//<>