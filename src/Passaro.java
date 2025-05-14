public class Passaro implements Planavel{

    private String especie;

    public Passaro(String especie) {
        this.especie = especie;
    }

    //Final em método - não pode ser sobrescrito
    @Override
    public final void voar(){
        System.out.println("Bater as asas");
    }

    public String getEspecie() {
        return especie;
    }

    public void setEspecie(String especie) {
        this.especie = especie;
    }
}
