package poo;

public class Cartao {
	//Atributos 
	/**
	 * cria as variaveis privadas
	 */
	private String nomeFuncionario;
	private String servico;
	private String cargo;
	
	// Construtores 
	/**
	 * 
	 * @param nomeFuncionario
	 * escolhe o nome do funcionario
	 */
	public Cartao(String nomeFuncionario) {
		super();
		this.nomeFuncionario = nomeFuncionario;
	}
	/**
	 * Associa informação dada para cada variavel
	 * @param nomeFuncionario
	 * @param servico
	 * @param cargo
	 */
	public Cartao(String nomeFuncionario, String servico, String cargo) {
		super();
		this.nomeFuncionario = nomeFuncionario;
		this.servico = servico;
		this.cargo = cargo;
	}

	// Acessores
	/**
	 * faz return do nome do funcionario e do servico e cargo
	 * @return
	 */
	public String getNomeFuncionario() {
		return nomeFuncionario;
	}

	public void setServico(String servico) {
		this.servico = servico;
	}

	public void setCargo(String cargo) {
		this.cargo = cargo;
	}
	
	// Métodos
	/**
	 * retira os servilco
	 */
	public void retirarServico() {
		// servico = "";
		setServico("");
	}
	/**
	 * atribui o servico novo
	 * @param novoServico
	 */
	public void atribuirNovoServico( String novoServico ) {
		//servico = novoServico;
		setServico( novoServico );
	}
	/**
	 * atribui um novo cargo
	 * @param novoCargo
	 */
	public void promoverNovoCargo( String novoCargo ) {
		//cargo = novoCargo;
		setCargo(novoCargo);
	}
	/**
	 * despedir ele apaga apaga um funcionario com os servico e a carga
	 */
	public void despedirFuncionario() {
		retirarServico();
		setCargo("");
	}
	
}
