package ed22_ud12_Ejercicio2_GeneradorIP;
import java.util.Random;

public class Generador {
	
    public int generarNumero(int min, int max){
        Random rnd = new Random();
        return min+rnd.nextInt(max);
    }
    
    
    public String generarIp(){
    	
        int n1=generarNumero(0,254);
        int n2 = generarNumero(0,254);
        int n3 = generarNumero(0,254);
        int n4=generarNumero(0,254);
        
        while (n1==0 || n4==0){
            n1=generarNumero(0,254);
            n4=generarNumero(0,254);
        }
        return n1+"."+n2+"."+n3+"."+n4;
    }

}