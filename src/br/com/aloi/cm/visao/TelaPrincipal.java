package br.com.aloi.cm.visao;

import javax.swing.JFrame;

import br.com.aloi.cm.modelo.Tabuleiro;

@SuppressWarnings("serial")
public class TelaPrincipal extends JFrame {

	public TelaPrincipal() {
		Tabuleiro tabuleiro = new Tabuleiro(16, 30, 50);
		PainelTabuleiro painelTabuleiro = new PainelTabuleiro(tabuleiro);
		add(painelTabuleiro);
		setTitle("Campo Minado");
		setSize(690, 438);
		setVisible(true);
		setDefaultCloseOperation(DISPOSE_ON_CLOSE);
	}

	public static void main(String[] args) {
		new TelaPrincipal();
	}

}
