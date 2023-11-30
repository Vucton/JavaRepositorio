package Exercicio;

import java.util.ArrayList;
import java.util.Scanner;
	 

public class SistemaGerenciamentoProdutos {
	 
	public static void main(String[] args) {
		ArrayList<Produto> listaProdutos = new ArrayList<Produto>();
		Scanner scan = new Scanner(System.in);
		
		
		while(true) {
			System.out.println("### Sistema de Gerenciamento de Produtos ###");
			System.out.println("1. Inserir Produtos Perecivel");
			System.out.println("2. Isenrir Produtos Nao Perecivel");
			System.out.println("3. Consultar Estoque");
			System.out.println("4. Adicionar Estoque");
			System.out.println("5. Sair");
			System.out.println("Escolha uma opcao: ");
			int escolha = scan.nextInt();
			scan.nextLine(); //Consumir a quebra de linha
			
			switch(escolha) {
			case 1: 
				System.out.println("### Inserir Produto Perecivel ###");
				System.out.println("Codigo: ");
				int codigoPerecivel = scan.nextInt();
				scan.nextLine();
				System.out.println("Nome: ");
				String nome = scan.nextLine();
				System.out.println("Preco: R$");
				double precoPerecivel = scan.nextDouble();
				scan.nextLine();
				System.out.println("Quantidede em Estoque: ");
				int quantidadePerecivel = scan.nextInt();
				scan.nextLine();
				System.out.println("Data de Vencimento: ");
				String dataVencimento =scan.next();
				scan.nextLine();
				
				ProdutoPerecivel produtoPerecivel = new ProdutoPerecivel(codigoPerecivel, nome, precoPerecivel, quantidadePerecivel, dataVencimento);
				listaProdutos.add(produtoPerecivel);
				System.out.println("Produto Perecivel inserido com sucesso!");
				break;
				
			case 2: 
				System.out.println("### Inserir Produto Nao Perecivel ###");
				System.out.println("Codigo: ");
				int codigoNaoPerecivel = scan.nextInt();
				scan.nextLine();
				System.out.println("Nome: ");
				String nomeNaoPerecivel = scan.nextLine();
				System.out.println("Preco: ");
				double precoNaoPerecivel = scan.nextDouble();
				scan.nextLine();
				System.out.println("Quantidade em Estoque: ");
				int quantidadeNaoPerecivel = scan.nextInt();
				scan.nextLine();
				System.out.println("Material: ");
				String material = scan.nextLine();
				
				ProdutoNaoPerecivel produtoNaoPerecivel = new ProdutoNaoPerecivel(codigoNaoPerecivel, nomeNaoPerecivel, precoNaoPerecivel, quantidadeNaoPerecivel, material);
				listaProdutos.add(produtoNaoPerecivel);
				System.out.println("Produto Não Perecivel inserido com sucesso\n");
				break;
				
			case 3: 
				System.out.println("### Consultar Produtos ###");
				for(Produto produto: listaProdutos) {
					System.out.println(produto);
					
				}
				System.out.println();
				break;
				
			case 4: 
				System.out.println("### Digite o codigo do produto ###");
				int codigoEstoque = scan.nextInt();
				scan.nextLine();
				System.out.println("Digite a quantidade a ser adicionada ao estoque: ");
				int quantidadeAdicionar = scan.nextInt();
				
				for(Produto produto: listaProdutos) {
					if(produto.getCodigo() == codigoEstoque) {
						produto.adicionarEstoque(quantidadeAdicionar);
						break;
					}
				}
				break;
				
			case 5:
				System.out.println();
				scan.close();
				System.exit(0);
				
				default:
					System.out.println("Opcao invalida. Tente novamente.\n");
					break;
			
			}
		}
	}

}
