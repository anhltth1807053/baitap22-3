package entity;

public class Foods {
    private String id;
    private String name;
    private String description;
    private String price;
    private String createAt;

    public Foods(int id, String name, String description, int price, String createAt) {

    }

    @Override
    public String toString() {
        return "Foods{" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                ", description='" + description + '\'' +
                ", price='" + price + '\'' +
                ", createAt='" + createAt + '\'' +
                '}';
    }

    public Foods() {
    }

    public Foods(String id, String name, String description, String price, String createAt) {
        this.id = id;
        this.name = name;
        this.description = description;
        this.price = price;
        this.createAt = createAt;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
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

    public String getCreateAt() {
        return createAt;
    }

    public void setCreateAt(String createAt) {
        this.createAt = createAt;
    }
}
