import java.security.SecureRandom;

class Generar_Claves {
    public static void main(String[] args) {
        System.out.print(getClave());
    }

    public static String getClave() {
        SecureRandom numAl = new SecureRandom();

        // String claveGral = "C-";
        // PARA AGREGARLE AL PRINCIPIO, PERO EN ESTE
        // CASO NO LO UTILIZAREMOS POR EL MOMENTO
        String claveGral = "";
        String claveU = "";
        String claveD = "";
        int clave2 = 0;
        for (int cuenta = 1; cuenta <= 10; cuenta++) {
            claveU = "" + numAl.nextInt(9);

            clave2 = numAl.nextInt(25) + 65;

            claveD = "" + (char) clave2;
            // System.out.printf("%s%d", (char) valorLetra, numeros);
            claveGral += claveU + claveD;
        }
        return claveGral;
    }
}