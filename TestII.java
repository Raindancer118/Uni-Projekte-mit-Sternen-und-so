
/**
 * Beschreiben Sie hier die Klasse TestII.
 * 
 * @author (Ihr Name) 
 * @version (eine Versionsnummer oder ein Datum)
 */
public class TestII
{
    // Instanzvariablen - ersetzen Sie das folgende Beispiel mit Ihren Variablen
    private int x;

    /**
     * Konstruktor für Objekte der Klasse TestII
     */
    public TestII()
    {
        // Instanzvariable initialisieren
        x = 0;
    }

    public void printTriangle(int number){
        int i = 1;
        while (i <= number){
            int i2 = i;
            while (i2 != 0){
                System.out.print("*");
                i2 = i2-1;
            }
            System.out.println();
            i++;
        }
    }
    
    public int[] fill(int N) {
        int[] result = new int[N - 1];
        for (int i = 0; i < N-1; i++) {
            result[i] = i*i;
        }
        return result;
    }
    
    public void printArrayElements(String[] array) {
        for (int i = 0; i < array.length; i++) {
            if (array[i] != null){
                System.out.println(array[i]);
            }
        }
    }
}
