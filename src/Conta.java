public class Conta {
	private double saldo;
	private int numero;
	private int agencia;
	private Cliente titular;
	private static int total;
	
	public Conta (int agencia, int numero) {
		System.out.println("Estou criando uma conta");
		
		Conta.total++;
		System.out.println("O total de contas eh: " + Conta.total);
		System.out.println("Numero da conta: " +numero);
		this.numero = numero;
		System.out.println("Numero da agencia: " +agencia);
		this.agencia = agencia;	
	}
	
	
	public double getSaldo() {
		return this.saldo;
	}

	public void deposita(double valor) {
		this.saldo += valor;
	}

	public boolean saca(double valor) {
		if (this.saldo >= valor) {
			this.saldo -= valor;
			return true;
		} else {
			return false;
		}
	}

	public boolean transfere(double valor, Conta destino) {

		if (this.saldo >= valor) {
			this.saldo -= valor;
			destino.deposita(valor);
			return true;
		} else {
			return false;
		}
	}

	public int getNumero() {
		return this.numero;
	}

	public void setNumero(int numero) {
		if(numero <=0) {
			System.out.println("Nao pode valor menor que 0");
		}else{
			this.numero = numero;
		}
	}

	public int getAgencia() {
		return this.agencia;
	}

	public void setAgencia(int agencia) {
		if (agencia <= 0) {
			System.out.println("nao pode valor menor que 0");
		} else {
			this.agencia = agencia;
		}
	}

	public void setTitular(Cliente titular) {
		this.titular = titular;
	}

	public Cliente getTitular() {
		return this.titular;
	}
	
	public static int getTotal() {
		return Conta.total;
	}
	
}