
/**
 * Beschreiben Sie hier die Klasse Array.
 * 
 * @author (Ihr Name) 
 * @version (eine Versionsnummer oder ein Datum)
 */
public class Array
{
    // Instanzvariablen - ersetzen Sie das folgende Beispiel mit Ihren Variablen
    private int x;

    /**
     * Konstruktor für Objekte der Klasse Array
     */
    public Array()
    {
        // Instanzvariable initialisieren
        x = 0;
    }
    
    public String[] Lust = new String[] {"ich","habe","keine","Lust"};
    public String[] Meow = new String[4];
    
    /**
     * Ein Beispiel einer Methode - ersetzen Sie diesen Kommentar mit Ihrem eigenen
     * 
     * @param  y    ein Beispielparameter für eine Methode
     * @return        die Summe aus x und y
     */
        public void Main(){
        Meow[0] = "Ich";
        Meow[1] = "habe";
        Meow[2] = "keine";
        Meow[3] = "Lust";
    }
    
        public void returnToSender(){
        for (int i = 0; i < Lust.length; i++){
            System.out.print(Lust[i]+" ");
        }
    }
    
    public void replace(){
        Lust[2]="null";        
    }
    
    public void giveWordLength(){
        for (int i = 0; i< Lust.length; i++){
            System.out.println("Länge des Wortes "+ Lust[i] + ": " + Lust[i].length());
        }
    }
    
    public void String(){
        String[] spruch;
        spruch = new String[]{"Ich","finde","Java","Spitze"};
        System.out.println(spruch[0]);
        System.out.println(spruch[1]);
        System.out.println(spruch[2]);
        System.out.println(spruch[3]);
    }
    
    public void printNumbers(int [] numbers){
        for (int i = 0; i <= numbers.length - 1;i++){
            System.out.println(numbers[i]);
        }
    }
    
    public int totalLength(String[] words){
        int totalLength = 0;
        for (int i = 0; i <= words.length - 1; i++){
            if (words[i] == null){
                i++;
            }
            totalLength = totalLength + words[i].length();
        }
        return totalLength;
    }
}
