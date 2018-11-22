package conacyt;

import static conacyt.FXMLDocumentController.usuario;
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
import javafx.scene.control.RadioButton;
import javafx.stage.Stage;
import javax.swing.JOptionPane;


public class SecundariaController implements Initializable {
    
    @FXML public RadioButton rbCapacitor;
    @FXML public RadioButton rbResistor;
    @FXML public RadioButton rbLED;
    @FXML public RadioButton rbCableElect;
    @FXML public RadioButton rbCW;
    @FXML public RadioButton rbphp;
    @FXML public RadioButton rbmysql;
    @FXML public RadioButton rbC;
    @FXML public RadioButton rbDD;
    @FXML public RadioButton rbDiaFlu;
    @FXML public RadioButton rbkarel;
    @FXML public RadioButton rbBaseDatos;
    @FXML public RadioButton rbwindows;
    @FXML public RadioButton rblinux;
    @FXML public RadioButton rbios;
    @FXML public RadioButton rbibm;
    @FXML public RadioButton rbcien;
    @FXML public RadioButton rbquin;
    @FXML public RadioButton rbdiezmil;
    @FXML public RadioButton rbmil;
    @FXML public RadioButton rbteclado;
    @FXML public RadioButton rbbocinas;
    @FXML public RadioButton rbTM;
    @FXML public RadioButton rbpantalla;
    @FXML public RadioButton rbdiagrama;
    @FXML public RadioButton rbalgoritmo;
    @FXML public RadioButton rbtablas;
    @FXML public RadioButton rbAB;
    @FXML public RadioButton rbhexa;
    @FXML public RadioButton rbdecimal;
    @FXML public RadioButton rbEE;
    @FXML public RadioButton rbbinario;
    @FXML public RadioButton rbGB;
    @FXML public RadioButton rbbit;
    @FXML public RadioButton rbrom;
    @FXML public RadioButton rbbyte;
    @FXML public RadioButton rbbin;
    @FXML public RadioButton rbsoftware;
    @FXML public RadioButton rbbus;
    @FXML public RadioButton rbascii;
    @FXML public Button boton1,boton2,boton3,boton4,boton5,boton6,boton7,boton8,boton9, btnSalir;
    
    
    @FXML
    public void selectcapacitor(ActionEvent evento){
        rbResistor.setSelected(false);
        rbLED.setSelected(false);
        rbCableElect.setSelected(false);
        
    }
    @FXML
    public void selectresistor(ActionEvent evento){
        rbCapacitor.setSelected(false);
        rbLED.setSelected(false);
        rbCableElect.setSelected(false);
    }
    @FXML
    public void selectLED(ActionEvent evento){
        rbResistor.setSelected(false);
        rbCapacitor.setSelected(false);
        rbCableElect.setSelected(false);
    }
    @FXML
    public void selectCE(ActionEvent evento){
        rbResistor.setSelected(false);
        rbLED.setSelected(false);
        rbCapacitor.setSelected(false);
    }
    
   @FXML
    public void selectphp(ActionEvent evento){
        rbC.setSelected(false);
        rbCW.setSelected(false);
        rbmysql.setSelected(false);

    }
    @FXML
    public void selectcw(ActionEvent evento){
        rbC.setSelected(false);
        rbphp.setSelected(false);
        rbmysql.setSelected(false);
    }
    @FXML
    public void selectmysql(ActionEvent evento){
        rbC.setSelected(false);
        rbCW.setSelected(false);
        rbphp.setSelected(false);
    }
    @FXML
    public void selectC(ActionEvent evento){
        rbphp.setSelected(false);
        rbCW.setSelected(false);
        rbmysql.setSelected(false);
    }
    @FXML
    public void selectBaseDatos(ActionEvent evento){
        rbDiaFlu.setSelected(false);
        rbDD.setSelected(false);
        rbkarel.setSelected(false);

    }
    @FXML
    public void selectDD(ActionEvent evento){
        rbDiaFlu.setSelected(false);
        rbkarel.setSelected(false);
        rbBaseDatos.setSelected(false);
    }
    @FXML
    public void selectkarel(ActionEvent evento){
        rbDD.setSelected(false);
        rbDiaFlu.setSelected(false);
        rbBaseDatos.setSelected(false);
    }
    @FXML
    public void selectDF(ActionEvent evento){
        rbDD.setSelected(false);
        rbDiaFlu.setSelected(false);
        rbBaseDatos.setSelected(false);
    }
    @FXML
    public void selectwindows(ActionEvent evento){
        rblinux.setSelected(false);
        rbibm.setSelected(false);
        rbios.setSelected(false);

    }
    @FXML
    public void selectibm(ActionEvent evento){
        rblinux.setSelected(false);
        rbwindows.setSelected(false);
        rbios.setSelected(false);
    }
    @FXML
    public void selectios(ActionEvent evento){
        rblinux.setSelected(false);
        rbibm.setSelected(false);
        rbwindows.setSelected(false);
    }
    @FXML
    public void selectlinux(ActionEvent evento){
        rbwindows.setSelected(false);
        rbibm.setSelected(false);
        rbios.setSelected(false);
    }
     @FXML
    public void selectcien(ActionEvent evento){
        rbquin.setSelected(false);
        rbdiezmil.setSelected(false);
        rbmil.setSelected(false);

    }
    @FXML
    public void selectdiezmil(ActionEvent evento){
        rbquin.setSelected(false);
        rbcien.setSelected(false);
        rbmil.setSelected(false);
    }
    @FXML
    public void selectmil(ActionEvent evento){
        rbquin.setSelected(false);
        rbdiezmil.setSelected(false);
        rbcien.setSelected(false);
    }
    @FXML
    public void selectquin(ActionEvent evento){
        rbcien.setSelected(false);
        rbdiezmil.setSelected(false);
        rbmil.setSelected(false);
    }
    @FXML
    public void selectpantalla(ActionEvent evento){
        rbbocinas.setSelected(false);
        rbTM.setSelected(false);
        rbteclado.setSelected(false);

    }
    @FXML
    public void selectTM(ActionEvent evento){
        rbbocinas.setSelected(false);
        rbteclado.setSelected(false);
        rbpantalla.setSelected(false);
  
    }
    @FXML
    public void selectteclado(ActionEvent evento){
        rbbocinas.setSelected(false);
        rbTM.setSelected(false);
        rbpantalla.setSelected(false);
    }
    @FXML
    public void selectbocinas(ActionEvent evento){
        rbteclado.setSelected(false);
        rbTM.setSelected(false);
        rbpantalla.setSelected(false);
    }
    @FXML
    public void selectdiagrama(ActionEvent evento){
        rbalgoritmo.setSelected(false);
        rbtablas.setSelected(false);
       rbAB.setSelected(false);
    }
    @FXML
    public void selectalgoritmo(ActionEvent evento){
        rbdiagrama.setSelected(false);
        rbtablas.setSelected(false);
       rbAB.setSelected(false);
    }
    @FXML
    public void selecttablas(ActionEvent evento){
        rbalgoritmo.setSelected(false);
        rbdiagrama.setSelected(false);
       rbAB.setSelected(false);
    }
    @FXML
    public void selectAB(ActionEvent evento){
        rbalgoritmo.setSelected(false);
        rbtablas.setSelected(false);
       rbdiagrama.setSelected(false);
    }
    @FXML
    public void selecthexa(ActionEvent evento){
        rbdecimal.setSelected(false);
        rbbinario.setSelected(false);
        rbEE.setSelected(false);

    }
    @FXML
    public void selectdecimal(ActionEvent evento){
        rbhexa.setSelected(false);
        rbbinario.setSelected(false);
        rbEE.setSelected(false);
    }
    @FXML
    public void selectEE(ActionEvent evento){
        rbdecimal.setSelected(false);
        rbbinario.setSelected(false);
        rbhexa.setSelected(false);
    }
    @FXML
    public void selectbinario(ActionEvent evento){
        rbdecimal.setSelected(false);
        rbhexa.setSelected(false);
        rbEE.setSelected(false);
    }
        @FXML
    public void selectGB(ActionEvent evento){
        rbbit.setSelected(false);
        rbrom.setSelected(false);
        rbbyte.setSelected(false);
    }
    @FXML
    public void selectbit(ActionEvent evento){
        rbGB.setSelected(false);
        rbrom.setSelected(false);
        rbbyte.setSelected(false);
    }
    @FXML
    public void selectrom(ActionEvent evento){
        rbbit.setSelected(false);
        rbGB.setSelected(false);
        rbbyte.setSelected(false);
    }
    @FXML
    public void selectbyte(ActionEvent evento){
        rbbit.setSelected(false);
        rbrom.setSelected(false);
        rbGB.setSelected(false);
    }
    @FXML
    public void selectbin(ActionEvent evento){
        rbsoftware.setSelected(false);
        rbbus.setSelected(false);
        rbascii.setSelected(false);
    }
    @FXML
    public void selectsoftware(ActionEvent evento){
       rbbin.setSelected(false);
        rbbus.setSelected(false);
        rbascii.setSelected(false);
    }
    @FXML
    public void selectbus(ActionEvent evento){
       rbsoftware.setSelected(false);
        rbbin.setSelected(false);
        rbascii.setSelected(false);
    }
    @FXML
    public void selectascii(ActionEvent evento){
       rbsoftware.setSelected(false);
        rbbus.setSelected(false);
        rbbin.setSelected(false);
    }
    private static int calif;
            
     public void selectsiguiente (ActionEvent event) throws IOException{
     Stage stage = null; 
     Parent root = null;
     
     if(event.getSource()==boton1){
         calif=0;
                   if (rbResistor.isSelected()) {
                 calif = calif +10;
                 
         }
     
       stage=(Stage) boton1.getScene().getWindow();

  root = FXMLLoader.load(getClass().getResource("Pregunta2.fxml"));
     }else if(event.getSource()==boton2){
         
          if (rbphp.isSelected()) {
             
                 calif = calif +10;
                 
         }
       stage=(Stage) boton2.getScene().getWindow();
  root = FXMLLoader.load(getClass().getResource("Pregunta3.fxml"));
      }
     else if(event.getSource()==boton3){
                   if (rbBaseDatos.isSelected()) {
                       
                 calif = calif +10;
                 
         }
         stage=(Stage) boton3.getScene().getWindow();
  root = FXMLLoader.load(getClass().getResource("Pregunta4.fxml"));
     }
     else if(event.getSource()==boton4){
         
                   if (rbios.isSelected()) {
                 calif = calif+10;
                 
         }
         stage=(Stage) boton4.getScene().getWindow();
  root = FXMLLoader.load(getClass().getResource("Pregunta5.fxml"));
     }
     else if(event.getSource()==boton5){
                   if (rbmil.isSelected()) {
                 calif = calif +10;
                 
         }
         stage=(Stage) boton5.getScene().getWindow();
  root = FXMLLoader.load(getClass().getResource("Pregunta6.fxml"));
     }
     else if(event.getSource()==boton6){
                   if (rbteclado.isSelected()) {
                 calif = calif +10;
                 
         }
         stage=(Stage) boton6.getScene().getWindow();
  root = FXMLLoader.load(getClass().getResource("Pregunta7.fxml"));
     }
     else if(event.getSource()==boton7){
                   if (rbdiagrama.isSelected()) {
                 calif = calif +10;
                 
         }
         stage=(Stage) boton7.getScene().getWindow();
  root = FXMLLoader.load(getClass().getResource("Pregunta8.fxml"));
     }
     else if(event.getSource()==boton8){
                   if (rbbinario.isSelected()) {
                 calif = calif +10;
                 
         }
         stage=(Stage) boton8.getScene().getWindow();
  root = FXMLLoader.load(getClass().getResource("Pregunta9.fxml"));
     }
     else if(event.getSource()==boton9){
                   if (rbbit.isSelected()) {
                 calif = calif +10;
                 
         }
         stage=(Stage)boton9.getScene().getWindow();
  root = FXMLLoader.load(getClass().getResource("Pregunta10.fxml"));
     }
     else if(event.getSource()==btnSalir){
                   if (rbascii.isSelected()) {
                 calif = calif +10;
         }
         stage=(Stage)btnSalir.getScene().getWindow();
  root = FXMLLoader.load(getClass().getResource("FXMLDificultades.fxml"));
    JOptionPane.showMessageDialog(null, usuario+ ".\nTu calificación es: "+calif);
     }
      Scene scene = new Scene(root);
      stage.setScene(scene);
      stage.show();
    }
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    
    
}
