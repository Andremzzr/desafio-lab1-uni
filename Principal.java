import java.util.Scanner;

public class Principal {
    private static Scanner scanner = new Scanner(System.in);
    private static Loja loja = null;
    private static Produto produto = null;
    
    public static void main(String[] args) {
        int opcao = 0;
        
        while (opcao != 3) {
            System.out.println("\n=== MENU ===");
            System.out.println("(1) criar uma loja");
            System.out.println("(2) criar um produto");
            System.out.println("(3) sair");
            System.out.print("Escolha uma opção: ");

            
            opcao = scanner.nextInt();
            scanner.nextLine();

            switch (opcao) {
                case 1:
                    if (loja == null) {
                        System.out.println("\n--- Cadastro da Loja ---");
                        System.out.print("Nome da loja: ");
                        String nomeLoja = scanner.nextLine();
                        System.out.print("Quantidade de funcionários: ");
                        int qtdFuncionarios = scanner.nextInt();
                        scanner.nextLine();
                        System.out.print("Salário base dos funcionários: ");
                        double salarioBase = scanner.nextDouble();
                        scanner.nextLine();

                        System.out.println("--- Endereço da Loja ---");
                        System.out.print("Nome da rua: ");
                        String rua = scanner.nextLine();
                        System.out.print("Cidade: ");
                        String cidade = scanner.nextLine();
                        System.out.print("Estado: ");
                        String estado = scanner.nextLine();
                        System.out.print("País: ");
                        String pais = scanner.nextLine();
                        System.out.print("CEP: ");
                        String cep = scanner.nextLine();
                        System.out.print("Número: ");
                        String numero = scanner.nextLine();
                        System.out.print("Complemento: ");
                        String complemento = scanner.nextLine();

                        Endereco enderecoLoja = new Endereco(rua, cidade, estado, pais, cep, numero, complemento);

                        System.out.println("--- Data de Fundação ---");
                        System.out.print("Dia da fundação: ");
                        int dia = scanner.nextInt();
                        scanner.nextLine();
                        System.out.print("Mês da fundação: ");
                        int mes = scanner.nextInt();
                        scanner.nextLine();
                        System.out.print("Ano da fundação: ");
                        int ano = scanner.nextInt();
                        scanner.nextLine();

                        Data dataFundacao = new Data(dia, mes, ano);
                        scanner.nextLine();

                        loja = new Loja(nomeLoja, qtdFuncionarios, salarioBase, enderecoLoja, dataFundacao);
                        System.out.println("Loja '" + loja.getNome() + "' criada com sucesso!");

                    } else {
                        System.out.println("erro: Uma loja já foi criada neste cadastro.");
                    }
                    break;

                case 2:
                    if (produto == null) {
                        System.out.println("\n--- Cadastro do Produto ---");

                        System.out.print("Nome do produto: ");
                        String nomeProd = scanner.nextLine();

                        System.out.print("Preço do produto: ");
                        double precoProd = scanner.nextDouble();
                        scanner.nextLine();

                        System.out.println("-- Data de Validade --");
                        System.out.print("Dia da validade: ");
                        int diaV = scanner.nextInt();
                        scanner.nextLine();
                        System.out.print("Mês da validade: ");
                        int mesV = scanner.nextInt();
                        scanner.nextLine();
                        System.out.print("Ano da validade: ");
                        int anoV = scanner.nextInt();
                        scanner.nextLine();

                        Data dataValidade = new Data(diaV, mesV, anoV);

                        produto = new Produto(nomeProd, precoProd, dataValidade);
                        System.out.println("Produto '" + produto.getNome() + "' criado com sucesso!");

                    } else {
                        System.out.println("erro: Um produto já foi criado neste cadastro.");
                    }
                    break;

                case 3:
                    System.out.println("\n Fechando sistema...");
                    break;

                default:
                    if(opcao != 0) {
                        System.out.println("\nOpção inválida. Escolha 1, 2 ou 3.");
                    }
                    break;
            }

            if(loja != null && produto != null) {
                Data dataComparacao = new Data(20, 10, 2023);

                if(produto.estaVencido(dataComparacao)) {
                    System.out.println("\nPRODUTO VENCIDO");
                } else {
                    System.out.println("\nPRODUTO NÃO VENCIDO");
                }
                System.out.println(loja);
            }

        }
            
        } 
        


}
    