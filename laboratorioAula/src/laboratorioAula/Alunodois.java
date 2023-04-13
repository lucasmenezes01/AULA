package laboratorioAula;
import laboratorioAula.Aluno;
public class Alunodois {
    public static void main(String[] args) {

        /*objeto ainda nao existe na memoria*/

        /* new Aluno() é uma instancia ( criacao de Objeto )*/
        /* aluno1 é uma refencia para o objeto aluno*/

        Aluno aluno1 = new Aluno(); /*Aqui sera joao*/




        aluno1.setNome("OWEN CONSULTAS");
        aluno1.setIdade(50);
        aluno1.setNomeMae("IVANICE");
        aluno1.setCpf("111222333-44");

        aluno1.setNota1(9.9);
        aluno1.setNota2(7.7);
        aluno1.setNota3(3.3);
        aluno1.setNota4(10.0);

        System.out.println("Media da nota é= " + aluno1.getMediaNota());

        System.out.println("Nome é: " + aluno1.getNome ());
        System.out.println("Idade é " + aluno1.getIdade());
        System.out.println("Nome da Mae é : " + aluno1.getNomeMae());

        /*agora temos um objeto*/
        Aluno aluno2 = new Aluno(); /*Aqui sera Lucas*/
        aluno2.setNome("OWEN 2");
        aluno2.setIdade(20);
        aluno2.setNomeMae("Ivanice 2");
        aluno2.setCpf("111222333-44");

        System.out.println("O nome do aluno é = " + aluno2.getNome());
        System.out.println("Idade do aluno é = " + aluno2.getIdade());
        System.out.println("Nome da mae é = " + aluno2.getNomeMae());
        System.out.println("CPF é = " + aluno2.getCpf());









        Aluno aluno3 = new Aluno();/*Aqui sera Pedro*/

        Aluno aluno4 = new Aluno("Maria");

        Aluno aluno5 = new Aluno("jose" , 50);





    }
}
