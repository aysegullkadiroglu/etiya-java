package workshop3;

// Eğitmen sınıfı

public class Instructor {
    private int id;
    private String name;
    private String photoUrl;
    private int categoryId;

    public Instructor(int id, String name, String photoUrl, int categoryId) {
        this.id = id;
        this.name = name;
        this.photoUrl = photoUrl;
        this.categoryId = categoryId;
    }

    // Getter ve Setter metotları (id, name, photoUrl, categoryId)

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPhotoUrl() {
        return photoUrl;
    }

    public void setPhotoUrl(String photoUrl) {
        this.photoUrl = photoUrl;
    }
    public int getCategoryId() {
        return categoryId;
    }

    public void setCategoryId(int categoryId) {
        this.categoryId = categoryId;
    }

    @Override
    public String toString() {
        return "Instructor {" +
                "id = " + id +
                ", name = '" + name + '\'' +
                ", photoUrl = '" + photoUrl + '\'' +
                ", categoryId = " + categoryId +
                '}';
    }
}

