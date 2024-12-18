package banco;

import modelos.Conta;

public class Banco {

	public static void main(String[] args) {
		
		Conta a = new Conta("Conta 1");
		a.depositar(5.5f);
		a.sacar(2);
		Conta b = new Conta ("conta 2");
		System.out.println("Saldo da conta A: " + a.getSaldo());
		System.out.println("Saldo da conta B: " + b.getSaldo());

	}

}
