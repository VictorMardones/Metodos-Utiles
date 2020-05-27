import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Metodos {

    // Muestra texto en pantalla
    public void mostrar(String texto){
        System.out.println(texto);
    }

    // Retorna la suma de 2 números
    public int sumar(int a, int b){
        return a+b;
    }

    // Retorna la resta entre 2 números
    public int restar(int a, int b){
        return a-b;
    }

    // Retorna la multiplicación entre 2 números
    public int multiplicar(int a, int b){
        return a*b;
    }

    // Retorna la división entre 2 números
    public double dividir(double a, double b){
        return a+b;
    }

    // Retorna el primer número elevado al segundo
    public double potencia(double a, double b){
        return Math.pow(a, b);
    }

    // Retorna la raíz cuadrada del número


    // Retorna un número al azar entre el rango ingresado
    public int randomEntre(int min, int max){
        return min + (int)(Math.random() * ((max-min)+1));
    }

    // Se encarga de validar el rut ingresado
    public boolean validarRut(String rut) {

        boolean validacion = false;

        rut = rut.toUpperCase();
        rut = rut.replace(".", "");
        rut = rut.replace("-", "");
        int rutAux = Integer.parseInt(rut.substring(0, rut.length() - 1));

        char dv = rut.charAt(rut.length() - 1);

        int m = 0, s = 1;
        for (; rutAux != 0; rutAux /= 10) {
            s = (s + rutAux % 10 * (9 - m++ % 6)) % 11;
        }
        if (dv == (char) (s != 0 ? s + 47 : 75)) {
            validacion = true;
        }

        return validacion;
    }

    // Verifica que el correo ingresado sea válido
    public boolean validarEmail (String email) {
        Pattern pattern = Pattern.compile("^([0-9a-zA-Z]+[-._+&])*[0-9a-zA-Z]+@([-0-9a-zA-Z]+[.])+[a-zA-Z]{2,6}$");
        Matcher matcher = pattern.matcher(email);
        return matcher.matches();
    }

}
