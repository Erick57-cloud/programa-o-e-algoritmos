public class Curso{
    private int codigo;
    private int duracao;
    private String cursonome;

    public Curso (int codigo, String cursonome, int duracao){
        this.codigo = codigo;
        this.cursonome = cursonome;
        this.duracao = duracao;
    }
    public int getCodigo(){
        return codigo;
    }
    public int getDuracao(){
        return duracao;
    }
    public String getCursonome(){
        return cursonome;
    }
}