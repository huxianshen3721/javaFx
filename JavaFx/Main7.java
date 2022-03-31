package JavaFx;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.canvas.Canvas;
import javafx.scene.canvas.GraphicsContext;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

/**
 * @author HuXianshen
 * @creat 2022-03-14:58
 */
public class Main7 extends Application {
    public static final double WIDTH = 800, HEIGHT = 600;
    private Canvas canvas = new Canvas(WIDTH, HEIGHT);
    private GraphicsContext graphicsContext = canvas.getGraphicsContext2D();

    private double x;
    private double y;

    public static void main(String[] args) {
        Application.launch(args);
    }
    @Override
    public void start(Stage primaryStage) throws Exception {
        canvas.setLayoutX(0);
        canvas.setLayoutY(0);
        canvas.setOnMousePressed(event -> {
            x = event.getX();
            y = event.getY();
        });

        //graphicsContext.setLineWidth(10);
        //graphicsContext.setStroke(Color.GREEN);
        ////graphicsContext.strokeRect(30, 30, 300, 300);
        //graphicsContext.setFill(Color.RED);
        ////graphicsContext.fillRect(30, 30, 300, 300);
        //graphicsContext.fillOval(30, 30, 300, 300);

        canvas.setOnMouseDragged(event -> {
            double x2 = event.getX();
            double y2 = event.getY();

            graphicsContext.strokeLine(x, y, x2, y2);
            x = x2;
            y = y2;
        });
        AnchorPane root = new AnchorPane(canvas);
        Scene scene = new Scene(root);
        primaryStage.setScene(scene);
        primaryStage.show();
    }
}
