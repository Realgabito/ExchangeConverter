import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner lectura = new Scanner(System.in);
        ConsultExchangeRate consult = new ConsultExchangeRate();
        ExchangeCoin exchange = new ExchangeCoin();

        int option = 0;
        while (option != 10) {
            System.out.println("""
                   ***************************************** \n
                   Bienvenidos al conversor de monedas
                   Ingrese la conversion que deseas realizar:
                   1. Dollar a peso argentino
                   2. Peso argentino a dolar
                   3. Dolar a Real braseleño
                   4. Real brasileño a dolar
                   5. Dolar a peso colombiano
                   6. Peso colombiano a dolar
                   7. Dollar australiano a dolar
                   8. Dolar barbados a peso argentino
                   9. Chinese Renbinbi a peso chileno
                   10. Salir \n
                   ***************************************** 
                    """);
            option = lectura.nextInt();

            if (option >= 1 && option <= 9) {
                System.out.println("Ingrese la cantidad que desea convertir");
                double qty = lectura.nextDouble();

                String monedaInicial = "", monedaCambio = "";
                switch (option) {
                    case 1:
                        monedaInicial = "USD";
                        monedaCambio = "ARS";
                        break;

                    case 2:
                        monedaInicial = "ARS";
                        monedaCambio = "USD";
                        break;

                    case 3:
                        monedaInicial = "USD";
                        monedaCambio = "BRL";
                        break;

                    case 4:
                        monedaInicial = "BRL";
                        monedaCambio = "USD";
                        break;

                    case 5:
                        monedaInicial = "USD";
                        monedaCambio = "COP";
                        break;

                    case 6:
                        monedaInicial = "COP";
                        monedaCambio = "USD";
                        break;

                    case 7:
                        monedaInicial = "AUD";
                        monedaCambio = "USD";
                        break;

                    case 8:
                        monedaInicial = "BBD";
                        monedaCambio = "ARS";
                        break;

                    case 9:
                        monedaInicial = "CNY";
                        monedaCambio = "CLP";
                        break;
                }

                try {
                    Coin coin = consult.lookRate(monedaInicial);
                    double exchangeRate = coin.conversion_rates().get(monedaCambio);
                    double conversion = exchange.exchange(qty, exchangeRate);
                    System.out.println(qty + " " + monedaInicial + " equivalen a: " + conversion +" "+ monedaCambio);
                } catch (Exception e) {
                    System.out.println("Error al realizar la conversion: " + e.getMessage());
                }
            }
        }
        System.out.println("Gracias por usar mi conversor!");
    }
}