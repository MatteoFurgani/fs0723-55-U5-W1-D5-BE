package matteofurgani.u4w1d5.dao;

import matteofurgani.u4w1d5.entities.Menu;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import java.util.List;

@Repository
public interface MenuDAO extends JpaRepository<Menu, Long> {

    //Trova tutti i menu con un prezzo inferiore a quello fornito
    List<Menu> findByPrezzoLessThan(double prezzo);

    //Trova tutti i menu con un prezzo compreso tra i valori forniti
    List<Menu> findByPrezzoBetween(double min, double max);

    //Trova tutti i menu con un numero di calorie inferiore a quello fornito
    List<Menu> findByCalorieLessThan(int calorie);

    //Trova tutti i menu con un nome che inizia con la stringa fornita
    List<Menu> findByNomeStartingWith(String prefix);
}
