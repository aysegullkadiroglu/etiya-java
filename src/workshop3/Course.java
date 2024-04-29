package workshop3;

// Kurs sınıfı

public class Course {

    private int id;
    private int instructorId;
    private int categoryId;
    private String name;
    private String description;
    private double price;

    public Course(int id, int instructorId, int categoryId, String name,
                  String description, double price) {
        this.id = id;
        this.instructorId = instructorId;
        this.categoryId = categoryId;
        this.name = name;
        this.description = description;
        this.price = price;
    }

    // Getter ve Setter metotları (id, instructorId, categoryId, name, description, price)

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }
    public int getCategoryId() {
        return categoryId;
    }

    public void setCatagoryId(int categoryId) {
        this.categoryId = categoryId;
    }

    public int getInstructorId() {
        return instructorId;
    }

    public void setInstructorId(int instructorId) {
        this.instructorId = instructorId;
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

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "Course {" +
                "id = " + id +
                ", instructor = '" + instructorId + '\'' +
                ", category = '" + categoryId + '\'' +
                ", name = '" + name + '\'' +
                ", description = '" + description + '\'' +
                ", price = " + price +
                '}';
    }
}
