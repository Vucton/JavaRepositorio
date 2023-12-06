package Model;

import java.util.Scanner;

import DAO.ProdutoNaoPerecivelDAO;
import DAO.ProdutoPerecivelDAO;

public class SistemaGerenciamentoProdutos {

	public static void main(String[] args) {
		ProdutoNaoPerecivelDAO novPn = new ProdutoNaoPerecivelDAO();
		ProdutoPerecivelDAO novP = new ProdutoPerecivelDAO();
		Scanner scan = new Scanner(System.in);

		while (true) {
			System.out.println("### Sistema de Gerenciamento de Produtos ###");
			System.out.println("1. Inserir Produtos Perecivel");
			System.out.println("2. Isenrir Produtos Nao Perecivel");
			System.out.println("3. Consultar Estoque");
			System.out.println("4. Adicionar Estoque");
			System.out.println("5. Sair");
			System.out.println("Escolha uma opcao: ");
			int escolha = scan.nextInt();
			scan.nextLine(); // Consumir a quebra de linha

			switch (escolha) {
			case 1:
				System.out.println("### Inserir Produto Perecivel ###");

				System.out.println("Nome: ");
				String nome = scan.nextLine();
				System.out.println("Preco: R$");
				double precoPerecivel = scan.nextDouble();
				scan.nextLine();
				System.out.println("Quantidede em Estoque: ");
				int quantidadePerecivel = scan.nextInt();
				scan.nextLine();
				System.out.println("Data de Vencimento: ");
				String dataVencimento = scan.next();
				scan.nextLine();

				ProdutoPerecivel produtoPerecivel = new ProdutoPerecivel(nome, precoPerecivel, quantidadePerecivel,
						dataVencimento);

				new ProdutoPerecivelDAO().cadastrarProduto(produtoPerecivel);
				System.out.println("Produto Perecivel inserido com sucesso!");
				break;

			case 2:
				System.out.println("### Inserir Produto Nao Perecivel ###");

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

				ProdutoNaoPerecivel produtoNaoPerecivel = new ProdutoNaoPerecivel(nomeNaoPerecivel, precoNaoPerecivel,
						quantidadeNaoPerecivel, material);

				new ProdutoNaoPerecivelDAO().cadastrarProduto(produtoNaoPerecivel);
				System.out.println("Produto Nao Perecivel inserido com sucesso\n");
				break;

			case 3:
				System.out.println("### Consultar Produtos ###");

				System.out.println("### Produtos Nao Pereciveis ###");
				for (ProdutoNaoPerecivelDAO c : novPn.read()) {
					System.out.println(c);
				}
				System.out.println();
				System.out.println("### Produtos Pereciveis ###");

				for (ProdutoPerecivelDAO b : novP.read()) {
					System.out.println(b);
				}
				System.out.println();
				break;

			case 4:
				System.out.println("Informe o tipo do produto");
				System.out.println("1 - Perecivel | 2 - Nao Perecivel: ");
				int tipoProduto = scan.nextInt();
				scan.nextLine();
				if (tipoProduto == 1) {
					System.out.println("### Digite o codigo do produto ###");
					int codigoEstoque = scan.nextInt();
					scan.nextLine();
					System.out.println("Digite a quantidade a ser adicionada ao estoque: ");
					int quantidadeAdicionar = scan.nextInt();

					ProdutoPerecivelDAO novo = new ProdutoPerecivelDAO();

					novo.setCodigo(codigoEstoque);
					novo.setQuantidadeEmEstoque(quantidadeAdicionar);
					new ProdutoPerecivelDAO().atualizarProdutoDAO(novo);

				} else {
					System.out.println("### Digite o codigo do produto ###");
					int codigoEstoque = scan.nextInt();
					scan.nextLine();
					System.out.println("Digite a quantidade a ser adicionada ao estoque: ");
					int quantidadeAdicionar = scan.nextInt();

					ProdutoNaoPerecivelDAO novo = new ProdutoNaoPerecivelDAO();

					novo.setCodigo(codigoEstoque);
					novo.setQuantidadeEmEstoque(quantidadeAdicionar);
					new ProdutoNaoPerecivelDAO().atualizarProdutoDAO(novo);
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
