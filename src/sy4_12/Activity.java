package sy4_12;

public class Activity {
    private ActivityStrategy strategy;
    private String name;
    private String information;

    public ActivityStrategy getStrategy() {
        return strategy;
    }

    public void setStrategy(ActivityStrategy strategy) {
        this.strategy = strategy;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getInformation() {
        return information;
    }

    public void setInformation(String information) {
        this.information = information;
    }
}
