
package monoalphabeticcipher;

import java.io.IOException;


public class Main 
{ 

	public static void main(String[] args) throws IOException 
	{ 
		
            EncoderChipper ec=new EncoderChipper();
            FileOperations fr=new FileOperations();
          
		String key; 
		key = "Computer"; 
		System.out.println("Keyword : " + key); 

		
		String encoded = ec.encoder(key.toCharArray()); 
            System.out.println("Dosyadan Okunan İfade = "+fr.dosyaOku());
		String x=fr.dosyaOku();
		String message = x; 
		System.out.println("Message before Ciphering : " + message); 

	
		System.out.println("Ciphered Text : " + ec.cipheredIt(message, 
				encoded)); 
                fr.dosyayaYaz(ec.cipheredIt(message, 
				encoded));
	} 
} 

