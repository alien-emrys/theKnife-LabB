package theknife;

import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.HexFormat;

public class CifraPassword {
	
	private CifraPassword() {
    }

	/* SHA-256 è una funzione di hash: un algoritmo che prende un testo di qualsiasi 
	 * lunghezza e restituisce un codice di lunghezza fissa, chiamato hash (o impronta). 
	 * Il nome vuol dire Secure Hash Algorithm, e 256 è il numero di bit del risultato: 
	 * 256 bit = 32 byte = 64 caratteri scritti in esadecimale.
	 * 
	 * esempio:
	 * 
	 * password : ciao123
	 * SHA-256: cf8276ca60061baf2611917c50717a2b1bcbff0c0d25e00b95ef667ab8f158f0
	 * 
	 * Qualsiasi password in SHA-256 avrà Lunghezza fissa, il risultato è sempre di 64 caratteri.
	 * 
	 * Dal testo si calcola l'hash in un attimo, ma dall'hash non c'è modo di risalire al testo. 
	 * Non esiste un'operazione inversa.
	 * 
	 * Il limite: Due utenti con la stessa password hanno lo stesso hash.
	 * ma avento username diversi non crea problemi.*/

	public static String cifra(String password) {
			
		try {
			
			MessageDigest m; //è la classe java che calcola gli hash
			m = MessageDigest.getInstance("SHA-256"); 
			/*getInstance restituisce un oggetto capace di calcolare l'algoritmo tra virgolette (ne esistono altri come SHA-512)
			se il nome non corrisponde a nessun algoritmo lancia NoSuchAlgorithmException. */
			
			byte[] hash = m.digest(password.getBytes(StandardCharsets.UTF_8));
			
			/* password.getBytes(StandardCharsets.UTF_8) trasforma il testo in un array di byte,
			perché MessageDigest lavora sui byte e non sui caratteri*/
			
			// StandardCharsets.UTF_8 dice quale codifica usare per la trasformazione, cioè quali byte corrispondono a ogni carattere.
			/*Va indicata perché senza Java usa quella del sistema: con Java 17 su Windows non è UTF-8. Una password con una lettera 
			 * accentata darebbe hash diversi su computer diversi, e il login non funzionerebbe più se si cambia PC al server.*/
			
			//m.digest(byte[]) Calcola l'hash dei byte ricevuti e lo restituisce come array di 32 byte.
		
			return HexFormat.of().formatHex(hash);
			//HexFormat.of() Restituisce un oggetto che converte byte in testo esadecimale, con le impostazioni normali: lettere minuscole e nessun separatore.
			//.formatHex(byte[]) Trasforma ogni byte in 2 caratteri esadecimali (cifre da 0 a 9 e lettere da a a f), quindi da 32 byte si ottengono 64 caratteri. 
			//Serve perché i byte dell'hash non sono testo leggibile: molti non corrispondono a nessun carattere stampabile e non si potrebbero salvare in una colonna VARCHAR.
			
		} catch (NoSuchAlgorithmException e) {
			
			throw new RuntimeException(e);
			/*throw new RuntimeException(e)
			Java obbliga a gestire NoSuchAlgorithmException, anche se con SHA-256 non può mai capitare. 
			Trasformarla in RuntimeException evita di dover scrivere throws in tutti i metodi che usano cifra.*/
		}
		
	}
}
