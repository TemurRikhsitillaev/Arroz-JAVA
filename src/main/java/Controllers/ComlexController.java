package Controllers;

import Classes.Complexes;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.layout.Pane;

import java.util.Date;
import java.util.List;

public class ComlexController {
    @FXML
    Button add_button_admin;
    @FXML
    Button edit_button_admin;
    @FXML
    Button remove_button_admin;
    @FXML
    TableView<Complexes> complexesTableView;
    @FXML
    TableColumn<Complexes, String> nameColumn;
    @FXML
    TableColumn<Complexes, Integer> idColumn;
    @FXML
    TableColumn<Complexes, Float> outPriceColumn;
    @FXML
    TableColumn<Complexes, String> phoneColumn;
    @FXML
    TableColumn<Complexes, String> addressColumn;
    @FXML
    TableColumn<Complexes, List<String>> courtsColumn;
    @FXML
    TableColumn<Complexes, Date> openColumn;
    @FXML
    TableColumn<Complexes, Date> closeColumn;
    @FXML
    Pane arrozMainButton;
    @FXML



    public void ADD(ActionEvent e){
        
    }
    public void EDIT(ActionEvent e){

    }
    public void REMOVE(ActionEvent e){

    }
}
