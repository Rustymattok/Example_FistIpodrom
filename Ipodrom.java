package characters;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;

public class Ipodrom extends Application {
    static String rate;
    @Override
    public void start(Stage primaryStage) throws Exception {

        Pane root = new Pane();
        Image image = new Image(getClass().getResourceAsStream("speed.jpg"));
        ImageView img = new ImageView(image);
        img.setFitHeight(600);
        img.setFitWidth(900);

        MainItem newGame = new MainItem("НОВАЯ ИГРА");
        MainItem statistic = new MainItem("СТАТИСТИКА");
        MainItem exitGame = new MainItem("ВЫХОД");
        ButtonBack back = new ButtonBack("НАЗАД");
        SubMenu subMenuBack = new SubMenu(
                back
        );
        subMenuBack.setTranslateX(750);
        subMenuBack.setTranslateY(500);

        SubMenu subMenu = new SubMenu(
                newGame,
                statistic,
                exitGame
        );

        MainItem balance = new MainItem("БАЛАНС");
        MainItem chooseHorse = new MainItem("ВЫБРАТЬ ЛОШАДЬ");

        SubMenu subMenu1 = new SubMenu(
                balance,
                chooseHorse
        );

        MainItem horse1 = new MainItem("Дорожка - 1");
        MainItem horse2 = new MainItem("Дорожка - 2");
        MainItem horse3 = new MainItem("Дорожка - 3");
        MainItem horse4 = new MainItem("Дорожка - 4");
        MainItem horse5 = new MainItem("Дорожка - 5");
        MainItem horse6 = new MainItem("Дорожка - 6");
        MainItem horse7 = new MainItem("Дорожка - 7");
        MainItem horse8 = new MainItem("Дорожка - 8");

        SubMenu subMenu2 = new SubMenu(
                horse1,
                horse2,
                horse3,
                horse4,
                horse5,
                horse6,
                horse7,
                horse8
        );

        subMenu2.setTranslateY(100);

//        MainItem store1 = new MainItem("100");
//        MainItem store2 = new MainItem("150");
//        MainItem store3 = new MainItem("200");
//        MainItem store4 = new MainItem("250");
//        MainItem store5 = new MainItem("300");
//
//        SubMenu subMenu3 = new SubMenu(
//                store1,
//                store2,
//                store3,
//                store4,
//                store5
//        );

        MainMenu mainMenu1 = new MainMenu(subMenu, subMenuBack);

//Пишем обработчики выбора меню

        back.setVisible(false);

        newGame.setOnMouseClicked(event -> {
            mainMenu1.setSubMenu(subMenu1);
            back.setVisible(true);
        });

        back.setOnMouseClicked(event -> {
            mainMenu1.setSubMenu(subMenu);
            back.setVisible(false);
        });

        chooseHorse.setOnMouseClicked(event -> {
            mainMenu1.setSubMenu(subMenu2);
            back.setVisible(true);
        });

        exitGame.setOnMouseClicked(event -> System.exit(0));

        horse1.setOnMouseClicked(event -> {
            GameCharector.newWindow("Game");
            rate = horse1.getName();
    });
        horse2.setOnMouseClicked(event -> {
            GameCharector.newWindow("Game");
            rate = horse2.getName();
        });
        horse3.setOnMouseClicked(event -> {
            GameCharector.newWindow("Game");
            rate = horse3.getName();
        });
        horse4.setOnMouseClicked(event -> {
            GameCharector.newWindow("Game");
            rate = horse4.getName();
        });
        horse5.setOnMouseClicked(event -> {
            GameCharector.newWindow("Game");
            rate = horse5.getName();
        });
        horse6.setOnMouseClicked(event -> {
            GameCharector.newWindow("Game");
            rate = horse6.getName();
        });
        horse7.setOnMouseClicked(event -> {
            GameCharector.newWindow("Game");
            rate = horse7.getName();
        });
        horse8.setOnMouseClicked(event -> {
            GameCharector.newWindow("Game");
            rate = horse8.getName();
        });

        Scene scene = new Scene(root, 900, 600);

        root.getChildren().addAll(img, mainMenu1);
        primaryStage.setScene(scene);
        primaryStage.show();
    }

}
