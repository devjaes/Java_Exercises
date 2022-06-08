import java.util.Scanner;
public class edades_estaturas {
    public static void main(String[] args) {
        int edad = 0;
        float estatura = 0;
        int contador18 = 0;
        float medad = 0;
        float mestatura = 0;
        int contador_altura = 0;
        int s_edad = 0;
        float s_estatura = 0;
        Scanner scan = new Scanner(System.in);


            for(int i = 0;i  < 5; i ++){
                System.out.println("Ingresa la edad(solo números, Ejm: 18): ");
                edad = scan.nextInt();
                System.out.println("Ingresa la estatura, (solo números, Ejm: 1,60): ");
                estatura = scan.nextFloat();
                s_edad += edad;
                s_estatura += estatura;
                if(edad >= 18){
                    contador18 ++;
                }
                if(estatura >= 1.75){
                    contador_altura ++;
                } 
            }
        medad = s_edad / 5;
        mestatura = s_estatura / 5;
        System.out.println("La media de las edades es :" + medad + ", Existen " + contador18 + " personas mayores de edad.");
        System.out.println("La media de las estaturas es :" + mestatura + ", Existe " + contador_altura + " personas con una estatura mayor a 1.75cm.");    
            
        
    }
    
}
