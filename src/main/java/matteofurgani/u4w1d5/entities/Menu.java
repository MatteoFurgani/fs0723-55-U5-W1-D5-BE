package matteofurgani.u4w1d5.entities;

import jakarta.persistence.*;

@Entity
@Table(name = "menu")
@Inheritance(strategy = InheritanceType.JOINED)
public abstract class Menu {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "nome")
    private String nome;

    @Column(name = "calorie")
    private int calorie;

    @Column(name = "prezzo")
    private double prezzo;


    public Menu() {
    }

    public Menu(String nome, int calorie, double prezzo) {
        this.nome = nome;
        this.calorie = calorie;
        this.prezzo = prezzo;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getCalorie() {
        return calorie;
    }

    public void setCalorie(int calorie) {
        this.calorie = calorie;
    }

    public double getPrezzo() {
        return prezzo;
    }

    public void setPrezzo(double prezzo) {
        this.prezzo = prezzo;
    }

    @Override
    public String toString() {
        return "Menu{" +
                "nome='" + nome + '\'' +
                ", calorie=" + calorie +
                ", prezzo=" + prezzo +
                '}';
    }
}
