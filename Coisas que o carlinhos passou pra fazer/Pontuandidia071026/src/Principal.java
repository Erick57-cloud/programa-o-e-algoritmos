import javax.swing.JOptionPane;

public class Principal {
    public static void main(String[] args) {
        String opcaocurso = "Opção dos cursos:"
                + "\n Desenvolvimente de Sistemas: 200"//1095
                + "\n Administração: 300"//1095
                + "\n Recursos Humanos: 400"//1095
                + "\n Contabilidade: 500";//1095
        JOptionPane.showMessageDialog(null, opcaocurso);
        String nome = JOptionPane.showInputDialog(null, "Digite seu nome");
        int idade = Integer.parseInt(JOptionPane.showInputDialog(null, "Digite sua idade"));
        int matricula = Integer.parseInt(JOptionPane.showInputDialog(null, "Digite o codigo de sua matricula"));


        int codigoCurso = Integer.parseInt(JOptionPane.showInputDialog(null, "Digite o codigo do curso:"));
        String nomecurso;
        if (codigoCurso == 200) {
            nomecurso = "Desenvolvimento de Sistemas";
        } else if (codigoCurso == 300) {
            nomecurso = "Administração";
        } else if (codigoCurso == 400) {
            nomecurso = "Recursos Humanos";
        } else if (codigoCurso == 500) {
            nomecurso = "Contabilidade";
        } else {
            JOptionPane.showMessageDialog(null, "Codigo de curso invalido");
            return;
        }
        int duracao = Integer.parseInt(JOptionPane.showInputDialog(null, "Digite a duração do curso (em anos)"));
        Curso curso = new Curso(codigoCurso, nomecurso, duracao);
        Aluno aluno =  new Aluno(matricula, nome, idade);
        aluno.setCurso(curso);
        JOptionPane.showMessageDialog(null,"Hackeando informações do aluno do banco de dados...");
        aluno.exibirDados();
        JOptionPane.showMessageDialog(null,"Hackeando informações do curso do banco de dados...");
        curso.exibirDados();
        JOptionPane.showMessageDialog(null,"Hackeamento foi um sucesso, diga adeus aos seus 25 centavos hahaha");
    }
}