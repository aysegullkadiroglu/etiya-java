package workshop3;

import java.util.ArrayList;
import java.util.List;

public class CourseManager {
    private final List<Course> courses;

    public CourseManager() {
        this.courses = new ArrayList<>();
        courses.add(new Course(1, 1, 1,
                "Software Developer Training Camp (Java)", "Java language programming", 0.0));
        courses.add(new Course(1, 2, 1,
                "Senior Software Developer Training Camp (.NET)", ".NET programming", 0.0));
    }

    // Kurs ekleme
    public void addCourse(Course course) {
        courses.add(course);
    }

    // Kurs silme
    public void removeCourse(int courseId) {
        for (Course course : courses) {
            if (course.getId() == courseId) {
                courses.remove(course);
                return;
            }
        }
        System.out.println("Kurs bulunamadı.");
    }

    // Tüm kursları listeleme
    public List<Course> getAllCourses() {
        return courses;
    }

    // Belirli bir kategoriye ait kursları listeleme
    public void listCoursesByCategory(int categoryId) {
        System.out.println("Kategoriye göre kurslar (" + categoryId + "):");
        for (Course course : courses) {
            if (course.getCategoryId() == categoryId) {
                System.out.println(course);
            }
        }
    }

    // Kurs bilgilerini güncelleme
    public void updateCourse(int courseId, String newName, int newInstructorId,
                             String newDescription, double newPrice, int newCategoryId) {
        for (Course course : courses) {
            if (course.getId() == courseId) {
                course.setName(newName);
                course.setInstructorId(newInstructorId);
                course.setDescription(newDescription);
                course.setPrice(newPrice);
                course.setCatagoryId(newCategoryId);
                return;
            }
        }
        System.out.println("Kurs bulunamadı.");
    }

}

