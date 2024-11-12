public class Principal {
    public static void main(String[] args) {
        Filme meuFilme = new Filme();
        meuFilme.name = "O poderoso chefão";
        meuFilme.anoDeLancamento = 1970;
        meuFilme.duracaoEmMinutos = 180;
        meuFilme.incluidoNoPlano = true;

        meuFilme.exibeFichaTecnica();
        meuFilme.avalia(8);
        meuFilme.avalia(5);
        meuFilme.avalia(10);

        System.out.println("Total de avaliações " + meuFilme.getTotalDeAvaliacao());
        System.out.println(meuFilme.pegaMedia());
    }
}
