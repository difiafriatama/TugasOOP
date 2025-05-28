import java.util.List;

public class Main {
    public static void main(String[] args) {
        String filePath = "C:\\Users\\LENOVO\\IdeaProjects\\tugasOOPdifi\\src\\avocado_ripeness_dataset.csv";


        AvocadoProcessor processor = new AvocadoProcessor();
        List<AvocadoData> dataList = processor.readData(filePath);

        // Tampilkan 1 data pertama sebagai contoh output
        if (!dataList.isEmpty()) {
            System.out.println("Menampilkan semua data:");
            for (AvocadoData data : dataList) {
                System.out.println(data);
            }
        } else {
            System.out.println("Dataset kosong atau gagal dibaca.");
        }

    }
}
