package projeto;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

@SuppressWarnings("unused")
public class TestPrincipalTest {
	private Pessoa pessoa;
	private Endereco endereco;
	private Funcionario funcionario;
	private Aluno aluno;
	private ConsultarECadastrar c;
	@Before
	public void criarPessoa() throws Exception {
		endereco = new Endereco("Marta Jabs", 198, "Rocha", "Rio Tinto", "Paraiba");
		pessoa = new Pessoa("Otaciso", 25, "Masculino", "078.059.234-42", "8.392.44", endereco, "Tecnico"); } 
	@Test
	public void testaErrosNoConstrutorPessoa() throws Exception {
		try { pessoa = new Pessoa(null, 25, "Masculino", "078.059.234-42", "8.392.44", endereco, "81011045");
			Assert.fail("Devia Lançar Exeção Nome Invalido!");} catch (Exception e) {
				Assert.assertEquals("Mensagem Errada!", "Nome Invalido", e.getMessage()); }
		try { pessoa = new Pessoa("", 25, "Masculino", "078.059.234-42", "8.392.44", endereco, "81011045");
			Assert.fail("Devia Lançar Exeção nome Invalido");} catch (Exception e) {
			Assert.assertEquals("Mensagem Errada!", "Nome Invalido", e.getMessage()); }		
		try { pessoa = new Pessoa("Otaciso", -25, "Masculino", "078.059.234-42", "8.392.44", endereco, "81011045");
			Assert.fail("Devia Lançar Exeção Idade Invalida"); } catch (Exception e) {
			Assert.assertEquals("Mensagem Errada!", "Idade Invalida", e.getMessage()); }		
		try { pessoa = new Pessoa("Otaciso", 25, "", "078.059.234-42", "8.392.44", endereco, "81011045");
			Assert.fail("Devia Lançar Exeção Idade Invalida");} catch (Exception e) {
			Assert.assertEquals("Mensagem Errada!", "Sexo Invalido", e.getMessage()); }		
		try { pessoa = new Pessoa("Otaciso", 25, "Masculino", null, "8.392.44", endereco, "81011045");
			Assert.fail("Devia Lançar Exeção Cpf Invalido"); } catch (Exception e) { 
			Assert.assertEquals("Mensagem Errada!", "CPF Invalido", e.getMessage()); } 
		try { pessoa = new Pessoa("Otaciso", 25, "Masculino", "078.059.234-42", "", endereco, "81011045");
			Assert.fail("Devia Lançar Exeção RG Invalido"); } catch (Exception e) {
			Assert.assertEquals("Mensagem Errada!", "RG Invalido", e.getMessage()); }			
		try { pessoa = new Pessoa("Otaciso", 25, "Masculino", "078.059.234-42", "8.392.44", null, "81011045");
			Assert.fail("Devia Lançar Exeção RG Invalido"); } catch (Exception e) {
			Assert.assertEquals("Mensagem Errada!", "Endereco invalido", e.getMessage()); } 		
		try { pessoa = new Pessoa("Otaciso", 25, "Masculino", "078.059.234-42", "8.392.44", endereco, "");
			Assert.fail("Devia Lançar Exeção RG Invalido"); } catch (Exception e) { 
			Assert.assertEquals("Mensagem Errada!", "Matricula Invalida", e.getMessage()); } }
	@Test
	public void testPessoa() {
		Assert.assertEquals("Otaciso", pessoa.getNome());
		Assert.assertEquals(25, pessoa.getIdade());
		Assert.assertTrue(pessoa.getIdade() == 25);
		Assert.assertFalse(pessoa.getIdade() == 22);
		Assert.assertEquals("Sexo Errado", "Masculino", pessoa.getSexo());
		Assert.assertEquals("CPF Errado", "078.059.234-42", pessoa.getCpf());
		Assert.assertEquals("RG Errado", "Masculino", pessoa.getSexo()); }	
	@Test//Cria endereco
	public void criarEndereco() throws Exception {
		endereco = new Endereco("Boa Hancok", 1234, "Aurora", "Campina grande", "Paraiba"); }
	// TestaParamEndereço
	@Test(expected = Exception.class)
	public void testaConstrutorParamRuaVazio() throws Exception {
		new Endereco("", 1234, "Aurora", "Campina grande", "Paraiba"); }
	@Test(expected = Exception.class)
	public void testaConstrutorParamRuaNull() throws Exception {
		new Endereco(null, 1234, "Aurora", "Campina grande", "Paraiba"); }
	@Test(expected = Exception.class)
	public void testaConstrutorParamNumRuaNegativo() throws Exception { 
		new Endereco("Boa Hancok", -1234, "Aurora", "Campina grande", "Paraiba"); }
	@Test(expected = Exception.class)
	public void testaConstrutorParamBairro() throws Exception {
		new Endereco("Boa Hancok", 1234, "", "Campina grande", "Paraiba"); }
	@Test(expected = Exception.class)
	public void testaConstrutorParamCidade() throws Exception {
		new Endereco("Boa Hancok", 1234, "Aurora", "", "Paraiba"); }
	@Test(expected = Exception.class)
	public void testaConstrutorParamEstado() throws Exception {
		new Endereco("Boa Hancok", 1234, "Aurora", "Campina grande", ""); }
	@Test//Testa endereco
	public void testaEndereco() {
		Assert.assertEquals("Marta Jabs", endereco.getRua());
		Assert.assertTrue(198 == endereco.getNumero()); 
		Assert.assertEquals("Rocha", endereco.getBairro());
		Assert.assertEquals("Rio Tinto", endereco.getCidade());
		Assert.assertEquals("Paraiba", endereco.getEstado());
	}
	@Before
	public void criaFuncionario() throws Exception {
		endereco = new Endereco("Zipe", 190, "Zap", "ZipZap", "Doce");
		pessoa = new Pessoa("Otaciso", 25, "Masculino", "078.059.876-11", "2.456.789", endereco, "81011053");
		funcionario = new Funcionario(pessoa, "899009", 2.500, "Cordenador");
	}


}
