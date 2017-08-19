package Tribunal;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.chart.PieChart;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.stage.Stage;


import java.io.IOException;

public class Resultado {

    @FXML
    PieChart estadistica;
    @FXML
    Button btnVolver;
    @FXML
    Label ganador;

    int votosCandidato1, votosCandidato2, votosCandidato3;


    public void cargarDatos(int vc1, int vc2, int vc3) {
        votosCandidato1 = vc1;
        votosCandidato2 = vc2;
        votosCandidato3 = vc3;

        ObservableList<PieChart.Data> pieChartData =
                FXCollections.observableArrayList(
                        new PieChart.Data("Juan Carlos Varela", votosCandidato1),
                        new PieChart.Data("Balbina Herrera", votosCandidato2),
                        new PieChart.Data("Ricardo Martinelli", votosCandidato3)
                );
        estadistica.setTitle("Resultados");
        estadistica.setLabelsVisible(true);
        estadistica.setLegendVisible(true);
        estadistica.setData(pieChartData);

        if (votosCandidato1 > votosCandidato2 && votosCandidato1 > votosCandidato3)
            ganador.setText(ganador.getText() + " Juan Carlos Varela");
        if (votosCandidato2 > votosCandidato1 && votosCandidato2 > votosCandidato3)
            ganador.setText(ganador.getText() + " Balbina Herrera");
        if (votosCandidato3 > votosCandidato1 && votosCandidato3 > votosCandidato2)
            ganador.setText(ganador.getText() + " Ricardo Martinelli");
    }


    public void volver(ActionEvent actionEvent) throws IOException {
        Stage stage = (Stage) btnVolver.getScene().getWindow();
        FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("voto.fxml"));
        Parent root = (Parent)fxmlLoader.load();
        Voto controller = fxmlLoader.getController();
        Scene scene = new Scene(root);
        stage.setScene(scene);
        stage.show();
    }
}
