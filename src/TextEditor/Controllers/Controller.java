package TextEditor.Controllers;


import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Modality;
import javafx.stage.Stage;

import java.io.IOException;


public class Controller {


    public void actionCreateNew(ActionEvent actionEvent) {
    }

    public void actionOpenFile(ActionEvent actionEvent) {

    }

    public void actionSaveFile(ActionEvent actionEvent) {
    }

    public void actionSaveAsFile(ActionEvent actionEvent) {
    }

    public void actionQuit(ActionEvent actionEvent) {
        System.exit(0);
    }

    public void actionUndo(ActionEvent actionEvent) {
    }

    public void actionRedo(ActionEvent actionEvent) {
    }

    public void actionCut(ActionEvent actionEvent) {
    }

    public void actionCopy(ActionEvent actionEvent) {
    }



    public void actionPaste(ActionEvent actionEvent) {
    }

    public void actionDelete(ActionEvent actionEvent) {
    }

    public void actionSelectAll(ActionEvent actionEvent) {
    }

    public void actionClear(ActionEvent actionEvent) {
    }

    public void showSearch(ActionEvent actionEvent) {
        try{
            Stage stage = new Stage();
            Parent root = FXMLLoader.load(getClass().getResource("../fxml/Search.fxml"));
            stage.setTitle("Find");
            stage.setMinWidth(300);
            stage.setMinHeight(100);
            stage.setResizable(false);
            stage.setScene(new Scene(root));
//            stage.initModality(Modality.WINDOW_MODAL);
//            stage.initOwner(((Node)actionEvent.getSource()).getScene().getWindow());
            stage.show();




        }catch (IOException e) {
            e.printStackTrace();

        }
    }

    public void actionWordCount(ActionEvent actionEvent) {
    }

    public void showAbout(ActionEvent actionEvent) {
        try{
            Stage stage = new Stage();
            Parent root = FXMLLoader.load(getClass().getResource("../fxml/About.fxml"));
            stage.setTitle("About");
            stage.setMinWidth(100);
            stage.setMinHeight(100);
            stage.setResizable(false);
            stage.setScene(new Scene(root, 440, 100));
            stage.show();




        }catch (IOException e) {
            e.printStackTrace();

        }

        System.out.println("about");
    }

    public void closeWindow(ActionEvent actionEvent) {
        Node source = (Node) actionEvent.getSource();
        Stage stage = (Stage) source.getScene().getWindow();
        stage.close();
    }
}
