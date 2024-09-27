
/**
 * Beschreiben Sie hier die Klasse Test.
 * 
 * @author (Ihr Name) 
 * @version (eine Versionsnummer oder ein Datum)
 */
public class Test
{
    // Instanzvariablen - ersetzen Sie das folgende Beispiel mit Ihren Variablen
    private int x;

    /**
     * Konstruktor für Objekte der Klasse Test
     */
    public Test()
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
    public void vielfacheVon3(){
        for (int i = 4;i*3 < 100; i++){
            System.out.println(i*3);
        }
    }

    public int crossTotal(int n){
        int crossTotal = 0;
        boolean done = false;
        while (done != true){
            int last = n % 10;
            for (int i = 50;i > 0;i--){
                last = n % 10;
                if (last != 0){
                    break;
                }
                else{
                    n = n / 10;
                }
                if (i == 1){
                    done = true;
                }
            }
            crossTotal = crossTotal + last;
            n = n / 10;
        }
        return crossTotal;
    }

    public int repeatedCrossTotal(int n){
        int crossTotal = 0;
        boolean done = false;
        while (done != true){
            int last = n % 10;
            for (int i = 50;i > 0;i--){
                last = n % 10;
                if (last != 0){
                    break;
                }
                else{
                    n = n / 10;
                }
                if (i == 49){
                    done = true;
                }
            }
            crossTotal = crossTotal + last;
            n = n / 10;
        }
        if (crossTotal > 9){
            repeatedCrossTotal(crossTotal);
        }
        else{
            return crossTotal;
        }
        return repeatedCrossTotal(crossTotal);
    }
    
    public int luhn(int[] digits) {
        int sum = 0;
    
        for (int i = digits.length ; i >= 0; i--) {
            int digit = digits[i] * (i % 2 == 0 ? 2 : 1);
            sum += digit > 9 ? digit - 9 : digit;
        }
    
        return (10 - sum % 10) % 10;
    }
}

