import javax.swing.*;

public class Aluno{
private int matricula;
private int idade;
private String nome;

public Aluno (int matricula, String nome, int idade){
    this.matricula = matricula;
    this.nome = nome;
    this.idade = idade;
}
public int getMatricula(){
    return matricula;
}
public int getIdade(){
    return idade;
    }
    public String getNome(){
    return nome;
    }
    public void ExibicaoDados(){

    }
}