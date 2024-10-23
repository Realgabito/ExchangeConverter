import java.util.Map;

public record Coin(String base_code,
                   Map<String, Double> conversion_rates) {

}
