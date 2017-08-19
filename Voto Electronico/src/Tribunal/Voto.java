package Tribunal;

import javafx.application.Platform;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.input.MouseEvent;
import javafx.stage.Stage;


import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Optional;

public class Voto {
    @FXML
    Label p1;
    int votosCandidato1, votosCandidato2, votosCandidato3 = 0;
    String cedula;

    @FXML
    public void initialize(){
        solicitarCedula();
    }

    public void solicitarCedula(){
        TextInputDialog dialog = new TextInputDialog();
        dialog.setTitle("Tribunal Electoral");
        dialog.setHeaderText("Voto Electronico");
        dialog.setContentText("Por favor ingrerse su cedula:");
        while(true){
            Optional<String> resultado = dialog.showAndWait();
            if (resultado.isPresent() && !resultado.get().isEmpty()){
                cedula = resultado.get();
                break;
            }
        }

    }

    public void guardarVoto(String c, String v){
        BufferedWriter bw = null;
        FileWriter fw = null;
        try{
            fw = new FileWriter("votos.csv", true);
            bw = new BufferedWriter(fw);
            bw.write("\n"+ c +"," + v);
            bw.close();
            fw.close();
        }catch (Exception e){
            System.out.println("Error :: Problema con el archivo");
        }
    }

    public void cargarDatos(int vc1, int vc2, int vc3) {
        votosCandidato1 = vc1;
        votosCandidato2 = vc2;
        votosCandidato3 = vc3;
    }

    public void Salir(ActionEvent actionEvent) {
        Platform.exit();
    }

    public void elegirCandidato1(MouseEvent mouseEvent) {
        Alert alert = new Alert(Alert.AlertType.CONFIRMATION);
        alert.setTitle("Tribunal Electorl");
        alert.setHeaderText("Voto Electtronico");
        alert.setContentText("Esta seguro de su voto a Juan Carlos Varela?");

        Optional<ButtonType> resultado = alert.showAndWait();
        if (resultado.get() == ButtonType.OK){
            votosCandidato1++;
            guardarVoto("ID Votador: "+cedula, " Candidato: 1 - Varela");
            solicitarCedula();
        }
    }

    public void elegirCandidato2(MouseEvent mouseEvent) {
        Alert alert = new Alert(Alert.AlertType.CONFIRMATION);
        alert.setTitle("Tribunal Electorl");
        alert.setHeaderText("Voto Electtronico");
        alert.setContentText("Esta seguro de su voto a Balbina Herrera?");

        Optional <ButtonType> resultado = alert.showAndWait();
        if (resultado.get() == ButtonType.OK) {
            votosCandidato2++;
            guardarVoto("ID Votador: "+cedula, " Candidato: 2 - Balbina");
            solicitarCedula();

        }
    }

    public void elegirCandidato3(MouseEvent mouseEvent) {
        Alert alert = new Alert(Alert.AlertType.CONFIRMATION);
        alert.setTitle("Tribunal Electorl");
        alert.setHeaderText("Voto Electtronico");
        alert.setContentText("Esta seguro de su voto a Ricardo Martinelli?");

        Optional <ButtonType> resultado = alert.showAndWait();
        if (resultado.get() == ButtonType.OK) {
            votosCandidato3++;
            guardarVoto("ID Votador: "+cedula, " Candidato: 3 - Martinelli");
            solicitarCedula();

        }
    }

    public void verResultado(ActionEvent actionEvent) throws IOException {
        if (votosCandidato1 > 0 || votosCandidato2 > 0 || votosCandidato3 > 0) {
            Stage stage = (Stage) p1.getScene().getWindow();
            FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("Resultado.fxml"));
            Parent root = (Parent) fxmlLoader.load();
            Resultado controller = fxmlLoader.<Resultado>getController();
            controller.cargarDatos(votosCandidato1, votosCandidato2, votosCandidato3);
            Scene scene = new Scene(root);
            stage.setScene(scene);
            stage.show();
        } else {
            Alert alert = new Alert(Alert.AlertType.ERROR);
            alert.setTitle("Tribunal Electoral");
            alert.setHeaderText("Voto Electronico");
            alert.setContentText("No hay resultados disponibles.");
            alert.showAndWait();
        }
    }

}
