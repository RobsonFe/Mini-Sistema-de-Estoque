package aplicacao;

import java.util.Scanner;
import Entidades.Produtos;

public class Programa {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		Produtos produtos = new Produtos (); 
		System.out.println("\t\tColoque os Dados do Produto");
		System.out.println("Nome do Produto: ");
		produtos.nome = sc.nextLine();
		System.out.println("Preço: ");
		produtos.preco = sc.nextDouble();
		System.out.println("Quantidade em Estoque: ");
		produtos.quantidade = sc.nextInt(); 
		
		System.out.println("\tDados do Produto: " + produtos);
		System.out.println();
		System.out.print("Coloque a quantidade de produtos que será adicionada no estoque ");
		int quantidade = sc.nextInt(); 
		produtos.addProdutos(quantidade);
		
		System.out.println();
		System.out.println("Dados Atualizados: " + produtos);
		
		System.out.println();
		System.out.println("Coloque a quantidade que será removida do estoque ");
		quantidade = sc.nextInt();
		produtos.removerProdutos(quantidade);
		
		System.out.println();
		System.out.println("Dados Atualizados: " + produtos);
		
		sc.close();
	}

}
