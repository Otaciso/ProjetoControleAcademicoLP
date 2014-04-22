package projeto;

public class Pessoa {

	private String nome;
	private int idade;
	private String sexo;
	private String cpf;
	private String rg;
	private Endereco endereco;
	private String matricula;

	public Pessoa(String nome, int idade, String sexo, String cpf, String rg,
			Endereco endereco, String matricula) throws Exception {
		if (nome == null || nome.equals("")) {
			throw new Exception("Nome Invalido");
		}

		if (idade <= 0 || idade > 150) {
			throw new Exception("Idade Invalida");
		}

		if (sexo == null || sexo.equals("")) {
			throw new Exception("Sexo Invalido");
		}

		if (cpf == null || cpf.equals("")) {
			throw new Exception("CPF Invalido");
		}

		if (rg == null || rg.equals("")) {
			throw new Exception("RG Invalido");
		}

		if (endereco == null) {
			throw new Exception("Endereco invalido");
		}
		
		if(matricula == null || matricula.equals("")){
			throw new Exception("Matricula Invalida");
		}

		this.nome = nome;
		this.idade = idade;
		this.sexo = sexo;
		this.cpf = cpf;
		this.rg = rg;
		this.endereco = endereco;
		this.matricula = matricula;
	}

	public String getMatricula() {
		return matricula;
	}

	public void setMatricula(String matricula) {
		this.matricula = matricula;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getIdade() {
		return idade;
	}

	public void setIdade(int idade) {
		this.idade = idade;
	}

	public String getSexo() {
		return sexo;
	}

	public void setSexo(String sexo) {
		this.sexo = sexo;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public String getRg() {
		return rg;
	}

	public void setRg(String rg) {
		this.rg = rg;
	}

	public Endereco getEndereco() {
		return endereco;
	}

	public void setEndereco(Endereco endereco) {
		this.endereco = endereco;
	}

}
