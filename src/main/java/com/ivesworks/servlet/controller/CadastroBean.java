package com.ivesworks.servlet.controller;

import javax.faces.component.html.HtmlCommandButton;
import javax.faces.component.html.HtmlInputSecret;
import javax.faces.component.html.HtmlInputText;

public class CadastroBean {
	private HtmlInputText inputNomeUsuario;
	private HtmlInputText inputEmailUsuario;
	private HtmlInputSecret inputSenhaUsuario;
	
	private HtmlCommandButton botaoCadastrar;
	
	private String isValid = "";
	private String isConfirmed = "";
	
	public String validar() {
		isValid = "E-mail válido.";
		return isValid;
	}
	
	public String confirmar() {
		isConfirmed = "Usuário cadastrado!";
		return isConfirmed;
	}

	public HtmlInputText getInputNomeUsuario() {
		return inputNomeUsuario;
	}

	public void setInputNomeUsuario(HtmlInputText inputNomeUsuario) {
		this.inputNomeUsuario = inputNomeUsuario;
	}

	public HtmlInputText getInputEmailUsuario() {
		return inputEmailUsuario;
	}

	public void setInputEmailUsuario(HtmlInputText inputEmailUsuario) {
		this.inputEmailUsuario = inputEmailUsuario;
	}
	
	public HtmlInputSecret getInputSenhaUsuario() {
		return inputSenhaUsuario;
	}

	public void setInputSenhaUsuario(HtmlInputSecret inputSenhaUsuario) {
		this.inputSenhaUsuario = inputSenhaUsuario;
	}

	public HtmlCommandButton getBotaoCadastrar() {
		return botaoCadastrar;
	}

	public void setBotaoCadastrar(HtmlCommandButton botaoCadastrar) {
		this.botaoCadastrar = botaoCadastrar;
	}

	public String getIsValid() {
		return isValid;
	}

	public void setIsValid(String isValid) {
		this.isValid = isValid;
	}

	public String getIsConfirmed() {
		return isConfirmed;
	}

	public void setIsConfirmed(String isConfirmed) {
		this.isConfirmed = isConfirmed;
	}
	
}


