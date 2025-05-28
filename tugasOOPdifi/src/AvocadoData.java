public class AvocadoData {
    private String skinColor;
    private String firmness;
    private String size;
    private double weight;
    private String ripenessLevel;

    // Constructor
    public AvocadoData(String skinColor, String firmness, String size, double weight, String ripenessLevel) {
        this.skinColor = skinColor;
        this.firmness = firmness;
        this.size = size;
        this.weight = weight;
        this.ripenessLevel = ripenessLevel;
    }

    // Getter and Setter
    public String getSkinColor() {
        return skinColor;
    }

    public void setSkinColor(String skinColor) {
        this.skinColor = skinColor;
    }

    public String getFirmness() {
        return firmness;
    }

    public void setFirmness(String firmness) {
        this.firmness = firmness;
    }

    public String getSize() {
        return size;
    }

    public void setSize(String size) {
        this.size = size;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public String getRipenessLevel() {
        return ripenessLevel;
    }

    public void setRipenessLevel(String ripenessLevel) {
        this.ripenessLevel = ripenessLevel;
    }

    @Override
    public String toString() {
        return "AvocadoData{" +
                "skinColor='" + skinColor + '\'' +
                ", firmness='" + firmness + '\'' +
                ", size='" + size + '\'' +
                ", weight=" + weight +
                ", ripenessLevel='" + ripenessLevel + '\'' +
                '}';
    }
}
