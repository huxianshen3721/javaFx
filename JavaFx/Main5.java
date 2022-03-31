package JavaFx;

import javafx.application.Application;
import javafx.beans.value.ChangeListener;
import javafx.beans.value.ObservableValue;
import javafx.scene.Scene;
import javafx.scene.layout.AnchorPane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.stage.Stage;

/**
 * @author HuXianshen
 * @creat 2022-03-16:14
 */
public class Main5 extends Application {
    public static void main(String[] args) {
        Application.launch(args);
    }
    @Override
    public void start(Stage primaryStage) throws Exception {
        AnchorPane root = new AnchorPane();

        Scene scene = new Scene(root, 500, 500);
        Circle circle = new Circle();
        circle.setCenterX(200);
        circle.setCenterY(200);
        //半径
        circle.setRadius(100);
        circle.setStroke(Color.BLACK);
        circle.setFill(Color.BLUE);

        circle.centerXProperty().bind(scene.widthProperty().divide(2));
        circle.centerYProperty().bind(scene.heightProperty().divide(2));root.getChildren().add(circle);

        circle.centerYProperty().addListener(new ChangeListener<Number>() {
            @Override
            public void changed(ObservableValue<? extends Number> observable, Number oldValue, Number newValue) {
                System.out.println("y轴中心点改变了" + oldValue + " " + newValue);
            }
        });

        primaryStage.setScene(scene);
        primaryStage.show();

    }
}
