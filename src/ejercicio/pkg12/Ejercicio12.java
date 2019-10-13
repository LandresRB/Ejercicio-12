
package ejercicio.pkg12;


public class Ejercicio12 {

    
    public static void main(String[] args) {
        
        System.out.println("Los numeros divisibles entre 2 son: ");
        for(int a=1;a<101;a++){
            if(a%2==0){
                System.out.println(a);
            }
        }
        System.out.println(" ");
        System.out.println("Los numeros divisibles entre 3 son: ");
        for(int b=1;b<101;b++){
            if(b%3==0){
                System.out.println(b);
            }
        }

    }
}
