
public class TestaValores {

	public static void main(String[] args) {
		
		Conta  conta1 = new Conta(1337, 14226);
		Conta  conta2 = new Conta(1337, 24226);
		Conta  conta3 = new Conta(1337, 34226);
		
		System.out.println(Conta.getTotal());
	}

}

