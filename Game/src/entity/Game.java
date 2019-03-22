package entity;

public class Game {
    private String name;
    private String description;
    private String price;
    private String realeaseDate;
    private String homepage;

    public Game(String name, String description, String price, String realeaseDate, String homepage) {
        this.name = name;
        this.description = description;
        this.price = price;
        this.realeaseDate = realeaseDate;
        this.homepage = homepage;
    }

    public Game() {

    }

    @Override
    public String toString() {
        return "Game{" +
                "name='" + name + '\'' +
                ", description='" + description + '\'' +
                ", price='" + price + '\'' +
                ", realeaseDate='" + realeaseDate + '\'' +
                ", homepage='" + homepage + '\'' +
                '}';
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getPrice() {
        return price;
    }

    public void setPrice(String price) {
        this.price = price;
    }

    public String getRealeaseDate() {
        return realeaseDate;
    }

    public void setRealeaseDate(String realeaseDate) {
        this.realeaseDate = realeaseDate;
    }

    public String getHomepage() {
        return homepage;
    }

    public void setHomepage(String homepage) {
        this.homepage = homepage;
    }
}
