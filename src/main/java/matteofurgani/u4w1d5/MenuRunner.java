package matteofurgani.u4w1d5;

import matteofurgani.u4w1d5.dao.MenuService;
import matteofurgani.u4w1d5.entities.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import java.util.Arrays;
import java.util.List;

@Component
public class MenuRunner implements CommandLineRunner {
    private final MenuService menuService;

    private final BeansMenu beansMenu;


    @Autowired
    public MenuRunner(MenuService menuService, BeansMenu beansMenu) {
        this.menuService = menuService;
        this.beansMenu = beansMenu;
    }

    @Override
    public void run(String... args) throws Exception {

       Pizza margherita = beansMenu.margherita();
        Pizza napoli = beansMenu.napoli();
        Pizza boscaiola = beansMenu.boscaiola();
        Bevanda cocaCola = beansMenu.cocacola();
        Bevanda birra = beansMenu.birra();
        Condimento mozzarella = beansMenu.mozzarella();
        Condimento salsiccia = beansMenu.salsiccia();

        menuService.saveMenu(margherita);
        menuService.saveMenu(napoli);
        menuService.saveMenu(boscaiola);
        menuService.saveMenu(cocaCola);
        menuService.saveMenu(birra);
        menuService.saveMenu(mozzarella);
        menuService.saveMenu(salsiccia);


        System.out.println("Menu con prezzo inferiore a 6.00€:");
        List<Menu> menuByPriceLessThan6 = menuService.getMenuByPriceLessThan(6.00);
        menuByPriceLessThan6.forEach(menu -> System.out.println(menu.getNome()));

        System.out.println("\nMenu con prezzo compreso tra 5.00€ e 8.00€:");
        List<Menu> menuByPriceBetween5And8 = menuService.getMenuByPriceBetween(5.00, 8.00);
        menuByPriceBetween5And8.forEach(menu -> System.out.println(menu.getNome()));

        System.out.println("\nMenu con calorie inferiori a 800:");
        List<Menu> menuByCaloriesLessThan = menuService.getMenuByCaloriesLessThan(800);
        menuByCaloriesLessThan.forEach(menu -> System.out.println(menu.getNome()));

        System.out.println("\nMenu con nome che inizia con 'M':");
        List<Menu> menuByNameStartingWithM = menuService.getMenuByNameStartingWith("M");
        menuByNameStartingWithM.forEach(menu -> System.out.println(menu.getNome()));
    }
}

