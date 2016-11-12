package homeWorks.work_9.arraysFX.controller;

import javafx.fxml.FXML;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;

import javafx.event.ActionEvent;
import javafx.event.EventHandler;

import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.control.ComboBox;

import java.util.Arrays;

import homeWorks.work_9.arraysFX.model.Car;

/**
 * Created by askello on 21.11.2015.
 */
public class MainWindowController {

    @FXML
    private TableView table;

    @FXML
    private TableColumn<Car, String> typeColumn;

    @FXML
    private TableColumn<Car, String> colorColumn;

    @FXML
    private TableColumn<Car, Integer> speedColumn;

    @FXML
    private TableColumn<Car, Integer> priceColumn;

    @FXML
    private TableColumn<Car, Integer> idColumn;

    @FXML
    private ComboBox<String> comboBox;

    private Car[] cars = createCarsArray();

    private ObservableList<Car> tableData = FXCollections.observableArrayList();

    @FXML
    private void initialize() {
        initTableData();
        updateTable();

        comboBox.getItems().add("type");
        comboBox.getItems().add("price");
        comboBox.getItems().add("speed");
        comboBox.getItems().add("color");
        comboBox.getItems().add("id");

        comboBox.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                String selectedItem = comboBox.getSelectionModel().getSelectedItem();
                Arrays.sort(cars, new Car.CarComparatorBy(selectedItem));
                updateTable();
            }
        });
    }


    private void updateTable() {
        table.getItems().removeAll(table.getItems());
        updateTableData();
    }

    private void initTableData() {
        typeColumn.setCellValueFactory(new PropertyValueFactory<Car, String>("type"));
        colorColumn.setCellValueFactory(new PropertyValueFactory<Car, String>("color"));
        idColumn.setCellValueFactory(new PropertyValueFactory<Car, Integer>("id"));
        priceColumn.setCellValueFactory(new PropertyValueFactory<Car, Integer>("price"));
        speedColumn.setCellValueFactory(new PropertyValueFactory<Car, Integer>("speed"));

        table.setItems(tableData);
    }

    private void updateTableData() {
        tableData.removeAll();

        for(Car car : cars) {
            tableData.add(car);
        }
    }

    private Car[] createCarsArray() {
        Car[] cars = {
                new Car("BMW", 2000, 220, "Red", 4),
                new Car("Opel", 3000, 180, "Green", 2),
                new Car("Mersedes", 4000, 270, "Blue", 5),
                new Car("Subaru", 2000, 200, "Red", 1),
                new Car("Aston Martin", 5000, 180, "Yellow", 3)
        };

        return cars;
    }
}
