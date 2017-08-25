/**
 * 
 */
package com.projeto;

import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;



/**
 * @author Bruno
 * O USO DO TEXTAREA GEROU ERRO,
 * METODOS TAMBEM DEVE SER ANTECEDIDOS PELO @FXML
 */
public class RunController {

	@FXML
	Label lblNome;
	@FXML
	Button btnEnviar;

	
	@FXML
	public void onSubmitSclick(ActionEvent event){
		System.out.println("AVAI");
	}
	
}
