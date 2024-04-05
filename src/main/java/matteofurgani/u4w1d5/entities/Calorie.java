package matteofurgani.u4w1d5.entities;

import jakarta.persistence.*;

@Entity
@Table(name = "calorie")
public class Calorie {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "calorie")
    private int calorie;


    public Calorie() {
    }

    public int getCalorie() {
        return calorie;
    }

    public void setCalorie(int calorie) {
        this.calorie = calorie;
    }
}
