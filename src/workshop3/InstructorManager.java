package workshop3;

import java.util.ArrayList;
import java.util.List;

public class InstructorManager {
    private List<Instructor> instructors;

    public InstructorManager() {
        this.instructors = new ArrayList<>();
        instructors.add(new Instructor(1, "Engin Demiroğ",
                "https://avatars.githubusercontent.com/u/10206539?v=4", 1));
        instructors.add(new Instructor(2, "Muhammed İnan",
                "https://avatars.githubusercontent.com/u/67782652?v=4", 1));
        instructors.add(new Instructor(2, "Muhammed İnan",
                "https://avatars.githubusercontent.com/u/67782652?v=4", 2));
    }

    // Eğitmen ekleme
    public void addInstructor(Instructor instructor) {
        instructors.add(instructor);
    }

    // Eğitmen silme
    public void removeInstructor(int instructorId) {
        for (Instructor instructor : instructors) {
            if (instructor.getId() == instructorId) {
                instructors.remove(instructorId);
                return;
            }
        }
        System.out.println("Eğitmen bulunamadı.");
    }

    // Tüm eğitmenleri listeleme
    public List<Instructor> getAllInstructors() {
        return instructors;
    }

    // Belirli bir kategoriye ait eğitmenleri listeleme
    public String getInstructorNameById(int instructorId) {
        for(Instructor instructor: instructors){
            if(instructor.getId() == instructorId){
                return instructor.getName();
            }

        }
        return null;
    }

    // Eğitmen bilgilerini güncelleme
    public void updateInstructor(int instructorId, String newInstructorName, String newPhotoUrl) {
        for (Instructor instructor : instructors) {
            if (instructor.getId() == instructorId) {
                instructor.setName(newInstructorName);
                instructor.setPhotoUrl(newPhotoUrl);
                return;
            }
        }
        System.out.println("Kurs bulunamadı.");
    }
}


