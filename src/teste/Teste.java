
package teste;

/**
 *
 * @author aluno
 */


public class Teste {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        short variavelShort = 10;
        int variavelDoTipoInt = 10;
        long variavelLong = 1000;

        float variavelDoTipoFloat = 1231223.1232321f;
        double variavelDoTipoDouble = 211212121.1212121d;
        byte variavelDoTipoByte = 10;

        boolean variavaelDoTipoLogica = true;

        char variavalDoTipoCaracter = 'a';

        String palavra = "Sou uma String";
        if (variavelShort == 10) {
            System.out.println("Olá Mundo !!!");
            System.out.println("short" + variavelShort);
            System.out.println("in" + variavelDoTipoInt);
            System.out.println("long" + variavelLong);
            System.out.println("boolean" + variavaelDoTipoLogica);
            System.out.println("char" + variavalDoTipoCaracter);
            System.out.println("double" + variavelDoTipoDouble);
            System.out.println("float" + variavelDoTipoFloat);
            System.out.println("byte" + variavelDoTipoByte);
        }
    }
}
