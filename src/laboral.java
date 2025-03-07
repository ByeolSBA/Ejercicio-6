import java.util.Scanner;
public class laboral {
    public static void main (String [] args){
        Scanner scanner = new Scanner (System.in);
        System.out.println("Elija el numero del dia de la semana: \n1.Lunes\n2.Martes\n3.Miercoles\n4.Jueves\n5.Viernes\n6.Sabado\n7.Domingo");
        int dia = scanner.nextInt();
        while (dia >=8){
            System.out.println("Digite un dia Valido");
            System.out.println("Elija el numero del dia de la semana: \n1.Lunes\n2.Martes\n3.Miercoles\n4.Jueves\n5.Viernes\n6.Sabado\n7.Domingo");
            dia = scanner.nextInt();
        }
        String laboral = "Es un dia Laboral";
        String NoLaboral = "No es un dia laboral";
        switch (dia){
            case 1 :
                System.out.println(laboral);
                break;
            case 2:
                System.out.println(laboral);
                break;
            case 3:
                System.out.println(laboral);
                break;
            case 4:
                System.out.println(laboral);
                break;
            case 5:
                System.out.println(laboral);
                break;
            case 6:
                System.out.println(NoLaboral);
                break;
            case 7:
                System.out.println(NoLaboral);
                break;
        }

    }
}
