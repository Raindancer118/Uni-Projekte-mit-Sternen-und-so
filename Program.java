
/**
 * Beschreiben Sie hier die Klasse Program.
 * 
 * @author (Ihr Name) 
 * @version (eine Versionsnummer oder ein Datum)
 */
public class Program
{
    // Instanzvariablen - ersetzen Sie das folgende Beispiel mit Ihren Variablen
    private int x;
    private boolean[] available = new boolean[] {true,false,false,true};

    /**
     * Konstruktor für Objekte der Klasse Program
     */
    public Program()
    {
        // Instanzvariable initialisieren
        x = 0;
    }

    /**
     * Ein Beispiel einer Methode - ersetzen Sie diesen Kommentar mit Ihrem eigenen
     * 
     * @param  y    ein Beispielparameter für eine Methode
     * @return        die Summe aus x und y
     */
    public void printStars(int number){
        for (int i=0; i< number; i++){
            System.out.print("*");
        }
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
    
    public void printDiamond(int number){
        for (int i = 0; i <= number;i++){
            for (int j = 0; j < number - i;j++){
                System.out.print(" ");
            }
            for (int j = 0; j < 2 * i + 1; j++){
                System.out.print("*");
            }
            System.out.println();
        }
        for (int i = number - 1; i >=0;i--){
            for (int j = 0; j < number - i;j++){
                System.out.print(" ");
            }
            for (int j = 0; j < 2 * i + 1; j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
    
    public void printArray(boolean[] inputArray){
        for(boolean b: available){
            System.out.println(b);
        }
    }
}
