package matteofurgani.u4w1d5.entities;

import jakarta.persistence.*;

@Entity
@Table(name = "condimento")
public class Condimento extends Menu {


    public Condimento(){}
    public Condimento(String nome, int calorie, double prezzo) {

        super(nome, calorie, prezzo);
    }
}
