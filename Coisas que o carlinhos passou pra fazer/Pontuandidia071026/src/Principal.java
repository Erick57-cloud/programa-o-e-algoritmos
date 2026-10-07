import javax.swing.JOptionPane;

public class Principal {
    public static void main(String []args){
        String opcaocurso = "Opção dos cursos:"
                +"\n Desenvolvimente de Sistemas: 200"//1095
                +"\n Administração: 300"//1095
                +"\n Recursos Humanos: 400"//1095
                +"\n Contabilidade: 500"//1095
                +"\n Serviços juridicos: 600";//1095
        JOptionPane.showMessageDialog(null,opcaocurso);
        String nome = JOptionPane.showInputDialog(null,"Digite seu nome");
        int idade = Integer.parseInt(JOptionPane.showInputDialog(null,"Digite sua idade"));
        int matricula = Integer.parseInt(JOptionPane.showInputDialog(null,"Digite o codigo de sua matricula"));


    }
}
