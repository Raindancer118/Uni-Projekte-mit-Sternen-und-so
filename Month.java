
/**
 * Beschreiben Sie hier die Klasse Month.
 * 
 * @author (Ihr Name) 
 * @version (eine Versionsnummer oder ein Datum)
 */
public class Month {
    private final int month;
    public Month(int m){
        month = m;
    }
    public boolean isRMonth(){
        boolean isRMonth = false;
        int m = month;
        while (m <= 0){
            m = 12 + m;
        }
        while (m > 12){
            m = m - 12;
        }
        if (m >= 1){
            if (m < 5){
                isRMonth = true;
            }
            if (m >= 5){
                if (m >= 9){
                    isRMonth = true;
                }
                else{
                    isRMonth = false;
                }
            }
        }
        return isRMonth;
    }
}