package conacyt;

import static conacyt.FXMLDocumentController.usuario;
import java.awt.Toolkit;
import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.RadioButton;
import javafx.stage.Stage;
import javax.swing.JOptionPane;

public class ExamenController implements Initializable {
    
    @FXML private Label question;
    @FXML private Button regresar;
    @FXML private Button avanzar;
    @FXML private Button terminarExamen;
    @FXML private Button salir;
    @FXML private RadioButton opc01;
    @FXML private RadioButton opc02;
    
    int posicion=0;
    Answers r = new Answers();
    Preguntas p = new Preguntas();
    Object[] select = {"","","","","","","","","",""};
    
  //--------------------------------------------------------------------------------  
    @FXML
    private void AvanzarButtonAction(ActionEvent event){
        if(posicion == 8){
            avanzar.setDisable(true);
            terminarExamen.setDisable(false);
        }
        
        
        if(posicion < 10){
            regresar.setDisable(false);
            posicion++;
            question.setText(p.getPregunta(posicion));
            String[] a = r.setRespuestas(posicion);
            opc01.setSelected(false);
            opc02.setSelected(false);
            opc01.setText(a[0]);
            opc02.setText(a[1]);
            opc01.requestFocus();
        }else{
            Toolkit.getDefaultToolkit().beep();
        }
        
    };
//--------------------------------------------------------------------------------    
    @FXML
    private void RegresarButtonAction(ActionEvent event){
        
        if(posicion == 0 ){
            regresar.setDisable(false);
        }
        
        if(posicion > -1){
            posicion--;
            avanzar.setDisable(false);
            question.setText(p.getPregunta(posicion));
            String[] a = r.setRespuestas(posicion);
            opc01.setSelected(false);
            opc02.setSelected(false);
            opc01.setText(a[0]);
            opc02.setText(a[1]);
            opc01.requestFocus();
        }else{
            Toolkit.getDefaultToolkit().beep();
        }
    };
//--------------------------------------------------------------------------------      
    @FXML
    private void TerminarButtonAction(ActionEvent event){
        int calificacion = 0;
                
        for(int i = 0; i < 10; i++){
            if(select[i].equals(r.getRespuesta(i))){
                calificacion = calificacion + 1;
            }
        }
        
        calificacion = calificacion * 10;
        
        JOptionPane.showMessageDialog(null,usuario + ". Tu calificacion es " + calificacion);
    }
//--------------------------------------------------------------------------------
    @FXML
    private void SalirButtonAction(ActionEvent event) throws IOException{
        Stage stage=null;
        Parent root=null;
        if(event.getSource()==salir){
            stage=(Stage)salir.getScene().getWindow();
            root=FXMLLoader.load(getClass().getResource("FXMLDificultades.fxml"));
        }
        Scene scene = new Scene(root);
        stage.setScene(scene);
        stage.show();
    }
//--------------------------------------------------------------------------------
    @FXML
    private void opc01ActionPerformed (ActionEvent event){
        select[posicion] = opc01.getText();
    }
//--------------------------------------------------------------------------------      
    @FXML
    private void opc02ActionPerformed (ActionEvent event){
        select[posicion] = opc02.getText();
    }
//--------------------------------------------------------------------------------     
    @Override
    public void initialize(URL url, ResourceBundle rb) {
       question.setText(p.getPregunta(posicion));
       String[] a = r.setRespuestas(posicion);
       opc01.setSelected(false);
       opc02.setSelected(false);
       opc01.setText(a[0]);
       opc02.setText(a[1]);
       opc01.requestFocus();
       regresar.setDisable(true);
       terminarExamen.setDisable(true);
       
    }   
     
};

