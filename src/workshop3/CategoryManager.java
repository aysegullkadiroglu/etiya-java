package workshop3;

import java.util.ArrayList;
import java.util.List;

public class CategoryManager {
    private List<Category> categories;

    public CategoryManager() {
        // Kategori listesini başlatma
        categories = new ArrayList<>();
        categories.add(new Category(1, "Programming"));
        categories.add(new Category(2, "Design"));
    }

    // Yeni bir kategori eklemek için
    public void addCategory(Category category) {
        categories.add(category);
    }

    // Tüm kategorileri listelemek için
    public List<Category> getAllCategories() {
        return categories;
    }

    // Belirli bir kategori ID'sine göre kategoriyi bulmak için
    public Category getCategoryById(int categoryId) {
        for (Category category : categories) {
            if (category.getId() == categoryId) {
                return category;
            }
        }
        return null;
    }

    // Belirli bir kategori adına göre kategoriyi bulmak için
    public String getCategoryNameById(int categoryId) {
        for(Category category: categories){
            if(category.getId() == categoryId){
                return category.getName();
            }
        }
        return null;
    }


    // Bir kategoriyi güncellemek için
    public void updateCategory(Category updatedCategory) throws IllegalArgumentException {
        for (int i = 0; i < categories.size(); i++) {
            Category category = categories.get(i);
            if (category.getId() == updatedCategory.getId()) {
                categories.set(i, updatedCategory);
                return;
            }
        }
        throw new IllegalArgumentException("Belirtilen ID'ye sahip bir kategori bulunamadı: " + updatedCategory);
    }

    // Bir kategoriyi silmek için
    public void deleteCategory(int categoryId) {
        for (int i = 0; i < categories.size(); i++) {
            Category category = categories.get(i);
            if (category.getId() == categoryId) {
                categories.remove(i);
                return;
            }
        }
        System.out.println("Beliritlen ID'ye sahip bir kategori bulunamadı: " + categoryId);
    }
}
