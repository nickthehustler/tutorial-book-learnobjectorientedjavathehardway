import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.HPos;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;
import java.io.PrintWriter;
import java.io.File;
import java.io.IOException;

public class MessengerWindow extends Application {
  @Override
  public void start(Stage stage) {
    GridPane root = new GridPane();
    Scene scene = new Scene(root, 300, 200);

    TextField tf = new TextField("Graphics the Hard Way!");
    Button btn = new Button("Print Message") ;

    btn.setOnAction(new EventHandler<ActionEvent>() {
      @Override
      public void handle(ActionEvent event) {
        String fileName = "textOutputFile.txt";

        try {
          File file = new File(fileName);
          PrintWriter writeToFile = new PrintWriter(file);
          // write.open();
          writeToFile.println(tf.getText());
          writeToFile.println();
          // System.out.println(tf.getText());
          writeToFile.flush();
          writeToFile.close();
        } catch(IOException e) {
          System.out.println("File " + fileName + " does not exist. Please create " + fileName + " in same directory.");
        }
      }
    });

    root.setAlignment(Pos.CENTER);
    root.setVgap(20);

    root.add(tf, 0, 0);
    root.add(btn, 0, 1);

    root.setHalignment(btn, HPos.CENTER);

    stage.setTitle("Messenger Window");
    stage.setScene(scene);
    stage.show();
  }

  public static void main(String[] args) {
    launch(args);

  }
}
