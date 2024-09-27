public class EquilateralTriangle { //Klassendefinition
    //Deklaration der Variablen für die einzelnen Seiten des Dreiecks.
    private int side1;
    private int side2;
    private int side3;
    
    //Konstruktor für Objekte der Klasse:
    public EquilateralTriangle(int sideLength) { 
        //Setzen der Seitenlängen auf die mitgebene Seitenlänge,
        //da es sich um ein gleichschenkliges Dreieck ist.
        side1 = sideLength;
    	side2 = sideLength;
    	side3 = sideLength;
    }
}
