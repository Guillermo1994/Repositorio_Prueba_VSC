import java.util.Scanner;

//import jdk.javadoc.internal.doclets.formats.html.resources.standard;
public class App {
    public static void main(String[] args) throws Exception {
        /* var nombre = "Guillermo";
        var resultado = saludar(nombre);
        System.out.println(resultado); */
        // Scanner sc = new Scanner(System.in);
        // System.out.println("Este programa sirve para contar el numero de cifras");
        // System.out.println("Ingrese u numero");
        // Integer numero = sc.nextInt();
        // sc.close();
        // String strNumero = numero.toString();
        // Integer cifrasNumero = strNumero.length();
        // System.out.println("El numero tiene " + cifrasNumero.toString() + " Cifras");
        Integer leerNumero = LeerNumero();
        EsParOimpar(leerNumero);
        float f = conversionFareheint(leerNumero);
        System.out.println("La temperatura en grados F es" + f);
    }

    public static String saludar(String nombre){
       return "Hola "+ nombre + "!";
    }

    public static float conversionFareheint(float tCelcius){
        float fareheint = 32 + (9 * tCelcius/5);
        return fareheint;
    }

    public static void EsParOimpar(int numero){
        if(numero%2 == 0){
            System.out.println("El numero es par");
        }else{
            System.out.println("El numero es impar");
        }
    }

    public static Integer LeerNumero(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese un Numero");
        Integer numero = sc.nextInt();
        sc.close();
        return numero;
    }
}
