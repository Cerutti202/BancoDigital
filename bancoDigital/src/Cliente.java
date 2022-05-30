
public abstract class Cliente {
	protected static int ncliente=0;
	protected String nome ;
	protected String cpf;
	protected String profissao;

	protected String[] contas ;

	private String ContaBytecode;
	String Conta = ContaBytecode;

	protected String titular = nome;

	public String getCpf() {
		return this.cpf;
	}
	protected void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public String getProfissao() {
		return this.profissao;
	}

	protected void setProfissao(String profissao) {
		this.profissao = profissao;
	}

	public String getNome() {
		return this.nome;
	}

	protected void setNome(String nome) {
		this.nome = nome;
	}

	@Override
	public String toString() {
		return "Cliente [nome=" + nome + ", cpf=" + cpf + ", profissão=" + profissao + "]";
	}
}
