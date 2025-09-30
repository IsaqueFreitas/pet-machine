public class MaquinaPet {

    private boolean limpo = true;

    private int agua = 30;

    private int shampoo = 10;

    private Pet pet;


    public void tomaBanho() {
        if (this.pet == null) {

            System.out.println("Não tem pet na máquina para iniciar o banho");

            return;
        }

        this.agua -=10;
        this.shampoo -=2;

        pet.setLimpo(true);
        System.out.println("o pet" + pet.getNome() + "está limpo");
    }

    public void addAgua() {
        if (agua == 30) {

            System.out.println("A capacidade de água da máquina está no máximo");
            return;
        }
        agua +=2;

    }

    public void addShampoo() {
        if (agua == 10) {

            System.out.println("A capacidade de shampoo da máquina está no máximo");
            return;
        }
        agua +=2;

    }

    public int getAgua() {
        return agua;
    }

    public int getShampoo() {
        return shampoo;
    }

    public boolean temPet() {
    return pet != null;

    }

    public boolean setPet(Pet pet) {
        if (!this.limpo) {
            System.out.println("A máquina está suja, para colocar o pet é necessário limpar.");
            return false;

        }

          if (temPet()) {

            System.out.println("O pet " + this.pet.getNome() + " Está na máquina nesse momento");
              return false;
        }

        this.pet = pet;
        return true;
    }

    public void removerPet() {
      this.limpo = this.pet.isLimpo();

        System.out.println("o pet " + this.pet.getNome() + " está limpo");

      this.pet = null;


    }

    public void lavar() {

        this.agua -=10;
        this.shampoo -=2;
        this.limpo = true;
        System.out.println("Máquina está limpa");

    }

}
