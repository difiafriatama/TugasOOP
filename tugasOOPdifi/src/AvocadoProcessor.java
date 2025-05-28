import java.io.BufferedReader;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.List;

public class AvocadoProcessor {

    public List<AvocadoData> readData(String filePath) {
        List<AvocadoData> avocadoList = new ArrayList<>();

        try (BufferedReader br = new BufferedReader(new FileReader(filePath))) {
            String line;
            br.readLine(); // skip header
            while ((line = br.readLine()) != null) {
                String[] values = line.split(",");

                String skinColor = values[0].trim();
                String firmness = values[1].trim();
                String size = values[2].trim();
                double weight = Double.parseDouble(values[3].trim());
                String ripenessLevel = values[4].trim();

                AvocadoData data = new AvocadoData(skinColor, firmness, size, weight, ripenessLevel);
                avocadoList.add(data);
            }
        } catch (Exception e) {
            System.out.println("Error reading file: " + e.getMessage());
        }

        return avocadoList;
    }
}
