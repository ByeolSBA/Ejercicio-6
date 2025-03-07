public class cincuenta {
    public static void main (String [] args){
        int Matriz [] = new int [50];
        int suma = 0 ;
        int j = 1;
        for (int i = 0; i < Matriz.length; i++) {
            Matriz [i] = j;
            suma += Matriz[i];
            j++;

        }
        System.out.println(suma);

    }
}
