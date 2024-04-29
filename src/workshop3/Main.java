package workshop3;

import java.util.List;

public class Main {
    public static void main(String[] args) {

        // Category operations
        CategoryManager categoryManager = new CategoryManager();
        CourseManager courseManager = new CourseManager();
        InstructorManager instructorManager = new InstructorManager();

        List<Course> courses = courseManager.getAllCourses();
        List<Category> categories = categoryManager.getAllCategories();
        List<Instructor> instructors = instructorManager.getAllInstructors();

        System.out.println("All Categories:");
        for (Category category : categories) {
            System.out.println("ID: " + category.getId() + ", Name: " + category.getName());
        }

        System.out.println("--------------------------------------");

        // Add a new category
        Category newCategory = new Category(4, "Mobile Development");
        categoryManager.addCategory(newCategory);
        System.out.println("\nNew Category Added:");

        // Update a category
        Category updatedCategory = new Category(1, "New Technologies");
        categoryManager.updateCategory(updatedCategory);
        System.out.println("\nCategory Updated:");

        // Delete a category
        categoryManager.deleteCategory(3);
        System.out.println("\nCategory Deleted:");
        System.out.println("--------------------------------------");
        System.out.println("All Categories:");
        for (Category category : categories) {
            System.out.println("ID: " + category.getId() + ", Name: " + category.getName());
        }

        System.out.println("--------------------------------------");


        System.out.println("\nAll Courses:");
        for (Course course1 : courses) {
            String category = categoryManager.getCategoryNameById(course1.getCategoryId());
            String instructorName = instructorManager.getInstructorNameById(course1.getInstructorId());

            System.out.print("ID: " + course1.getId());
            System.out.print(", Name: " + course1.getName());
            System.out.print(", Price: $" + course1.getPrice());
            System.out.print(", Instructor Name: " + instructorName);
            System.out.println(", Category Name: " + category);
        }

        // Add a New Course
        Course course = new
                Course(3,3,1, "C Programming", "Sıfırdan C Programlama kursu", 0.0);
        courseManager.addCourse(course);
        System.out.println("\nNew Course Added:");

        // Update a course
        int courseId = 1;
        int instructorId = 1;
        int categoryId = 1;
        String newCourseName = "Sıfırdan Angular Programlama";
        String newDescription = "Angular Programlama kursu";
        double newPrice = 0.0;
        courseManager.updateCourse(courseId, newCourseName, instructorId, newDescription, newPrice, categoryId);
        System.out.println("\nCourse Updated:");

        // Delete a course
        courseManager.removeCourse(3);
        System.out.println("\nCourse Removed:");

        System.out.println("--------------------------------------");

        System.out.println("\nAll Courses:");
        for (Course course2 : courses) {
            String category = categoryManager.getCategoryNameById(course2.getCategoryId());
            String instructorName = instructorManager.getInstructorNameById(course2.getInstructorId());

            System.out.print("ID: " + course2.getId());
            System.out.print(", Name: " + course2.getName());
            System.out.print(", Price: $" + course2.getPrice());
            System.out.print(", Instructor Name: " + instructorName);
            System.out.println(", Category Name: " + category);
        }

        // Instructor operations
        System.out.println("--------------------------------------");
        System.out.println("\nAll Instructors:");
        for (Instructor instructor : instructors) {
            System.out.println("ID: " + instructor.getId() + ", Name: " + instructor.getName());
        }

        // Add a new Instructor
        Instructor newInstructor = new
                Instructor(5, "Halit Kalaycı", "https://avatars.githubusercontent.com/u/59770497?v=4",1);
        instructorManager.addInstructor(newInstructor);
        System.out.println("\nNew Instructor Added:");


        // Update an Instructor
        int newInstructorId = 1;
        String newInstructorName = "İrem Balcı";
        String newAvatarUrl = "https://avatars.githubusercontent.com/u/42204035?v=4";
        instructorManager.updateInstructor(newInstructorId, newInstructorName, newAvatarUrl);
        System.out.println("\nInstructor Updated:");

        // Delete a Instructor
        instructorManager.removeInstructor(3);
        System.out.println("\nInstructor Deleted:");
        System.out.println("--------------------------------------");
        System.out.println("\nAll Instructors:");
        for (Instructor instructor : instructors) {
            System.out.println("ID: " + instructor.getId() + ", Name: " + instructor.getName());
        }

    }
}
