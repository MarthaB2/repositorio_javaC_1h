import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Main {
    public Main() {
    }

    public static void main(String[] args) {

        //hola mundo
        System.out.println("Hola, java!");

        //string
        String myString = "Esto es una cadena de texto";
        myString = "Aqui cambio el valor de la cadena de texto";
        System.out.println(myString);

        //enteros
        Integer myInt = 7;
        myInt = myInt + 4;
        System.out.println(myInt);
        System.out.println(myInt - 1);

        //double
        Double myDouble = 6.5;
        System.out.println(myDouble);

        //float
        Float myFloat = 6.5F;
        System.out.println(myFloat);
        //System.out.println("" + myDouble + "  " + myString + " " + myFloat + " " + myInt);

        //boleanos
        /*
        Boolean myBoolean = true;
        myBoolean = false;
        System.out.println(myBoolean);
        myBoolean = null;
        System.out.println(myBoolean);
        */

        //NULL y condicionales
        myFloat = null;
        if (myFloat != null) {
            System.out.println(myFloat + 10.0F);
            System.out.println("My Float es distinto de nulo");
        } else {
            System.out.println("My Float es nulo");
        }

        if (myInt == 11) {
            System.out.println("myInt ==  11");
        } else if (myInt == 12) {
            System.out.println("myInt ==  12");
        } else {
            System.out.println("El valor no es ni 11 ni 12");
        }

        //arrays y lista
        List<String> myList = new ArrayList();
        myList.add(myString);
        myList.add(myInt.toString());
        System.out.println(myList);
        System.out.println("Tipeado");

        //map
        Map<String, String> myMap = new HashMap();
        myMap.put("string", myString);
        myMap.put("int", myInt.toString());
        System.out.println(myMap);
        System.out.println((String)myMap.get("int"));

        //ciclos
        for(int index = 0; index < myList.size(); ++index) {
            System.out.println((String)myList.get(index));
        }
        //funciones
        System.out.println("funciones:");
        Main myMain = new Main();
        System.out.println(myMain.myFunction(5, 2));
        System.out.println(myMain.myFunction(3, 126389));
    }

    public int myFunction(int myFirstNumber, int mySecondNumber) {
        return myFirstNumber + mySecondNumber;
    }
}
