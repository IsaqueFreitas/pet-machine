import java.util.Scanner;

public class Main {

    private static final Scanner sc = new Scanner(System.in);

    private static final MaquinaPet maquinaPet = new MaquinaPet();

    public static void main(String[] args) {


        int opcao;

        do {
            System.out.println("======Escolha uma das opções======");
            System.out.println("1- Dar banho no pet");
            System.out.println("2- Abastecer a máquina com água");
            System.out.println("3- Abastecer a máquina com shampoo");
            System.out.println("4- Verificar água da máquina");
            System.out.println("5- Verificar shampoo da máquina");
            System.out.println("6- Verificar se tem pet no banho");
            System.out.println("7- Colocar pet na máquina");
            System.out.println("8- Retirar pet da máquina");
            System.out.println("9- Limpar máquina");
            System.out.println("0- Sair");
            opcao = sc.nextInt();

            switch (opcao) {
                case 1 -> maquinaPet.tomaBanho();
                case 2 -> setAgua();
                case 3 -> setShampoo();
                case 4 -> verificarAgua();
                case 5 -> verificarShampoo();
                case 6 -> checarseTemPetnaMaquina();
                case 7 -> setPet();
                case 8 -> maquinaPet.removerPet();
                case 9 -> maquinaPet.lavar();
                case 0 -> System.exit(0);
                default -> System.out.println("Opção inválida");
            }


        } while (true);

    }


            private static void setAgua() {
            System.out.println("Tentando adicionar água na máquina.");
            maquinaPet.addAgua();
        }

        private static void setShampoo() {
            System.out.println("Tentando adicionar shampoo na máquina.");
            maquinaPet.addShampoo();
        }




    private static void verificarAgua() {
        var valor = maquinaPet.getAgua();
        System.out.println("A máquina está no momento com " + valor + "listro(s) de água");
    }

    private static void verificarShampoo() {
        var valor = maquinaPet.getShampoo();
        System.out.println("A máquina está no momento com " + valor + "listro(s) de shampoo");

    }

    private static void checarseTemPetnaMaquina() {
        var temPet = maquinaPet.temPet();

        System.out.println(temPet ? "Tem pet" : "Tem maquina");
    }

    public static void setPet() {

        sc.nextLine();
        String nome = "";
        while (nome == null || nome.isEmpty()) {
            System.out.println("Digite o nome do pet: ");
            nome = sc.nextLine();
        }


        Pet pet = new Pet(nome);
        boolean sucesso = maquinaPet.setPet(pet);
        if (sucesso) {
            System.out.println("O pet " + pet.getNome() + " foi adicionado com sucesso na máquina!");
        }
    }




    }


