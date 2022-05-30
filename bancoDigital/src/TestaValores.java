
public class TestaValores {
	public static void main(String[] args) {
		ContaBytecode conta = new Corrente();
		conta.deposita(250);
		conta.setAgencia(50);
System.out.println(conta.getAgencia());
System.out.println(conta.getNumero());
}
}
