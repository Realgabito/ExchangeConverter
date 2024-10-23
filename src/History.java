import com.google.gson.FieldNamingPolicy;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;

public class History {

        private final List<String> history = new ArrayList<>();


        public void addHistory(String monedaInicial, String monedaCambio, double qty, double conversion) {
            history.add("Convertido: " + qty + " " + monedaInicial + " a " + conversion + " "+ monedaCambio);

        }

        public void showHistory() {
            if (history.isEmpty()){
                System.out.println("No hay conversiones para mostrar");
            } else {
                System.out.println("Historial de conversiones: ");
                for (String conversion : history) {
                    System.out.println(conversion);
                }
            }
        }


}
