package ed22_ud12_Ejercicio2_GeneradorIP;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.RepeatedTest;
import org.junit.jupiter.api.Test;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.RepeatedTest;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class GeneradorIpTest {
    Generador g1 = new Generador();
    
    
    /**
     * Comprobaci�n n�mero entre 0 y 254
     */
    @RepeatedTest(1000)
    @DisplayName("Genera un n�mero entre 0 y 254.")
    void generarNumero() {
        int numRandom=g1.generarNumero(0,254);
        assertTrue(numRandom>=0&&numRandom<=254);
    }
    
    
    /**
     * Comprobaci�n la ip(no 0 en el �ltimo y primer n�mero)
     */
    @RepeatedTest(1000)
    @DisplayName("Genera una direcci�n Ip con los 4 n�meros que genera el m�todo generarNumero()")
    void generarIp() {
        String ip=g1.generarIp();
        assertTrue(ip.charAt(0)!=0||ip.charAt(ip.length()-1)!=0);
    }
}