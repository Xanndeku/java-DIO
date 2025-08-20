import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String ip = scanner.nextLine();
        if (validarIP(ip)) {
            System.out.println("ip valido");
        } else {
            System.out.println("ip invalido");
        }

    }

    public static boolean validarIP(String ip) {

        String[] partes = ip.split("\\.");
        if (partes.length != 4) {
            return false;
        }
        for (String Parte:partes){
;
            if (!validaNumero(Parte)){
                return false;
            }
        }
        return true;
    }
    public static boolean validaNumero(String Parte){
        try {
            int juj = Integer.parseInt(Parte);
            return juj >= 0 && juj <=255;
        } catch (NumberFormatException e) {
           return false;
        }
    }
}