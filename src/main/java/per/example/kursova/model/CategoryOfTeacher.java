package per.example.kursova.model;

import javax.persistence.*;

@Entity
public class CategoryOfTeacher {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;
    @Column(name = "category")
    private String category;

    public CategoryOfTeacher() {
    }

    public CategoryOfTeacher(String category) {
        this.category = category;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }
}
