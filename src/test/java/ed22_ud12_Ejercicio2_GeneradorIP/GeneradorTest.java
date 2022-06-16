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
     * Comprobación número entre 0 y 254
     */
    @RepeatedTest(1000)
    @DisplayName("Genera un número entre 0 y 254.")
    void generarNumero() {
        int numRandom=g1.generarNumero(0,254);
        assertTrue(numRandom>=0&&numRandom<=254);
    }
    
    
    /**
     * Comprobación la ip(no 0 en el último y primer número)
     */
    @RepeatedTest(1000)
    @DisplayName("Genera una dirección Ip con los 4 números que genera el método generarNumero()")
    void generarIp() {
        String ip=g1.generarIp();
        assertTrue(ip.charAt(0)!=0||ip.charAt(ip.length()-1)!=0);
    }
}