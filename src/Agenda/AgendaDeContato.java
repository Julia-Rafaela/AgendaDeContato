package Agenda;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;

public class AgendaDeContato extends Application{
	@Override
    public void start(Stage stage) throws Exception {
		  Pane painel = new Pane();
	        Scene scn = new Scene(painel, 500, 250);
	        stage.setScene( scn );
	        
	       //Label é a parte onde escreve na tela 
	        
	        //id
	        Label id = new Label("Id:");
	        id.relocate(10, 50);

	        //TextField onde fica "os regangulos"
	        TextField txtid = new TextField();
	        txtid.relocate(100, 50);
	      
	        //nome 

	        Label nome = new Label("Nome:");
	        nome.relocate(10, 90);

	        TextField txtNome = new TextField();
	        txtNome.relocate(100, 90);

	        //telefone

	        Label telefone= new Label("Telefone:");
	        telefone.relocate(10, 130);

	        TextField txtTelefone = new TextField();
	        txtTelefone.relocate(100, 130);

	        // botao salvar
	        Button btnSalvar = new Button("Salvar");
	        btnSalvar.relocate(10, 160);

	        // botao pesquisar
	        Button btnPesq = new Button("Pesquisar");
	        btnPesq.relocate(60, 160);

	      //coloca o titulo na tela
	        stage.setTitle("Agenda de Contatos");
	        stage.show();

	        //colocar o nome das label e txt
	        painel.getChildren().addAll(id, txtid, btnSalvar, nome, txtNome, telefone, btnPesq, txtTelefone );

	    }
	    //faz rodar
	    public static void main(String[] args) {
	        Application.launch(AgendaDeContato.class, args);
	    }
}
