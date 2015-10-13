package characters;

import javafx.animation.Animation;
import javafx.animation.Transition;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.util.Duration;

/**
 * Created by makarov_vv on 08.10.2015.
 */
public class Ninja extends Transition {
    int x;
    private String name;
    Character character;
    private Image image = new Image(getClass().getResourceAsStream("ninjatest3.png"));
    private ImageView imageView = new ImageView(image);
    private int count = 3;
    private int columns = 2;
    private int offsetX = 0;
    private int offsetY = 0;
    private int width = 42;
    private int height = 55;

    public Ninja(int n, String name) {
        this.character = new Character(imageView, n, count, columns, offsetX, offsetY, width, height);
        this.name = name;
        setCycleCount(Animation.INDEFINITE);
        setCycleDuration(Duration.millis(n));
        this.x = offsetX;
        character.animation.play();
    }
    public String getName() {
        return name;
    }
    @Override
    protected void interpolate(double frac) {
        character.setTranslateX(x++);
    }
}
