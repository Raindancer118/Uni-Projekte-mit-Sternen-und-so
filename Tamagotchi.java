
/**
 * Beschreiben Sie hier die Klasse Tamagochi.
 * 
 * @author (Ihr Name) 
 * @version (eine Versionsnummer oder ein Datum)
 */
public class Tamagotchi{
    // Instanzvariablen - ersetzen Sie das folgende Beispiel mit Ihren Variablen
    private int hunger;
    private int mood;
    private int fatigue;

    private boolean slept;

    public String status;

    public int hungry_threshold;
    public int tired_threshold;
    public int happy_threshold;

    /**
     * Konstruktor für Objekte der Klasse Tamagochi
     */
    public Tamagotchi(int tired_threshold,int hungry_threshold,int happy_threshold)
    {
        hungry_threshold = hungry_threshold;
        tired_threshold = tired_threshold;
        happy_threshold = happy_threshold;
        slept = false;
        hunger = 0;
        mood = 0;
        fatigue = 0;
    }

    public void play(){
        if (hunger <= hungry_threshold){
            hunger = hunger + 2;
            mood = mood + 2;
            fatigue = fatigue + 3;
        }
        else{
        }
    }

    public void eat(){
        if (fatigue <= tired_threshold){
            hunger = hunger - 3;
            fatigue = fatigue + 2;
            System.out.println("You just sated the hunger of your Tamagotchi!");
        }
        else{
        }
    }

    public void sleep(){
        if (slept == false){
            if (hunger <= hungry_threshold){
                hunger = hunger + 1;
                mood = mood - 1;
                fatigue = 0;
                slept = true;
            }
            else{
                hunger = hunger + 1;
                mood = mood + 1;
                fatigue = 0;
                slept = true;
            }
        }
        else{
        }
    }

    public void pet(){
        hunger = hunger + 1;
        mood = mood + 2;
    }

    public String getGeneralCondition(){
        if (fatigue > tired_threshold){
            status = "tired";
            return status;
        }
        else{
            if (hunger > hungry_threshold){
                status = "hungry";
                return status;
            }
            else{
                if (mood > happy_threshold){
                    status = "happy";
                    return status;
                }
                else{
                    status = "indifferent";
                    return status;
                }
            }
        }
    }

    public void makeHappy(){
        pet();
        eat();
        sleep();
    }
}
