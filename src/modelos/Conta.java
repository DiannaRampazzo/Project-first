package modelos;

public class Conta {
	float saldo;
	String conta;

	public Conta(String conta) {
		this.saldo = 0;
		this.conta = conta;
	}

	public void depositar(float deposito) {
		this.saldo += deposito;
	}

	public void sacar (float sacar) {
		if(sacar > saldo) {
			System.out.println("erro");	
		}else{
			this.saldo -= sacar;
		}
	}
	
	public String getSaldo() {
		return "saldo: "+this.saldo;

	}

}