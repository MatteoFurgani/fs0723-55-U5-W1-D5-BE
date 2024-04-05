package matteofurgani.u4w1d5.entities;


import jakarta.persistence.*;

@Entity
@Table(name = "bevanda")
public class Bevanda extends Menu {

    @Column(name = "dimensione")
    protected String dimensione;


    public Bevanda() {
    }

    public Bevanda(String nome, int calorie, double prezzo, String dimensione) {
        super(nome, calorie, prezzo);
        this.dimensione = dimensione;
    }

    public String getDimensione() {
        return dimensione;
    }

    public void setDimensione(String dimensione) {
        this.dimensione = dimensione;
    }
}
