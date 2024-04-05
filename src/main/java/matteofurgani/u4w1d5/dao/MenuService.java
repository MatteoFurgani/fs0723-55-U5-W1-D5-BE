package matteofurgani.u4w1d5.dao;

import matteofurgani.u4w1d5.dao.MenuDAO;
import matteofurgani.u4w1d5.entities.Menu;
import matteofurgani.u4w1d5.entities.Pizza;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class MenuService {

    private final MenuDAO menuDAO;

    @Autowired
    public MenuService(MenuDAO menuDAO) {
        this.menuDAO = menuDAO;
    }

    public void saveMenu(Menu menu) {
        menuDAO.save(menu);
    }

    public List<Menu> getMenuByPriceLessThan(double price) {
        return menuDAO.findByPrezzoLessThan(price);
    }

    public List<Menu> getMenuByPriceBetween(double minPrice, double maxPrice) {
        return menuDAO.findByPrezzoBetween(minPrice, maxPrice);
    }

    public List<Menu> getMenuByCaloriesLessThan(int calories) {
        return menuDAO.findByCalorieLessThan(calories);
    }

    public List<Menu> getMenuByNameStartingWith(String prefix) {
        return menuDAO.findByNomeStartingWith(prefix);
    }


}
