package matteofurgani.u4w1d5.entities;


import jakarta.persistence.*;
import java.util.List;

@Entity
@Table(name = "pizza")
public class Pizza extends Menu {

    @ElementCollection
    @CollectionTable(name = "pizza_ingredienti", joinColumns = @JoinColumn(name = "pizza_id"))
    @Column(name = "ingrediente")
    protected List<String> ingredienti;

    public Pizza() {
    }

    public Pizza(String nome, int calorie, double prezzo, List<String> ingredienti) {
        super(nome, calorie, prezzo);
        this.ingredienti = ingredienti;
    }

    public List<String> getIngredienti() {
        return ingredienti;
    }

    public void setIngredienti(List<String> ingredienti) {
        this.ingredienti = ingredienti;
    }

    @Override
    public String toString() {
        return "Pizza{" +
                "ingredienti=" + ingredienti +
                '}';
    }
}
