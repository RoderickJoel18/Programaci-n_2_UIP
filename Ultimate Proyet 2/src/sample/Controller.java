package sample;

import javafx.application.Platform;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.input.MouseEvent;

public class Controller{
    @FXML
    Button cas1;
    @FXML
    Button cas2;
    @FXML
    Button cas3;
    @FXML
    Button cas4;
    @FXML
    Button cas5;
    @FXML
    Button cas6;
    @FXML
    Button cas7;
    @FXML
    Button cas8;
    @FXML
    Button cas9;
    @FXML
    TextField Ganadas;
    @FXML
    TextField Perdidas;


    public void cas1(MouseEvent mouseEvent) {
            if (this.cas1.getText().equals("") && this.cas2.getText().equals("") && this.cas3.getText().equals("") && this.cas4.getText().equals("") &&
                    this.cas5.getText().equals("") && this.cas6.getText().equals("") && this.cas7.getText().equals("") &&
                    this.cas8.getText().equals("") && this.cas9.getText().equals("")) {
                cas1.setText("X");
                cas5.setText("0");

            } else if (this.cas1.getText().equals("") && this.cas2.getText().equals("") && this.cas3.getText().equals("X") &&
                    this.cas4.getText().equals("") && this.cas5.getText().equals("0") && this.cas6.getText().equals("") &&
                    this.cas7.getText().equals("") && this.cas8.getText().equals("") && this.cas9.getText().equals("")) {
                cas1.setText("X");
                cas2.setText("0");

            } else if (this.cas1.getText().equals("") && this.cas2.getText().equals("") && this.cas3.getText().equals("0") &&
                    this.cas4.getText().equals("") && this.cas5.getText().equals("") && this.cas6.getText().equals("X") &&
                    this.cas7.getText().equals("") && this.cas8.getText().equals("") && this.cas9.getText().equals("")) {
                cas1.setText("X");
                cas4.setText("0");

            } else if (this.cas1.getText().equals("") && this.cas2.getText().equals("") && this.cas3.getText().equals("") &&
                    this.cas4.getText().equals("") && this.cas5.getText().equals("0") && this.cas6.getText().equals("") &&
                    this.cas7.getText().equals("X") && this.cas8.getText().equals("") && this.cas9.getText().equals("")) {
                cas1.setText("X");
                cas4.setText("0");

            } else if (this.cas1.getText().equals("") && this.cas2.getText().equals("0") && this.cas3.getText().equals("") &&
                    this.cas4.getText().equals("") && this.cas5.getText().equals("") && this.cas6.getText().equals("") &&
                    this.cas7.getText().equals("") && this.cas8.getText().equals("X") && this.cas9.getText().equals("")) {
                cas1.setText("X");
                cas7.setText("0");

            } else if (this.cas1.getText().equals("") && this.cas2.getText().equals("") && this.cas3.getText().equals("") &&
                    this.cas4.getText().equals("") && this.cas5.getText().equals("0") && this.cas6.getText().equals("") &&
                    this.cas7.getText().equals("") && this.cas8.getText().equals("") && this.cas9.getText().equals("X")) {
                cas1.setText("X");
                cas2.setText("0");

            }else if (this.cas1.getText().equals("") && this.cas2.getText().equals("0") && this.cas3.getText().equals("X") &&
                    this.cas4.getText().equals("") && this.cas5.getText().equals("0") && this.cas6.getText().equals("") &&
                    this.cas7.getText().equals("0") && this.cas8.getText().equals("") && this.cas9.getText().equals("")) {
                cas1.setText("X");
                cas8.setText("0");

            }else if (this.cas1.getText().equals("") && this.cas2.getText().equals("") && this.cas3.getText().equals("X") &&
                    this.cas4.getText().equals("") && this.cas5.getText().equals("0") && this.cas6.getText().equals("X") &&
                    this.cas7.getText().equals("") && this.cas8.getText().equals("") && this.cas9.getText().equals("0")) {
                cas1.setText("X");
                cas8.setText("0");

            }else if (this.cas1.getText().equals("") && this.cas2.getText().equals("0") && this.cas3.getText().equals("X") &&
                    this.cas4.getText().equals("") && this.cas5.getText().equals("0") && this.cas6.getText().equals("") &&
                    this.cas7.getText().equals("X") && this.cas8.getText().equals("") && this.cas9.getText().equals("")) {
                cas1.setText("X");
                cas9.setText("0");

            }else if (this.cas1.getText().equals("") && this.cas2.getText().equals("") && this.cas3.getText().equals("X") &&
                    this.cas4.getText().equals("0") && this.cas5.getText().equals("0") && this.cas6.getText().equals("") &&
                    this.cas7.getText().equals("") && this.cas8.getText().equals("X") && this.cas9.getText().equals("")) {
                cas1.setText("X");
                cas2.setText("0");

            }else if (this.cas1.getText().equals("") && this.cas2.getText().equals("") && this.cas3.getText().equals("X") &&
                    this.cas4.getText().equals("0") && this.cas5.getText().equals("0") && this.cas6.getText().equals("") &&
                    this.cas7.getText().equals("X") && this.cas8.getText().equals("X") && this.cas9.getText().equals("0")) {
                cas1.setText("X");
                cas6.setText("0");

            }
        }



    public void cas2(MouseEvent mouseEvent) {
            if (this.cas1.getText().equals("") && this.cas2.getText().equals("") && this.cas3.getText().equals("") &&
                    this.cas4.getText().equals("") && this.cas5.getText().equals("") && this.cas6.getText().equals("") &&
                    this.cas7.getText().equals("") && this.cas8.getText().equals("") && this.cas9.getText().equals("")) {
                cas2.setText("X");
                cas1.setText("0");

            } else if (this.cas1.getText().equals("X") && this.cas2.getText().equals("") && this.cas3.getText().equals("") &&
                    this.cas4.getText().equals("") && this.cas5.getText().equals("0") && this.cas6.getText().equals("") &&
                    this.cas7.getText().equals("") && this.cas8.getText().equals("") && this.cas9.getText().equals("")) {
                cas2.setText("X");
                cas3.setText("0");

            } else if (this.cas1.getText().equals("") && this.cas2.getText().equals("") && this.cas3.getText().equals("X") &&
                    this.cas4.getText().equals("") && this.cas5.getText().equals("0") && this.cas6.getText().equals("") &&
                    this.cas7.getText().equals("") && this.cas8.getText().equals("") && this.cas9.getText().equals("")) {
                cas2.setText("X");
                cas1.setText("0");

            } else if (this.cas1.getText().equals("0") && this.cas2.getText().equals("") && this.cas3.getText().equals("") &&
                    this.cas4.getText().equals("X") && this.cas5.getText().equals("") && this.cas6.getText().equals("") &&
                    this.cas7.getText().equals("") && this.cas8.getText().equals("") && this.cas9.getText().equals("")) {
                cas2.setText("X");
                cas5.setText("0");

            } else if (this.cas1.getText().equals("0") && this.cas2.getText().equals("") && this.cas3.getText().equals("") &&
                    this.cas4.getText().equals("4") && this.cas5.getText().equals("X") && this.cas6.getText().equals("") &&
                    this.cas7.getText().equals("") && this.cas8.getText().equals("") && this.cas9.getText().equals("")) {
                cas2.setText("X");
                cas8.setText("0");

            } else if (this.cas1.getText().equals("") && this.cas2.getText().equals("") && this.cas3.getText().equals("0") &&
                    this.cas4.getText().equals("") && this.cas5.getText().equals("") && this.cas6.getText().equals("X") &&
                    this.cas7.getText().equals("") && this.cas8.getText().equals("") && this.cas9.getText().equals("")) {
                cas2.setText("X");
                cas4.setText("0");

            } else if (this.cas1.getText().equals("") && this.cas2.getText().equals("") && this.cas3.getText().equals("") &&
                    this.cas4.getText().equals("") && this.cas5.getText().equals("0") && this.cas6.getText().equals("") &&
                    this.cas7.getText().equals("X") && this.cas8.getText().equals("") && this.cas9.getText().equals("")) {
                cas2.setText("X");
                cas1.setText("0");

            } else if (this.cas1.getText().equals("") && this.cas2.getText().equals("") && this.cas3.getText().equals("") &&
                    this.cas4.getText().equals("") && this.cas5.getText().equals("0") && this.cas6.getText().equals("") &&
                    this.cas7.getText().equals("") && this.cas8.getText().equals("") && this.cas9.getText().equals("X")) {
                cas2.setText("X");
                cas1.setText("0");

            }else if (this.cas1.getText().equals("") && this.cas2.getText().equals("") && this.cas3.getText().equals("0") &&
                    this.cas4.getText().equals("") && this.cas5.getText().equals("0") && this.cas6.getText().equals("X") &&
                    this.cas7.getText().equals("X") && this.cas8.getText().equals("0") && this.cas9.getText().equals("X")) {
                cas2.setText("X");
                cas1.setText("0");

            }else if (this.cas1.getText().equals("0") && this.cas2.getText().equals("") && this.cas3.getText().equals("X") &&
                    this.cas4.getText().equals("X") && this.cas5.getText().equals("X") && this.cas6.getText().equals("0") &&
                    this.cas7.getText().equals("0") && this.cas8.getText().equals("") && this.cas9.getText().equals("")) {
                cas2.setText("X");
                cas8.setText("0");

            }else if (this.cas1.getText().equals("") && this.cas2.getText().equals("") && this.cas3.getText().equals("X") &&
                    this.cas4.getText().equals("") && this.cas5.getText().equals("0") && this.cas6.getText().equals("X") &&
                    this.cas7.getText().equals("") && this.cas8.getText().equals("") && this.cas9.getText().equals("0")) {
                cas2.setText("X");
                cas1.setText("0");

            }else if (this.cas1.getText().equals("0") && this.cas2.getText().equals("") && this.cas3.getText().equals("0") &&
                    this.cas4.getText().equals("") && this.cas5.getText().equals("X") && this.cas6.getText().equals("") &&
                    this.cas7.getText().equals("") && this.cas8.getText().equals("") && this.cas9.getText().equals("X")) {
                cas2.setText("X");
                cas7.setText("0");

            }else if (this.cas1.getText().equals("0") && this.cas2.getText().equals("") && this.cas3.getText().equals("0") &&
                    this.cas4.getText().equals("") && this.cas5.getText().equals("") && this.cas6.getText().equals("X") &&
                    this.cas7.getText().equals("X") && this.cas8.getText().equals("") && this.cas9.getText().equals("")) {
                cas2.setText("X");
                cas5.setText("0");

            }else if (this.cas1.getText().equals("") && this.cas2.getText().equals("") && this.cas3.getText().equals("X") &&
                    this.cas4.getText().equals("0") && this.cas5.getText().equals("0") && this.cas6.getText().equals("") &&
                    this.cas7.getText().equals("") && this.cas8.getText().equals("X") && this.cas9.getText().equals("")) {
                cas2.setText("X");
                cas1.setText("0");

            }else if (this.cas1.getText().equals("0") && this.cas2.getText().equals("") && this.cas3.getText().equals("0") &&
                    this.cas4.getText().equals("") && this.cas5.getText().equals("") && this.cas6.getText().equals("X") &&
                    this.cas7.getText().equals("X") && this.cas8.getText().equals("X") && this.cas9.getText().equals("0")) {
                cas2.setText("X");
                cas5.setText("0");

            }else if (this.cas1.getText().equals("0") && this.cas2.getText().equals("") && this.cas3.getText().equals("0") &&
                    this.cas4.getText().equals("X") && this.cas5.getText().equals("") && this.cas6.getText().equals("") &&
                    this.cas7.getText().equals("") && this.cas8.getText().equals("X") && this.cas9.getText().equals("")) {
                cas2.setText("X");
                cas5.setText("0");

            }else if (this.cas1.getText().equals("") && this.cas2.getText().equals("") && this.cas3.getText().equals("X") &&
                    this.cas4.getText().equals("0") && this.cas5.getText().equals("0") && this.cas6.getText().equals("") &&
                    this.cas7.getText().equals("X") && this.cas8.getText().equals("X") && this.cas9.getText().equals("0")) {
                cas2.setText("X");
                cas1.setText("0");

            }
        }


    public void cas3(MouseEvent mouseEvent) {
            if (this.cas1.getText().equals("") && this.cas2.getText().equals("") && this.cas3.getText().equals("") &&
                    this.cas4.getText().equals("") && this.cas5.getText().equals("") && this.cas6.getText().equals("") &&
                    this.cas7.getText().equals("") && this.cas8.getText().equals("") && this.cas9.getText().equals("")) {
                cas3.setText("X");
                cas5.setText("0");

            } else if (this.cas1.getText().equals("X") && this.cas2.getText().equals("") && this.cas3.getText().equals("") &&
                    this.cas4.getText().equals("") && this.cas5.getText().equals("0") && this.cas6.getText().equals("") &&
                    this.cas7.getText().equals("") && this.cas8.getText().equals("") && this.cas9.getText().equals("")) {
                cas3.setText("X");
                cas2.setText("0");

            } else if (this.cas1.getText().equals("0") && this.cas2.getText().equals("X") && this.cas3.getText().equals("") &&
                    this.cas4.getText().equals("") && this.cas5.getText().equals("") && this.cas6.getText().equals("") &&
                    this.cas7.getText().equals("") && this.cas8.getText().equals("") && this.cas9.getText().equals("")) {
                cas3.setText("X");
                cas4.setText("0");

            } else if (this.cas1.getText().equals("0") && this.cas2.getText().equals("") && this.cas3.getText().equals("") &&
                    this.cas4.getText().equals("") && this.cas5.getText().equals("X") && this.cas6.getText().equals("") &&
                    this.cas7.getText().equals("") && this.cas8.getText().equals("") && this.cas9.getText().equals("")) {
                cas3.setText("X");
                cas7.setText("0");

            } else if (this.cas1.getText().equals("") && this.cas2.getText().equals("") && this.cas3.getText().equals("") &&
                    this.cas4.getText().equals("") && this.cas5.getText().equals("0") && this.cas6.getText().equals("") &&
                    this.cas7.getText().equals("X") && this.cas8.getText().equals("") && this.cas9.getText().equals("")) {
                cas3.setText("X");
                cas2.setText("0");

            } else if (this.cas1.getText().equals("") && this.cas2.getText().equals("0") && this.cas3.getText().equals("") &&
                    this.cas4.getText().equals("") && this.cas5.getText().equals("") && this.cas6.getText().equals("") &&
                    this.cas7.getText().equals("") && this.cas8.getText().equals("X") && this.cas9.getText().equals("")) {
                cas3.setText("X");
                cas7.setText("0");

            } else if (this.cas1.getText().equals("") && this.cas2.getText().equals("") && this.cas3.getText().equals("") &&
                    this.cas4.getText().equals("") && this.cas5.getText().equals("0") && this.cas6.getText().equals("") &&
                    this.cas7.getText().equals("") && this.cas8.getText().equals("") && this.cas9.getText().equals("X")) {
                cas3.setText("X");
                cas6.setText("0");

            }else if (this.cas1.getText().equals("0") && this.cas2.getText().equals("") && this.cas3.getText().equals("") &&
                    this.cas4.getText().equals("X") && this.cas5.getText().equals("X") && this.cas6.getText().equals("0") &&
                    this.cas7.getText().equals("") && this.cas8.getText().equals("") && this.cas9.getText().equals("")) {
                cas3.setText("X");
                cas7.setText("0");

            }else if (this.cas1.getText().equals("X") && this.cas2.getText().equals("0") && this.cas3.getText().equals("") &&
                    this.cas4.getText().equals("") && this.cas5.getText().equals("0") && this.cas6.getText().equals("") &&
                    this.cas7.getText().equals("0") && this.cas8.getText().equals("X") && this.cas9.getText().equals("X")) {
                cas3.setText("X");
                cas4.setText("0");

            }else if (this.cas1.getText().equals("0") && this.cas2.getText().equals("X") && this.cas3.getText().equals("") &&
                    this.cas4.getText().equals("") && this.cas5.getText().equals("0") && this.cas6.getText().equals("") &&
                    this.cas7.getText().equals("X") && this.cas8.getText().equals("") && this.cas9.getText().equals("")) {
                cas3.setText("X");
                cas9.setText("0");

            }else if (this.cas1.getText().equals("0") && this.cas2.getText().equals("X") && this.cas3.getText().equals("") &&
                    this.cas4.getText().equals("") && this.cas5.getText().equals("0") && this.cas6.getText().equals("") &&
                    this.cas7.getText().equals("") && this.cas8.getText().equals("X") && this.cas9.getText().equals("")) {
                cas3.setText("X");
                cas9.setText("0");

            }else if (this.cas1.getText().equals("0") && this.cas2.getText().equals("0") && this.cas3.getText().equals("") &&
                    this.cas4.getText().equals("") && this.cas5.getText().equals("X") && this.cas6.getText().equals("") &&
                    this.cas7.getText().equals("") && this.cas8.getText().equals("X") && this.cas9.getText().equals("")) {
                cas3.setText("X");
                cas7.setText("0");

            }
        }

    public void cas4(MouseEvent mouseEvent) {
            if (this.cas1.getText().equals("") && this.cas2.getText().equals("") && this.cas3.getText().equals("") &&
                    this.cas4.getText().equals("") && this.cas5.getText().equals("") && this.cas6.getText().equals("") &&
                    this.cas7.getText().equals("") && this.cas8.getText().equals("") && this.cas9.getText().equals("")) {
                cas4.setText("X");
                cas1.setText("0");

            } else if (this.cas1.getText().equals("X") && this.cas2.getText().equals("") && this.cas3.getText().equals("") &&
                    this.cas4.getText().equals("") && this.cas5.getText().equals("0") && this.cas6.getText().equals("") &&
                    this.cas7.getText().equals("") && this.cas8.getText().equals("") && this.cas9.getText().equals("")) {
                cas4.setText("X");
                cas7.setText("0");

            } else if (this.cas1.getText().equals("0") && this.cas2.getText().equals("X") && this.cas3.getText().equals("") &&
                    this.cas4.getText().equals("") && this.cas5.getText().equals("") && this.cas6.getText().equals("") &&
                    this.cas7.getText().equals("") && this.cas8.getText().equals("") && this.cas9.getText().equals("")) {
                cas4.setText("X");
                cas5.setText("0");

            } else if (this.cas1.getText().equals("") && this.cas2.getText().equals("") && this.cas3.getText().equals("X") &&
                    this.cas4.getText().equals("") && this.cas5.getText().equals("0") && this.cas6.getText().equals("") &&
                    this.cas7.getText().equals("") && this.cas8.getText().equals("") && this.cas9.getText().equals("")) {
                cas4.setText("X");
                cas1.setText("0");

            } else if (this.cas1.getText().equals("0") && this.cas2.getText().equals("") && this.cas3.getText().equals("") &&
                    this.cas4.getText().equals("") && this.cas5.getText().equals("X") && this.cas6.getText().equals("") &&
                    this.cas7.getText().equals("") && this.cas8.getText().equals("") && this.cas9.getText().equals("")) {
                cas4.setText("X");
                cas6.setText("0");

            } else if (this.cas1.getText().equals("") && this.cas2.getText().equals("") && this.cas3.getText().equals("0") &&
                    this.cas4.getText().equals("") && this.cas5.getText().equals("") && this.cas6.getText().equals("X") &&
                    this.cas7.getText().equals("") && this.cas8.getText().equals("") && this.cas9.getText().equals("")) {
                cas4.setText("X");
                cas5.setText("0");

            } else if (this.cas1.getText().equals("") && this.cas2.getText().equals("") && this.cas3.getText().equals("") &&
                    this.cas4.getText().equals("") && this.cas5.getText().equals("0") && this.cas6.getText().equals("") &&
                    this.cas7.getText().equals("X") && this.cas8.getText().equals("") && this.cas9.getText().equals("")) {
                cas4.setText("X");
                cas1.setText("0");

            } else if (this.cas1.getText().equals("") && this.cas2.getText().equals("0") && this.cas3.getText().equals("") &&
                    this.cas4.getText().equals("") && this.cas5.getText().equals("") && this.cas6.getText().equals("") &&
                    this.cas7.getText().equals("") && this.cas8.getText().equals("X") && this.cas9.getText().equals("")) {
                cas4.setText("X");
                cas7.setText("0");

            } else if (this.cas1.getText().equals("") && this.cas2.getText().equals("") && this.cas3.getText().equals("") &&
                    this.cas4.getText().equals("") && this.cas5.getText().equals("0") && this.cas6.getText().equals("") &&
                    this.cas7.getText().equals("") && this.cas8.getText().equals("") && this.cas9.getText().equals("X")) {
                cas4.setText("X");
                cas1.setText("0");

            }else if (this.cas1.getText().equals("0") && this.cas2.getText().equals("X") && this.cas3.getText().equals("X") &&
                    this.cas4.getText().equals("") && this.cas5.getText().equals("0") && this.cas6.getText().equals("") &&
                    this.cas7.getText().equals("") && this.cas8.getText().equals("") && this.cas9.getText().equals("")) {
                cas4.setText("X");
                cas9.setText("0");
                if (this.cas1.getText().equals("0") && this.cas5.getText().equals("0") && this.cas9.getText().equals("0")){
                    Perdidas.setText("1");
                }
            }else if (this.cas1.getText().equals("X") && this.cas2.getText().equals("0") && this.cas3.getText().equals("X") &&
                    this.cas4.getText().equals("") && this.cas5.getText().equals("0") && this.cas6.getText().equals("") &&
                    this.cas7.getText().equals("") && this.cas8.getText().equals("") && this.cas9.getText().equals("")) {
                cas4.setText("X");
                cas8.setText("0");

            }else if (this.cas1.getText().equals("") && this.cas2.getText().equals("") && this.cas3.getText().equals("X") &&
                    this.cas4.getText().equals("") && this.cas5.getText().equals("0") && this.cas6.getText().equals("X") &&
                    this.cas7.getText().equals("") && this.cas8.getText().equals("") && this.cas9.getText().equals("0")) {
                cas4.setText("X");
                cas1.setText("0");

            }else if (this.cas1.getText().equals("X") && this.cas2.getText().equals("0") && this.cas3.getText().equals("") &&
                    this.cas4.getText().equals("") && this.cas5.getText().equals("0") && this.cas6.getText().equals("") &&
                    this.cas7.getText().equals("0") && this.cas8.getText().equals("X") && this.cas9.getText().equals("X")) {
                cas4.setText("X");
                cas3.setText("0");

            }else if (this.cas1.getText().equals("0") && this.cas2.getText().equals("X") && this.cas3.getText().equals("") &&
                    this.cas4.getText().equals("") && this.cas5.getText().equals("0") && this.cas6.getText().equals("") &&
                    this.cas7.getText().equals("X") && this.cas8.getText().equals("") && this.cas9.getText().equals("")) {
                cas5.setText("X");
                cas9.setText("0");

            }else if (this.cas1.getText().equals("0") && this.cas2.getText().equals("") && this.cas3.getText().equals("0") &&
                    this.cas4.getText().equals("") && this.cas5.getText().equals("X") && this.cas6.getText().equals("") &&
                    this.cas7.getText().equals("") && this.cas8.getText().equals("") && this.cas9.getText().equals("X")) {
                cas4.setText("X");
                cas2.setText("0");

            }else if (this.cas1.getText().equals("") && this.cas2.getText().equals("0") && this.cas3.getText().equals("X") &&
                    this.cas4.getText().equals("") && this.cas5.getText().equals("0") && this.cas6.getText().equals("") &&
                    this.cas7.getText().equals("X") && this.cas8.getText().equals("") && this.cas9.getText().equals("")) {
                cas4.setText("X");
                cas1.setText("0");

            }else if (this.cas1.getText().equals("0") && this.cas2.getText().equals("X") && this.cas3.getText().equals("") &&
                    this.cas4.getText().equals("") && this.cas5.getText().equals("0") && this.cas6.getText().equals("") &&
                    this.cas7.getText().equals("") && this.cas8.getText().equals("X") && this.cas9.getText().equals("")) {
                cas4.setText("X");
                cas9.setText("0");

            }else if (this.cas1.getText().equals("0") && this.cas2.getText().equals("") && this.cas3.getText().equals("0") &&
                    this.cas4.getText().equals("") && this.cas5.getText().equals("") && this.cas6.getText().equals("X") &&
                    this.cas7.getText().equals("X") && this.cas8.getText().equals("") && this.cas9.getText().equals("")) {
                cas4.setText("X");
                cas5.setText("0");

            }else if (this.cas1.getText().equals("0") && this.cas2.getText().equals("") && this.cas3.getText().equals("0") &&
                    this.cas4.getText().equals("") && this.cas5.getText().equals("") && this.cas6.getText().equals("X") &&
                    this.cas7.getText().equals("X") && this.cas8.getText().equals("X") && this.cas9.getText().equals("0")) {
                cas4.setText("X");
                cas5.setText("0");

            }else if (this.cas1.getText().equals("0") && this.cas2.getText().equals("0") && this.cas3.getText().equals("") &&
                    this.cas4.getText().equals("") && this.cas5.getText().equals("X") && this.cas6.getText().equals("") &&
                    this.cas7.getText().equals("") && this.cas8.getText().equals("X") && this.cas9.getText().equals("")) {
                cas4.setText("X");
                cas6.setText("0");

            }
    }

    public void cas5(MouseEvent mouseEvent) {
            if (this.cas1.getText().equals("") && this.cas2.getText().equals("") && this.cas3.getText().equals("") &&
                    this.cas4.getText().equals("") && this.cas5.getText().equals("") && this.cas6.getText().equals("") &&
                    this.cas7.getText().equals("") && this.cas8.getText().equals("") && this.cas9.getText().equals("")) {
                cas5.setText("X");
                cas1.setText("0");

            } else if (this.cas1.getText().equals("0") && this.cas2.getText().equals("X") && this.cas3.getText().equals("") &&
                    this.cas4.getText().equals("") && this.cas5.getText().equals("") && this.cas6.getText().equals("") &&
                    this.cas7.getText().equals("") && this.cas8.getText().equals("") && this.cas9.getText().equals("")) {
                cas5.setText("X");
                cas8.setText("0");

            } else if (this.cas1.getText().equals("0") && this.cas2.getText().equals("") && this.cas3.getText().equals("") &&
                    this.cas4.getText().equals("X") && this.cas5.getText().equals("") && this.cas6.getText().equals("") &&
                    this.cas7.getText().equals("") && this.cas8.getText().equals("") && this.cas9.getText().equals("")) {
                cas5.setText("X");
                cas6.setText("0");

            } else if (this.cas1.getText().equals("") && this.cas2.getText().equals("") && this.cas3.getText().equals("0") &&
                    this.cas4.getText().equals("") && this.cas5.getText().equals("") && this.cas6.getText().equals("X") &&
                    this.cas7.getText().equals("") && this.cas8.getText().equals("") && this.cas9.getText().equals("")) {
                cas5.setText("X");
                cas4.setText("0");

            } else if (this.cas1.getText().equals("") && this.cas2.getText().equals("0") && this.cas3.getText().equals("") &&
                    this.cas4.getText().equals("") && this.cas5.getText().equals("") && this.cas6.getText().equals("") &&
                    this.cas7.getText().equals("") && this.cas8.getText().equals("X") && this.cas9.getText().equals("")) {
                cas5.setText("X");
                cas1.setText("0");

            }else if (this.cas1.getText().equals("0") && this.cas2.getText().equals("") && this.cas3.getText().equals("0") &&
                    this.cas4.getText().equals("") && this.cas5.getText().equals("") && this.cas6.getText().equals("X") &&
                    this.cas7.getText().equals("X") && this.cas8.getText().equals("") && this.cas9.getText().equals("")) {
                cas5.setText("X");
                cas4.setText("0");

            }else if (this.cas1.getText().equals("0") && this.cas2.getText().equals("") && this.cas3.getText().equals("0") &&
                    this.cas4.getText().equals("") && this.cas5.getText().equals("") && this.cas6.getText().equals("X") &&
                    this.cas7.getText().equals("X") && this.cas8.getText().equals("X") && this.cas9.getText().equals("0")) {
                cas5.setText("X");
                cas2.setText("0");

            }else if (this.cas1.getText().equals("0") && this.cas2.getText().equals("0") && this.cas3.getText().equals("") &&
                    this.cas4.getText().equals("") && this.cas5.getText().equals("X") && this.cas6.getText().equals("") &&
                    this.cas7.getText().equals("") && this.cas8.getText().equals("X") && this.cas9.getText().equals("")) {
                cas5.setText("X");
                cas6.setText("0");

            }
    }

    public void cas6(MouseEvent mouseEvent) {
            if (this.cas1.getText().equals("") && this.cas2.getText().equals("") && this.cas3.getText().equals("") &&
                    this.cas4.getText().equals("") && this.cas5.getText().equals("") && this.cas6.getText().equals("") &&
                    this.cas7.getText().equals("") && this.cas8.getText().equals("") && this.cas9.getText().equals("")) {
                cas6.setText("X");
                cas3.setText("0");
            } else if (this.cas1.getText().equals("X") && this.cas2.getText().equals("") && this.cas3.getText().equals("") &&
                    this.cas4.getText().equals("") && this.cas5.getText().equals("0") && this.cas6.getText().equals("") &&
                    this.cas7.getText().equals("") && this.cas8.getText().equals("") && this.cas9.getText().equals("")) {
                cas6.setText("X");
                cas2.setText("0");

            } else if (this.cas1.getText().equals("0") && this.cas2.getText().equals("X") && this.cas3.getText().equals("") &&
                    this.cas4.getText().equals("") && this.cas5.getText().equals("") && this.cas6.getText().equals("") &&
                    this.cas7.getText().equals("") && this.cas8.getText().equals("") && this.cas9.getText().equals("")) {
                cas6.setText("X");
                cas7.setText("0");

            } else if (this.cas1.getText().equals("") && this.cas2.getText().equals("") && this.cas3.getText().equals("X") &&
                    this.cas4.getText().equals("") && this.cas5.getText().equals("0") && this.cas6.getText().equals("") &&
                    this.cas7.getText().equals("") && this.cas8.getText().equals("") && this.cas9.getText().equals("")) {
                cas6.setText("X");
                cas9.setText("0");

            } else if (this.cas1.getText().equals("0") && this.cas2.getText().equals("") && this.cas3.getText().equals("") &&
                    this.cas4.getText().equals("X") && this.cas5.getText().equals("") && this.cas6.getText().equals("") &&
                    this.cas7.getText().equals("") && this.cas8.getText().equals("") && this.cas9.getText().equals("")) {
                cas6.setText("X");
                cas5.setText("0");

            } else if (this.cas1.getText().equals("0") && this.cas2.getText().equals("") && this.cas3.getText().equals("") &&
                    this.cas4.getText().equals("4") && this.cas5.getText().equals("X") && this.cas6.getText().equals("") &&
                    this.cas7.getText().equals("") && this.cas8.getText().equals("") && this.cas9.getText().equals("")) {
                cas6.setText("X");
                cas5.setText("0");

            } else if (this.cas1.getText().equals("") && this.cas2.getText().equals("") && this.cas3.getText().equals("") &&
                    this.cas4.getText().equals("") && this.cas5.getText().equals("0") && this.cas6.getText().equals("") &&
                    this.cas7.getText().equals("X") && this.cas8.getText().equals("") && this.cas9.getText().equals("")) {
                cas6.setText("X");
                cas2.setText("0");

            } else if (this.cas1.getText().equals("") && this.cas2.getText().equals("0") && this.cas3.getText().equals("") &&
                    this.cas4.getText().equals("") && this.cas5.getText().equals("") && this.cas6.getText().equals("") &&
                    this.cas7.getText().equals("") && this.cas8.getText().equals("X") && this.cas9.getText().equals("")) {
                cas6.setText("X");
                cas7.setText("0");

            } else if (this.cas1.getText().equals("") && this.cas2.getText().equals("") && this.cas3.getText().equals("") &&
                    this.cas4.getText().equals("") && this.cas5.getText().equals("0") && this.cas6.getText().equals("") &&
                    this.cas7.getText().equals("") && this.cas8.getText().equals("") && this.cas9.getText().equals("X")) {
                cas6.setText("X");
                cas3.setText("0");

            } else if ((this.cas1.getText().equals("X") || this.cas1.getText().equals("0")) &&
                    (this.cas2.getText().equals("X") || this.cas2.getText().equals("0")) && this.cas4.getText().equals("") &&
                    (this.cas5.getText().equals("X") || this.cas5.getText().equals("0")) && (this.cas7.getText().equals("X") ||
                    this.cas7.getText().equals("0")) && (this.cas8.getText().equals("X") || this.cas8.getText().equals("0")) &&
                    (this.cas9.getText().equals("X") || this.cas9.getText().equals("0"))) {
                cas6.setText("X");
                cas3.setText("0");
            }else if (this.cas1.getText().equals("X") && this.cas2.getText().equals("X") && this.cas3.getText().equals("0") &&
                    this.cas4.getText().equals("0") && this.cas5.getText().equals("0") && this.cas6.getText().equals("") &&
                    this.cas7.getText().equals("X") && this.cas8.getText().equals("") && this.cas9.getText().equals("")) {
                cas6.setText("X");
                cas8.setText("0");

            }else if (this.cas1.getText().equals("X") && this.cas2.getText().equals("0") && this.cas3.getText().equals("") &&
                    this.cas4.getText().equals("") && this.cas5.getText().equals("0") && this.cas6.getText().equals("") &&
                    this.cas7.getText().equals("0") && this.cas8.getText().equals("X") && this.cas9.getText().equals("X")) {
                cas6.setText("X");
                cas3.setText("0");

            }else if (this.cas1.getText().equals("0") && this.cas2.getText().equals("X") && this.cas3.getText().equals("") &&
                    this.cas4.getText().equals("") && this.cas5.getText().equals("0") && this.cas6.getText().equals("") &&
                    this.cas7.getText().equals("X") && this.cas8.getText().equals("") && this.cas9.getText().equals("")) {
                cas6.setText("X");
                cas9.setText("0");

            }else if (this.cas1.getText().equals("0") && this.cas2.getText().equals("") && this.cas3.getText().equals("0") &&
                    this.cas4.getText().equals("") && this.cas5.getText().equals("X") && this.cas6.getText().equals("") &&
                    this.cas7.getText().equals("") && this.cas8.getText().equals("") && this.cas9.getText().equals("X")) {
                cas6.setText("X");
                cas6.setText("0");

            }else if (this.cas1.getText().equals("") && this.cas2.getText().equals("0") && this.cas3.getText().equals("X") &&
                    this.cas4.getText().equals("") && this.cas5.getText().equals("0") && this.cas6.getText().equals("") &&
                    this.cas7.getText().equals("X") && this.cas8.getText().equals("") && this.cas9.getText().equals("")) {
                cas6.setText("X");
                cas9.setText("0");

            }else if (this.cas1.getText().equals("0") && this.cas2.getText().equals("X") && this.cas3.getText().equals("") &&
                    this.cas4.getText().equals("") && this.cas5.getText().equals("0") && this.cas6.getText().equals("") &&
                    this.cas7.getText().equals("") && this.cas8.getText().equals("X") && this.cas9.getText().equals("")) {
                cas6.setText("X");
                cas9.setText("0");

            }else if (this.cas1.getText().equals("") && this.cas2.getText().equals("") && this.cas3.getText().equals("X") &&
                    this.cas4.getText().equals("0") && this.cas5.getText().equals("0") && this.cas6.getText().equals("") &&
                    this.cas7.getText().equals("") && this.cas8.getText().equals("X") && this.cas9.getText().equals("")) {
                cas6.setText("X");
                cas7.setText("0");

            }else if (this.cas1.getText().equals("0") && this.cas2.getText().equals("0") && this.cas3.getText().equals("") &&
                    this.cas4.getText().equals("") && this.cas5.getText().equals("X") && this.cas6.getText().equals("") &&
                    this.cas7.getText().equals("") && this.cas8.getText().equals("X") && this.cas9.getText().equals("")) {
                cas6.setText("X");
                cas4.setText("0");

            }else if (this.cas1.getText().equals("0") && this.cas2.getText().equals("0") && this.cas3.getText().equals("") &&
                    this.cas4.getText().equals("") && this.cas5.getText().equals("X") && this.cas6.getText().equals("") &&
                    this.cas7.getText().equals("") && this.cas8.getText().equals("X") && this.cas9.getText().equals("")) {
                cas6.setText("X");
                cas5.setText("0");

            }else if (this.cas1.getText().equals("") && this.cas2.getText().equals("") && this.cas3.getText().equals("X") &&
                    this.cas4.getText().equals("0") && this.cas5.getText().equals("0") && this.cas6.getText().equals("") &&
                    this.cas7.getText().equals("X") && this.cas8.getText().equals("X") && this.cas9.getText().equals("0")) {
                cas6.setText("X");
                cas1.setText("0");

            }
    }


    public void cas7(MouseEvent mouseEvent) {
            if (this.cas1.getText().equals("") && this.cas2.getText().equals("") && this.cas3.getText().equals("") &&
                    this.cas4.getText().equals("") && this.cas5.getText().equals("") && this.cas6.getText().equals("") &&
                    this.cas7.getText().equals("") && this.cas8.getText().equals("") && this.cas9.getText().equals("")) {
                cas7.setText("X");
                cas5.setText("0");
            } else if (this.cas1.getText().equals("X") && this.cas2.getText().equals("") && this.cas3.getText().equals("") &&
                    this.cas4.getText().equals("") && this.cas5.getText().equals("0") && this.cas6.getText().equals("") &&
                    this.cas7.getText().equals("") && this.cas8.getText().equals("") && this.cas9.getText().equals("")) {
                cas7.setText("X");
                cas4.setText("0");

            } else if (this.cas1.getText().equals("0") && this.cas2.getText().equals("X") && this.cas3.getText().equals("") &&
                    this.cas4.getText().equals("") && this.cas5.getText().equals("") && this.cas6.getText().equals("") &&
                    this.cas7.getText().equals("") && this.cas8.getText().equals("") && this.cas9.getText().equals("")) {
                cas7.setText("X");
                cas5.setText("0");

            } else if (this.cas1.getText().equals("") && this.cas2.getText().equals("") && this.cas3.getText().equals("X") &&
                    this.cas4.getText().equals("") && this.cas5.getText().equals("0") && this.cas6.getText().equals("") &&
                    this.cas7.getText().equals("") && this.cas8.getText().equals("") && this.cas9.getText().equals("")) {
                cas7.setText("X");
                cas2.setText("0");

            } else if (this.cas1.getText().equals("0") && this.cas2.getText().equals("") && this.cas3.getText().equals("") &&
                    this.cas4.getText().equals("X") && this.cas5.getText().equals("") && this.cas6.getText().equals("") &&
                    this.cas7.getText().equals("") && this.cas8.getText().equals("") && this.cas9.getText().equals("")) {
                cas7.setText("X");
                cas2.setText("0");

            } else if (this.cas1.getText().equals("0") && this.cas2.getText().equals("") && this.cas3.getText().equals("") &&
                    this.cas4.getText().equals("") && this.cas5.getText().equals("X") && this.cas6.getText().equals("") &&
                    this.cas7.getText().equals("") && this.cas8.getText().equals("") && this.cas9.getText().equals("")) {
                cas7.setText("X");
                cas3.setText("0");

            } else if (this.cas1.getText().equals("") && this.cas2.getText().equals("") && this.cas3.getText().equals("0") &&
                    this.cas4.getText().equals("") && this.cas5.getText().equals("") && this.cas6.getText().equals("X") &&
                    this.cas7.getText().equals("") && this.cas8.getText().equals("") && this.cas9.getText().equals("")) {
                cas7.setText("X");
                cas1.setText("0");

            } else if (this.cas1.getText().equals("") && this.cas2.getText().equals("0") && this.cas3.getText().equals("") &&
                    this.cas4.getText().equals("") && this.cas5.getText().equals("") && this.cas6.getText().equals("") &&
                    this.cas7.getText().equals("") && this.cas8.getText().equals("X") && this.cas9.getText().equals("")) {
                cas7.setText("X");
                cas9.setText("0");

            } else if (this.cas1.getText().equals("") && this.cas2.getText().equals("") && this.cas3.getText().equals("") &&
                    this.cas4.getText().equals("") && this.cas5.getText().equals("0") && this.cas6.getText().equals("") &&
                    this.cas7.getText().equals("") && this.cas8.getText().equals("") && this.cas9.getText().equals("X")) {
                cas7.setText("X");
                cas8.setText("0");

            }else if (this.cas1.getText().equals("X") && this.cas2.getText().equals("X") && this.cas3.getText().equals("0") &&
                    this.cas4.getText().equals("") && this.cas5.getText().equals("0") && this.cas6.getText().equals("") &&
                    this.cas7.getText().equals("") && this.cas8.getText().equals("") && this.cas9.getText().equals("")) {
                cas7.setText("X");
                cas4.setText("0");

            }else if (this.cas1.getText().equals("") && this.cas2.getText().equals("") && this.cas3.getText().equals("0") &&
                    this.cas4.getText().equals("") && this.cas5.getText().equals("0") && this.cas6.getText().equals("X") &&
                    this.cas7.getText().equals("") && this.cas8.getText().equals("") && this.cas9.getText().equals("X")) {
                cas7.setText("X");
                cas8.setText("0");

            }else if (this.cas1.getText().equals("0") && this.cas2.getText().equals("") && this.cas3.getText().equals("") &&
                    this.cas4.getText().equals("X") && this.cas5.getText().equals("X") && this.cas6.getText().equals("0") &&
                    this.cas7.getText().equals("") && this.cas8.getText().equals("") && this.cas9.getText().equals("")) {
                cas7.setText("X");
                cas3.setText("0");

            }else if (this.cas1.getText().equals("") && this.cas2.getText().equals("") && this.cas3.getText().equals("X") &&
                    this.cas4.getText().equals("") && this.cas5.getText().equals("0") && this.cas6.getText().equals("X") &&
                    this.cas7.getText().equals("") && this.cas8.getText().equals("") && this.cas9.getText().equals("0")) {
                cas7.setText("X");
                cas1.setText("0");

            }else if (this.cas1.getText().equals("0") && this.cas2.getText().equals("X") && this.cas3.getText().equals("") &&
                    this.cas4.getText().equals("") && this.cas5.getText().equals("0") && this.cas6.getText().equals("") &&
                    this.cas7.getText().equals("X") && this.cas8.getText().equals("") && this.cas9.getText().equals("")) {
                cas7.setText("X");
                cas9.setText("0");

            }else if (this.cas1.getText().equals("0") && this.cas2.getText().equals("") && this.cas3.getText().equals("0") &&
                    this.cas4.getText().equals("") && this.cas5.getText().equals("X") && this.cas6.getText().equals("") &&
                    this.cas7.getText().equals("") && this.cas8.getText().equals("") && this.cas9.getText().equals("X")) {
                cas7.setText("X");
                cas2.setText("0");

            }else if (this.cas1.getText().equals("0") && this.cas2.getText().equals("X") && this.cas3.getText().equals("") &&
                    this.cas4.getText().equals("") && this.cas5.getText().equals("0") && this.cas6.getText().equals("") &&
                    this.cas7.getText().equals("") && this.cas8.getText().equals("X") && this.cas9.getText().equals("")) {
                cas7.setText("X");
                cas9.setText("0");

            }else if (this.cas1.getText().equals("") && this.cas2.getText().equals("") && this.cas3.getText().equals("X") &&
                    this.cas4.getText().equals("0") && this.cas5.getText().equals("0") && this.cas6.getText().equals("") &&
                    this.cas7.getText().equals("") && this.cas8.getText().equals("X") && this.cas9.getText().equals("")) {
                cas7.setText("X");
                cas9.setText("0");

            }else if (this.cas1.getText().equals("0") && this.cas2.getText().equals("0") && this.cas3.getText().equals("") &&
                    this.cas4.getText().equals("") && this.cas5.getText().equals("X") && this.cas6.getText().equals("") &&
                    this.cas7.getText().equals("") && this.cas8.getText().equals("X") && this.cas9.getText().equals("")) {
                cas7.setText("X");
                cas3.setText("0");

            }else if (this.cas1.getText().equals("0") && this.cas2.getText().equals("0") && this.cas3.getText().equals("") &&
                    this.cas4.getText().equals("") && this.cas5.getText().equals("X") && this.cas6.getText().equals("") &&
                    this.cas7.getText().equals("") && this.cas8.getText().equals("X") && this.cas9.getText().equals("")) {
                cas7.setText("X");
                cas2.setText("0");

            }
    }


    public void cas8(MouseEvent mouseEvent) {
            if (this.cas1.getText().equals("") && this.cas2.getText().equals("") && this.cas3.getText().equals("") &&
                    this.cas4.getText().equals("") && this.cas5.getText().equals("") && this.cas6.getText().equals("") &&
                    this.cas7.getText().equals("") && this.cas8.getText().equals("") && this.cas9.getText().equals("")) {
                cas8.setText("X");
                cas2.setText("0");
            } else if (this.cas1.getText().equals("X") && this.cas2.getText().equals("") && this.cas3.getText().equals("") &&
                    this.cas4.getText().equals("") && this.cas5.getText().equals("0") && this.cas6.getText().equals("") &&
                    this.cas7.getText().equals("") && this.cas8.getText().equals("") && this.cas9.getText().equals("")) {
                cas8.setText("X");
                cas4.setText("0");

            } else if (this.cas1.getText().equals("0") && this.cas2.getText().equals("X") && this.cas3.getText().equals("") &&
                    this.cas4.getText().equals("") && this.cas5.getText().equals("") && this.cas6.getText().equals("") &&
                    this.cas7.getText().equals("") && this.cas8.getText().equals("") && this.cas9.getText().equals("")) {
                cas8.setText("X");
                cas5.setText("0");

            } else if (this.cas1.getText().equals("") && this.cas2.getText().equals("") && this.cas3.getText().equals("X") &&
                    this.cas4.getText().equals("") && this.cas5.getText().equals("0") && this.cas6.getText().equals("") &&
                    this.cas7.getText().equals("") && this.cas8.getText().equals("") && this.cas9.getText().equals("")) {
                cas8.setText("X");
                cas4.setText("0");

            } else if (this.cas1.getText().equals("0") && this.cas2.getText().equals("") && this.cas3.getText().equals("") &&
                    this.cas4.getText().equals("X") && this.cas5.getText().equals("") && this.cas6.getText().equals("") &&
                    this.cas7.getText().equals("") && this.cas8.getText().equals("") && this.cas9.getText().equals("")) {
                cas8.setText("X");
                cas3.setText("0");

            } else if (this.cas1.getText().equals("0") && this.cas2.getText().equals("") && this.cas3.getText().equals("") &&
                    this.cas4.getText().equals("") && this.cas5.getText().equals("X") && this.cas6.getText().equals("") &&
                    this.cas7.getText().equals("") && this.cas8.getText().equals("") && this.cas9.getText().equals("")) {
                cas8.setText("X");
                cas2.setText("0");

            } else if (this.cas1.getText().equals("") && this.cas2.getText().equals("") && this.cas3.getText().equals("0") &&
                    this.cas4.getText().equals("") && this.cas5.getText().equals("") && this.cas6.getText().equals("X") &&
                    this.cas7.getText().equals("") && this.cas8.getText().equals("") && this.cas9.getText().equals("")) {
                cas8.setText("X");
                cas1.setText("0");

            } else if (this.cas1.getText().equals("") && this.cas2.getText().equals("") && this.cas3.getText().equals("") &&
                    this.cas4.getText().equals("") && this.cas5.getText().equals("0") && this.cas6.getText().equals("") &&
                    this.cas7.getText().equals("X") && this.cas8.getText().equals("") && this.cas9.getText().equals("")) {
                cas8.setText("X");
                cas9.setText("0");

            } else if (this.cas1.getText().equals("") && this.cas2.getText().equals("") && this.cas3.getText().equals("") &&
                    this.cas4.getText().equals("") && this.cas5.getText().equals("0") && this.cas6.getText().equals("") &&
                    this.cas7.getText().equals("") && this.cas8.getText().equals("") && this.cas9.getText().equals("X")) {
                cas8.setText("X");
                cas7.setText("0");

            } else if (this.cas1.getText().equals("X") && this.cas5.getText().equals("0") && this.cas9.getText().equals("X") &&
                    this.cas2.getText().equals("0") && this.cas8.getText().equals("") && this.cas7.getText().equals("")) {
                cas8.setText("X");
                cas7.setText("0");

            }else if (this.cas1.getText().equals("0") && this.cas2.getText().equals("") && this.cas3.getText().equals("X") &&
                    this.cas4.getText().equals("X") && this.cas5.getText().equals("X") && this.cas6.getText().equals("0") &&
                    this.cas7.getText().equals("0") && this.cas8.getText().equals("") && this.cas9.getText().equals("")) {
                cas8.setText("X");
                cas2.setText("0");

            }else if (this.cas1.getText().equals("") && this.cas2.getText().equals("0") && this.cas3.getText().equals("X") &&
                    this.cas4.getText().equals("") && this.cas5.getText().equals("0") && this.cas6.getText().equals("") &&
                    this.cas7.getText().equals("0") && this.cas8.getText().equals("") && this.cas9.getText().equals("")) {
                cas8.setText("X");
                cas1.setText("0");

            }else if (this.cas1.getText().equals("") && this.cas2.getText().equals("") && this.cas3.getText().equals("X") &&
                    this.cas4.getText().equals("") && this.cas5.getText().equals("0") && this.cas6.getText().equals("X") &&
                    this.cas7.getText().equals("") && this.cas8.getText().equals("") && this.cas9.getText().equals("0")) {
                cas8.setText("X");
                cas1.setText("0");

            }else if (this.cas1.getText().equals("0") && this.cas2.getText().equals("") && this.cas3.getText().equals("0") &&
                    this.cas4.getText().equals("") && this.cas5.getText().equals("X") && this.cas6.getText().equals("") &&
                    this.cas7.getText().equals("") && this.cas8.getText().equals("") && this.cas9.getText().equals("X")) {
                cas8.setText("X");
                cas2.setText("0");

            }else if (this.cas1.getText().equals("") && this.cas2.getText().equals("0") && this.cas3.getText().equals("X") &&
                    this.cas4.getText().equals("") && this.cas5.getText().equals("0") && this.cas6.getText().equals("") &&
                    this.cas7.getText().equals("X") && this.cas8.getText().equals("") && this.cas9.getText().equals("")) {
                cas8.setText("X");
                cas1.setText("0");

            }else if (this.cas1.getText().equals("0") && this.cas2.getText().equals("") && this.cas3.getText().equals("0") &&
                    this.cas4.getText().equals("") && this.cas5.getText().equals("") && this.cas6.getText().equals("X") &&
                    this.cas7.getText().equals("X") && this.cas8.getText().equals("") && this.cas9.getText().equals("")) {
                cas8.setText("X");
                cas9.setText("0");

            }
    }


    public void cas9(MouseEvent mouseEvent) {
            if (this.cas1.getText().equals("") && this.cas2.getText().equals("") && this.cas3.getText().equals("") &&
                    this.cas4.getText().equals("") && this.cas5.getText().equals("") && this.cas6.getText().equals("") &&
                    this.cas7.getText().equals("") && this.cas8.getText().equals("") && this.cas9.getText().equals("")) {
                cas9.setText("X");
                cas5.setText("0");
            } else if (this.cas1.getText().equals("X") && this.cas2.getText().equals("") && this.cas3.getText().equals("") &&
                    this.cas4.getText().equals("") && this.cas5.getText().equals("0") && this.cas6.getText().equals("") &&
                    this.cas7.getText().equals("") && this.cas8.getText().equals("") && this.cas9.getText().equals("")) {
                cas9.setText("X");
                cas2.setText("0");

            } else if (this.cas1.getText().equals("0") && this.cas2.getText().equals("X") && this.cas3.getText().equals("") &&
                    this.cas4.getText().equals("") && this.cas5.getText().equals("") && this.cas6.getText().equals("") &&
                    this.cas7.getText().equals("") && this.cas8.getText().equals("") && this.cas9.getText().equals("")) {
                cas9.setText("X");
                cas5.setText("0");

            } else if (this.cas1.getText().equals("") && this.cas2.getText().equals("") && this.cas3.getText().equals("X") &&
                    this.cas4.getText().equals("") && this.cas5.getText().equals("0") && this.cas6.getText().equals("") &&
                    this.cas7.getText().equals("") && this.cas8.getText().equals("") && this.cas9.getText().equals("")) {
                cas9.setText("X");
                cas6.setText("0");

            } else if (this.cas1.getText().equals("0") && this.cas2.getText().equals("") && this.cas3.getText().equals("") &&
                    this.cas4.getText().equals("X") && this.cas5.getText().equals("") && this.cas6.getText().equals("") &&
                    this.cas7.getText().equals("") && this.cas8.getText().equals("") && this.cas9.getText().equals("")) {
                cas9.setText("X");
                cas3.setText("0");

            } else if (this.cas1.getText().equals("0") && this.cas2.getText().equals("") && this.cas3.getText().equals("") &&
                    this.cas4.getText().equals("") && this.cas5.getText().equals("X") && this.cas6.getText().equals("") &&
                    this.cas7.getText().equals("") && this.cas8.getText().equals("") && this.cas9.getText().equals("")) {
                cas9.setText("X");
                cas3.setText("0");

            } else if (this.cas1.getText().equals("") && this.cas2.getText().equals("") && this.cas3.getText().equals("0") &&
                    this.cas4.getText().equals("") && this.cas5.getText().equals("") && this.cas6.getText().equals("X") &&
                    this.cas7.getText().equals("") && this.cas8.getText().equals("") && this.cas9.getText().equals("")) {
                cas9.setText("X");
                cas1.setText("0");

            } else if (this.cas1.getText().equals("") && this.cas2.getText().equals("") && this.cas3.getText().equals("") &&
                    this.cas4.getText().equals("") && this.cas5.getText().equals("0") && this.cas6.getText().equals("") &&
                    this.cas7.getText().equals("X") && this.cas8.getText().equals("") && this.cas9.getText().equals("")) {
                cas9.setText("X");
                cas8.setText("0");

            } else if (this.cas1.getText().equals("") && this.cas2.getText().equals("0") && this.cas3.getText().equals("") &&
                    this.cas4.getText().equals("") && this.cas5.getText().equals("") && this.cas6.getText().equals("") &&
                    this.cas7.getText().equals("") && this.cas8.getText().equals("X") && this.cas9.getText().equals("")) {
                cas9.setText("X");
                cas7.setText("0");

            }else if (this.cas1.getText().equals("0") && this.cas2.getText().equals("") && this.cas3.getText().equals("X") &&
                    this.cas4.getText().equals("X") && this.cas5.getText().equals("X") && this.cas6.getText().equals("0") &&
                    this.cas7.getText().equals("0") && this.cas8.getText().equals("") && this.cas9.getText().equals("")) {
                cas9.setText("X");
                cas2.setText("0");

            }else if (this.cas1.getText().equals("0") && this.cas2.getText().equals("X") && this.cas3.getText().equals("") &&
                    this.cas4.getText().equals("") && this.cas5.getText().equals("0") && this.cas6.getText().equals("") &&
                    this.cas7.getText().equals("X") && this.cas8.getText().equals("") && this.cas9.getText().equals("")) {
                cas9.setText("X");
                cas7.setText("0");

            }else if (this.cas1.getText().equals("") && this.cas2.getText().equals("0") && this.cas3.getText().equals("X") &&
                    this.cas4.getText().equals("") && this.cas5.getText().equals("0") && this.cas6.getText().equals("") &&
                    this.cas7.getText().equals("X") && this.cas8.getText().equals("") && this.cas9.getText().equals("")) {
                cas9.setText("X");
                cas8.setText("0");

            }else if (this.cas1.getText().equals("0") && this.cas2.getText().equals("X") && this.cas3.getText().equals("") &&
                    this.cas4.getText().equals("") && this.cas5.getText().equals("0") && this.cas6.getText().equals("") &&
                    this.cas7.getText().equals("") && this.cas8.getText().equals("X") && this.cas9.getText().equals("")) {
                cas9.setText("X");
                cas7.setText("0");

            }else if (this.cas1.getText().equals("0") && this.cas2.getText().equals("") && this.cas3.getText().equals("0") &&
                    this.cas4.getText().equals("") && this.cas5.getText().equals("") && this.cas6.getText().equals("X") &&
                    this.cas7.getText().equals("X") && this.cas8.getText().equals("") && this.cas9.getText().equals("")) {
                cas9.setText("X");
                cas8.setText("0");

            }else if (this.cas1.getText().equals("") && this.cas2.getText().equals("") && this.cas3.getText().equals("X") &&
                    this.cas4.getText().equals("0") && this.cas5.getText().equals("0") && this.cas6.getText().equals("") &&
                    this.cas7.getText().equals("") && this.cas8.getText().equals("X") && this.cas9.getText().equals("")) {
                cas9.setText("X");
                cas7.setText("0");

            }else if (this.cas1.getText().equals("0") && this.cas2.getText().equals("0") && this.cas3.getText().equals("") &&
                    this.cas4.getText().equals("") && this.cas5.getText().equals("X") && this.cas6.getText().equals("") &&
                    this.cas7.getText().equals("") && this.cas8.getText().equals("X") && this.cas9.getText().equals("")) {
                cas9.setText("X");
                cas3.setText("0");

            }else if (this.cas1.getText().equals("0") && this.cas2.getText().equals("0") && this.cas3.getText().equals("") &&
                    this.cas4.getText().equals("") && this.cas5.getText().equals("X") && this.cas6.getText().equals("") &&
                    this.cas7.getText().equals("") && this.cas8.getText().equals("X") && this.cas9.getText().equals("")) {
                cas9.setText("X");
                cas2.setText("0");

            }
    }

    public void Nueva(ActionEvent actionEvent) {
        cas1.setText("");
        cas2.setText("");
        cas3.setText("");
        cas4.setText("");
        cas5.setText("");
        cas6.setText("");
        cas7.setText("");
        cas8.setText("");
        cas9.setText("");
    }

    public void Salir(ActionEvent actionEvent) {
        Platform.exit();
    }
}
