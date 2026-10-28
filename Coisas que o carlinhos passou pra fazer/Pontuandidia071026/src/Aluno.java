import javax.swing.*;

public class Aluno{
private int matricula;
private int idade;
private String nome;
private Curso curso;
public Aluno (int matricula, String nome, int idade){
    this.matricula = matricula;
    this.nome = nome;
    this.idade = idade;
}
public void setCurso(Curso curso){
    this.curso = curso;
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
    public void exibirDados() {
        JOptionPane.showMessageDialog(null, "Informações do Aluno:"
               + "\nSeu nome: " + this.nome
                        + "\nIdade: " + this.idade
                        + "\nCodigo da Matrícula: " + this.matricula);
    }
}