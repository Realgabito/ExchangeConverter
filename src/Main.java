import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner lectura = new Scanner(System.in);
        ConsultExchangeRate consult = new ConsultExchangeRate();
        ExchangeCoin exchange = new ExchangeCoin();

        int option = 0;
        while (option != 10) {
            System.out.println("""
                   *****************************************
                   Bienvenidos al conversor de monedas
                   Ingrese la conversion que deseas realizar:
                   1. Dollar a peso argentino
                   2. Peso argentino a dolar
                   3. Dolar a Real braseleño
                   4. Real brasileño a dolar
                   5. Dolar a peso colombiano
                   6. Peso colombiano a dolar
                   7. Dollar australiano a dolar
                   8. Dolar barbados a peso argenito
                   9. Chinese Renbinbi a peso chileno
                   10. Salir
                    """);
            option = lectura.nextInt();
        }
    }

}