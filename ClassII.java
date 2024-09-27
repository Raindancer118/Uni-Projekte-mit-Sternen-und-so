
/**
 * Beschreiben Sie hier die Klasse ClassII.
 * 
 * @author (Ihr Name) 
 * @version (eine Versionsnummer oder ein Datum)
 */
public class ClassII
{
    // Instanzvariablen - ersetzen Sie das folgende Beispiel mit Ihren Variablen
    private int x;

        public ClassII()
        {
            
        }
        public static boolean[] sieve(int n) {
        // Initialisierung des Arrays, das den Markierungsstatus der Zahlen von 2 bis n darstellt
        boolean[] isComposite = new boolean[n - 1];

        // Hauptlogik des Sieb des Eratosthenes
        for (int i = 2; i * i <= n; i++) {
            if (!isComposite[i - 2]) { // Wenn i eine Primzahl ist
                for (int j = i * i; j <= n; j += i) {
                    isComposite[j - 2] = true; // Markiere Vielfache von i als zusammengesetzt
                }
            }
        }

        return isComposite;
     }
       
}
