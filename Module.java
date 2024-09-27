
/**
 * Beschreiben Sie hier die Klasse Module.
 * 
 * @author (Ihr Name) 
 * @version (eine Versionsnummer oder ein Datum)
 */

public class Module {
    private String code;
    private String name;
    private int contactHours;
    public Module(String _code, String _name){
        code=_code;
        name=_name;
    }
    public void setName(String _name){
        name=_name;
    }
    public String getName(){
        return name;
    }
    public String getCode(){
        return code;
    }
    public void setContactHours(int _contacthours){
        contactHours=_contacthours;
    }
    public int getContactHours(){
            return contactHours;
    }
}
