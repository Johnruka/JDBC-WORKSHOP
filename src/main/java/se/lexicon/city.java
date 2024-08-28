package se.lexicon;

public class city {

    private int ID;
    private String name;
    private String countryCode;
    private String District;
    private int population;

    public city(String name, String countryCode, String district, int population) {
        this.name = name;
        this.countryCode = countryCode;
        District = district;
        this.population = population;
    }

    public city(int ID, String name, String countryCode, String district, int population) {
        this.ID = ID;
        this.name = name;
        this.countryCode = countryCode;
        District = district;
        this.population = population;
    }

    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCountryCode() {
        return countryCode;
    }

    public void setCountryCode(String countryCode) {
        this.countryCode = countryCode;
    }

    public String getDistrict() {
        return District;
    }

    public void setDistrict(String district) {
        District = district;
    }

    public int getPopulation() {
        return population;
    }

    public void setPopulation(int population) {
        this.population = population;
    }

    @Override
    public String toString() {
        return "City{" +
                "ID=" + ID +
                ", name='" + name + '\'' +
                ", countryCode='" + countryCode + '\'' +
                ", District='" + District + '\'' +
                ", population=" + population +
                '}';
    }
}
