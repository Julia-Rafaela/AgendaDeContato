package Agenda;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;

public class AgendaDeContadoEx17 extends Application{
	@Override
    public void start(Stage stage) throws Exception {
		

          
	        
	        Label nome = new Label ("Nome:"); 
	        Label id = new Label ("Id:");
	        Label telefone = new Label ("Telefone:");
	        TextField textfield1 = new TextField ();
	        TextField textfield2 = new TextField ();
	        TextField textfield3 = new TextField ();
	        Button salvar =new Button("Salvar");
	        Button pesquisar =new Button("Pesquisar");
	        GridPane pane = new GridPane();
	        pane.setHgap(8);
	        pane.setVgap(8);
	        pane.setPadding(new Insets(5));
	       
	        Scene scene = new Scene (pane, 400,200);
	        pane.addRow(0, id, textfield1);
	        pane.addRow(1, nome, textfield2);
	        pane.addRow(2, telefone, textfield3);
	       
	   
	        pane.addRow(3, salvar);
	        pane.addRow(3, pesquisar);  

	      
	       stage.setTitle("Agenda de Contatos");
	       stage.setScene(scene);
	       stage.show();
           

	}
	    public static void main(String[] args) {
	    	 Application.launch(args);
	    }
}
