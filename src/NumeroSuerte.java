import java.util.Scanner;
public class NumeroSuerte {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        System.out.println("Este programa es para saber su numero de suertte con su fecha de cumpleaños");
        System.out.println("Ingrese el dia de su cumpleaños");
        Integer dia = sc.nextInt();
        System.out.println("Ingrese el mes de su cumpleaños");
        Integer mes = sc.nextInt();
        System.out.println("Ingrese el año de su cumpleaños");
        Integer year = sc.nextInt();

        Integer totalFecha = dia + mes + year;
        String totalFechaStr = totalFecha.toString();
        Integer numeroSuerte = 0;
        for(int i = 0; i < totalFechaStr.length();i++){

                numeroSuerte += Integer.parseInt(String.valueOf(totalFechaStr.charAt(i)));
        }

        System.out.println("tU NUMERO DE LA SUERTE ES: " + numeroSuerte);


    }

    
}
