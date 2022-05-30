
public class TesteGetSet {
	public static void main(String[] args) {
		
		ContaBytecode novaConta = new Polpanca();
		clienteNovo n001 = new clienteNovo();

		novaConta.setTitular("Joao");
		novaConta.setAgencia(2321);
		
		System.out.println(ContaBytecode.getTotal());
	}

}
