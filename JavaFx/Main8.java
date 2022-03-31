package JavaFx;

import javafx.animation.AnimationTimer;
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.canvas.Canvas;
import javafx.scene.canvas.GraphicsContext;
import javafx.scene.image.Image;
import javafx.scene.input.KeyCode;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

/**
 * @author HuXianshen
 * @creat 2022-03-15:25
 */
public class Main8 extends Application {
    private static final double WIDTH = 1800, HEIGHT = 1000;
    private static Canvas canvas = new Canvas(WIDTH, HEIGHT);
    private GraphicsContext graphicsContext = canvas.getGraphicsContext2D();
    private Image background = new Image("image/ChinaMap.png");
    private Image self = new Image("image/love.png");
    private double x = 400, y = 300;
    @Override
    public void start(Stage primaryStage) throws Exception {
        update();
        AnchorPane root = new AnchorPane(canvas);
        Scene scene = new Scene(root);

        scene.setOnKeyPressed(event -> {
            KeyCode keyCode = event.getCode();

            switch (keyCode) {
                case UP:
                    y -= 15;
                    System.out.println("UP");
                    break;
                case DOWN:
                    y += 15;
                    System.out.println("DOWN");
                    break;
                case LEFT:
                    x -= 15;
                    System.out.println("LEFT");
                    break;
                case RIGHT:
                    x += 15;
                    System.out.println("RIGHT");
                    break;
                default:
                    System.out.println("ERROR");
            }
        });

        primaryStage.setScene(scene);
        primaryStage.show();
    }
    private void paint() {
        graphicsContext.drawImage(background, 0, 0);
        graphicsContext.drawImage(self, x, y);
    }

    private void update() {
        AnimationTimer animationTimer = new AnimationTimer() {
            @Override
            public void handle(long now) {
                paint();
            }
        };

        animationTimer.start();
    }

    public static void main(String[] args) {

        launch(args);
    }

    static {
        canvas.setLayoutX(0);
        canvas.setLayoutY(0);
    }
}
