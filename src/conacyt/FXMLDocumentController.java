package conacyt;

import java.sql.*;
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
import javafx.scene.control.PasswordField;
import javafx.scene.control.RadioButton;
import javafx.scene.control.TextField;
import javafx.stage.Stage;
import javax.swing.JOptionPane;

/**
 *
 * @author Jorge
 */
public class FXMLDocumentController implements Initializable {
    
    @FXML
    private Button btn1;
    
    @FXML
    private Button btn2;
    
    @FXML
    private Button btnIS, btnRegistro, btnRegistrarse, btnMaestros;
    
    @FXML
    private Button btnVolverInicio;
    
    @FXML
    private Button btnVolver;
    
    @FXML
    public Button btnCerrar, btnAnterior;
    
    @FXML
    private Button btnPreescolar, btnPrimaria, btnSecundaria, btnSalir, btnEmpezar;
    
    @FXML
    public RadioButton btnr1, btnr2, btnr3, btnr4;
       
    @FXML
    public Button pbtn1, pbtn2, pbtn3, pbtn4, pbtn5, pbtn6, pbtn7, pbtn8, pbtn9, pbtn10;
    
    @FXML
    private TextField textNombre, textApePat, textApeMat, textTel, textEmail, textUsuario, inicioUsuario;
    
    @FXML
    private PasswordField textPass, inicioPassword;
    
    
    @FXML
    public Label labelCalif;
    private static int calif;
    public static String usuario;
    private static String password;
    
    String ruta = "jdbc:ucanaccess://C:\\Users\\Jorge\\Desktop\\Base.accdb";
    
     @FXML
 private void handleButtonAction(ActionEvent event) throws IOException, InterruptedException, SQLException{
     Stage stage = null; 
     Parent root = null;
     Variable: if(event.getSource()==btn1){
        //get reference to the button's stage         
        stage=(Stage) btn1.getScene().getWindow();
        //load up OTHER FXML document
  root = FXMLLoader.load(getClass().getResource("FXMLInicio.fxml"));
      }
     else if(event.getSource()==btn2){
       stage=(Stage) btn2.getScene().getWindow();
  root = FXMLLoader.load(getClass().getResource("FXMLEquipo.fxml"));
      }
     else if(event.getSource()==btnIS){
         try{
         usuario = inicioUsuario.getText();
         password = inicioPassword.getText();
         Class.forName("net.ucanaccess.jdbc.UcanaccessDriver");
         String url = "jdbc:obdc:manuu";
         Connection con = DriverManager.getConnection(ruta);
         Statement x = con.createStatement();
         String sql = ("SELECT usu_usu, pas_usu FROM Usuario WHERE usu_usu = '"+ usuario +"' AND pas_usu = '"+password+"'");
         ResultSet rs = x.executeQuery(sql);
         int count=0;
         while(rs.next()){
             count++;
         }
         if(count == 1){
             JOptionPane.showMessageDialog(null, "Bienvenido "+ usuario);
             stage=(Stage) btnIS.getScene().getWindow();
             root = FXMLLoader.load(getClass().getResource("IndiceMAIN.fxml"));
         }
         else{
             JOptionPane.showMessageDialog(null, "El nombre de usuario y/o contraseña son incorrectos.");
         }
         }
         catch(Exception e){
             JOptionPane.showMessageDialog(null, e);
         }
     }
     else if(event.getSource()==btnMaestros){
         stage=(Stage) btnMaestros.getScene().getWindow();
  root = FXMLLoader.load(getClass().getResource("FXMLMaestros.fxml"));
     }
     else if(event.getSource()==btnRegistro){
         stage=(Stage) btnRegistro.getScene().getWindow();
  root = FXMLLoader.load(getClass().getResource("FXMLRegistro.fxml"));
     }
     else if(event.getSource()==btnRegistrarse){
         try {
             Class.forName("net.ucanaccess.jdbc.ucanaccessDriver");
Connection con = DriverManager.getConnection(ruta);
Statement x = con.createStatement();
String sql = "insert into Usuario(usu_usu,nom_usu,ape_pat,ape_mat,tel_usu, ema_usu, pas_usu)values"+"('"+ this.textUsuario.getText()+ "','" + this.textNombre.getText()+"','"+ this.textApePat.getText() +"','"+ this.textApeMat.getText()+"','"+this.textTel.getText()+"','"+this.textEmail.getText()+"','"+this.textPass.getText()+"')"; 
x.executeUpdate(sql);
JOptionPane.showMessageDialog(null,"Registrado Exitosamente");
        }
        catch (Exception e){
            JOptionPane.showMessageDialog(null, "Error en "+ e);
        }
         stage=(Stage) btnRegistrarse.getScene().getWindow();
  root = FXMLLoader.load(getClass().getResource("FXMLInicio.fxml"));
     }
     else if(event.getSource()==btnPreescolar){
         stage=(Stage) btnPreescolar.getScene().getWindow();
  root = FXMLLoader.load(getClass().getResource("FXMLPrsInicio.fxml"));
     }
     else if(event.getSource()==btnPrimaria){
         stage=(Stage) btnPrimaria.getScene().getWindow();
  root = FXMLLoader.load(getClass().getResource("FXMLPrimaria.fxml"));
     }
     else if(event.getSource()==btnSecundaria){
         stage=(Stage) btnSecundaria.getScene().getWindow();
  root = FXMLLoader.load(getClass().getResource("Pregunta1.fxml"));
     }
     else if(event.getSource()==btnVolverInicio){
         stage=(Stage) btnVolverInicio.getScene().getWindow();
  root = FXMLLoader.load(getClass().getResource("FXMLInicio.fxml"));
     }
     else if(event.getSource()==btnSalir){
         stage=(Stage) btnSalir.getScene().getWindow();
  root = FXMLLoader.load(getClass().getResource("FXMLDificultades.fxml"));
     }
     else if(event.getSource()==btnEmpezar){
         stage=(Stage) btnEmpezar.getScene().getWindow();
  root = FXMLLoader.load(getClass().getResource("FXMLPreescolar1.fxml"));
     }
     else if(event.getSource()==btnAnterior){
         stage=(Stage) btnAnterior.getScene().getWindow();
  root = FXMLLoader.load(getClass().getResource("FXMLPrsInicio.fxml"));
     }
     else if(event.getSource()==pbtn1){
         calif = 0;
         if (btnr3.isSelected()) {
                 calif = calif + 10;
                 System.out.println(calif);
         }
         stage=(Stage) pbtn1.getScene().getWindow();
  root = FXMLLoader.load(getClass().getResource("FXMLPreescolar2.fxml"));
     }
     else if(event.getSource()==pbtn2){
         if (btnr1.isSelected()) {
                 calif = calif + 10;
                 System.out.println(calif);
         }
         stage=(Stage) pbtn2.getScene().getWindow();
  root = FXMLLoader.load(getClass().getResource("FXMLPreescolar3.fxml"));
     }
     else if(event.getSource()==pbtn3){
         if (btnr4.isSelected()) {
                 calif = calif + 10;
                 System.out.println(calif);
         }
         stage=(Stage) pbtn3.getScene().getWindow();
  root = FXMLLoader.load(getClass().getResource("FXMLPreescolar4.fxml"));
     }
     else if(event.getSource()==pbtn4){
         if (btnr2.isSelected()) {
                 calif = calif + 10;
                 System.out.println(calif);
         }
         stage=(Stage) pbtn4.getScene().getWindow();
  root = FXMLLoader.load(getClass().getResource("FXMLPreescolar5.fxml"));
     }
     else if(event.getSource()==pbtn5){
         if (btnr3.isSelected()) {
                 calif = calif + 10;
                 System.out.println(calif);
         }
         stage=(Stage) pbtn5.getScene().getWindow();
  root = FXMLLoader.load(getClass().getResource("FXMLPreescolar6.fxml"));
     }
     else if(event.getSource()==pbtn6){
         if (btnr2.isSelected()) {
                 calif = calif + 10;
                 System.out.println(calif);
         }
         stage=(Stage) pbtn6.getScene().getWindow();
  root = FXMLLoader.load(getClass().getResource("FXMLPreescolar7.fxml"));
     }
     else if(event.getSource()==pbtn7){
         if (btnr1.isSelected()) {
                 calif = calif + 10;
                 System.out.println(calif);
         }
         stage=(Stage) pbtn7.getScene().getWindow();
  root = FXMLLoader.load(getClass().getResource("FXMLPreescolar8.fxml"));
     }
     else if(event.getSource()==pbtn8){
         if (btnr4.isSelected()) {
                 calif = calif + 10;
                 System.out.println(calif);
         }
         stage=(Stage) pbtn8.getScene().getWindow();
  root = FXMLLoader.load(getClass().getResource("FXMLPreescolar9.fxml"));
     }
     else if(event.getSource()==pbtn9){
         if (btnr1.isSelected()) {
                 calif = calif + 10;
                 System.out.println(calif);
         }
         stage=(Stage) pbtn9.getScene().getWindow();
  root = FXMLLoader.load(getClass().getResource("FXMLPreescolar10.fxml"));
     }
     else if(event.getSource()==pbtn10){
         if (btnr3.isSelected()) {
                 calif = calif + 10;
                 System.out.println(calif);
         }
         stage=(Stage) pbtn10.getScene().getWindow();
  root = FXMLLoader.load(getClass().getResource("FXMLPreescolarFIN.fxml"));
    JOptionPane.showMessageDialog(null,usuario+", obtuviste una puntuación de: " + calif +"/100.");
     }
     else{
         stage=(Stage) btnVolver.getScene().getWindow();
  root = FXMLLoader.load(getClass().getResource("FXMLDocument.fxml"));
     }
     //create a new scene with root and set the stage
      Scene scene = new Scene(root);
      stage.setScene(scene);
      stage.show();
    }
 
 
 public void label() {
    labelCalif.setText("Tu calificación es: " + Integer.toString(calif));
}
   /* 
 private void botonesDificultades(ActionEvent event) throws IOException{
     Stage stage; 
     Parent root;
     if(event.getSource()==btnPreescolar){
        //get reference to the button's stage         
        stage=(Stage) btnPreescolar.getScene().getWindow();
        //load up OTHER FXML document
  root = FXMLLoader.load(getClass().getResource("FXMLPrsInicio.fxml"));
      }
     else {
       stage=(Stage) btnPrimaria.getScene().getWindow();
  root = FXMLLoader.load(getClass().getResource("FXMLEquipo.fxml"));
     }
      Scene scene = new Scene(root);
      stage.setScene(scene);
      stage.show();
    }
*/
 @FXML
 public void radioButtons(ActionEvent event){
     if(event.getSource()==btnr1){
     btnr2.setSelected(false);
     btnr3.setSelected(false);
     btnr4.setSelected(false);
     }
     else if(event.getSource()==btnr2){
     btnr1.setSelected(false);
     btnr3.setSelected(false);
     btnr4.setSelected(false);        
     }
     else if(event.getSource()==btnr3){
     btnr1.setSelected(false);
     btnr2.setSelected(false);
     btnr4.setSelected(false);    
     }
     else
     {
     btnr1.setSelected(false);
     btnr2.setSelected(false);
     btnr3.setSelected(false);
     }
 }
 
 @FXML
public void handleCloseButtonAction(ActionEvent event) {
    Stage stage = (Stage) btnCerrar.getScene().getWindow();
    stage.close();
}
 
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    
    
}