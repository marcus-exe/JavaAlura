package br.com.Alura.bytebank.bank.util;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.function.Consumer;

import br.com.Alura.bytebank.bank.model.Account;
import br.com.Alura.bytebank.bank.model.CheckingAccount;
import br.com.Alura.bytebank.bank.model.Client;
import br.com.Alura.bytebank.bank.model.SavingsAccount;

public class Testing {

	public static void main(String[] args) {

		Account account1 = new CheckingAccount(22, 33);
		Client Clientaccount1 = new Client();
		Clientaccount1.setName("Marcus");
		account1.setBarrer(Clientaccount1);
		account1.deposit(333.0);

		Account account2 = new SavingsAccount(22, 44);
		Client Clientaccount2 = new Client();
		Clientaccount2.setName("Guilherme");
		account2.setBarrer(Clientaccount2);
		account2.deposit(444.0);

		Account account3 = new CheckingAccount(22, 11);
		Client Clientaccount3 = new Client();
		Clientaccount3.setName("Paulo");
		account3.setBarrer(Clientaccount3);
		account3.deposit(111.0);

		Account account4 = new SavingsAccount(22, 22);
		Client Clientaccount4 = new Client();
		Clientaccount4.setName("Ana");
		account4.setBarrer(Clientaccount4);
		account4.deposit(222.0);

		List<Account> list = new ArrayList<>();
		list.add(account1);
		list.add(account2);
		list.add(account3);
		list.add(account4);


		list.forEach( (Account account) -> System.out.println(account.getBarrer().getName() + ": " + account + ", Balance: " + account.getBalance())
		);
		
		System.out.println("-------------------------------------");
		
		//Anonymous Class
		list.sort((ac1, ac2) -> Integer.compare(ac1.getNumber(), ac2.getNumber())
		);
		
		Comparator<Account> comparator = (ac1, ac2) -> {
				String nameaccount1 = ac1.getBarrer().getName();
				String nameaccount2 = ac2.getBarrer().getName();
				return nameaccount1.compareTo(nameaccount2);

		};
		
		list.forEach( (Account account) -> System.out.println(account.getBarrer().getName() + ": " + account + ", Balance: " + account.getBalance())
		);
		

	}

}
