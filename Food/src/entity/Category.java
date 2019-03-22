package entity;

public class Category {
    private String categoryId;
    private String categoryName;
    private String categoryDate;

    public Category(String categoryId, String categoryName, String categoryDate) {
        this.categoryId = categoryId;
        this.categoryName = categoryName;
        this.categoryDate = categoryDate;
    }

    public Category() {
    }

    public String getCategoryId() {
        return categoryId;
    }

    public void setCategoryId(String categoryId) {
        this.categoryId = categoryId;
    }

    public String getCategoryName() {
        return categoryName;
    }

    public void setCategoryName(String categoryName) {
        this.categoryName = categoryName;
    }

    public String getCategoryDate() {
        return categoryDate;
    }

    public void setCategoryDate(String categoryDate) {
        this.categoryDate = categoryDate;
    }
}
