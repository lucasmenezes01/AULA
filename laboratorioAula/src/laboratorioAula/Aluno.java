
package laboratorioAula;
public class Aluno {

    /*Esses sao os atributos do aluno*/


    private String nome;
    private int idade;
    private String cpf;
    private String nomeMae;

    private double nota1;
    private double nota2;
    private double nota3;
    private double nota4;


    public double getNota1() {
        return nota1;
    }
    public void setNota1(double nota1) {
        this.nota1 = nota1;
    }
    public double getNota2() {
        return nota2;
    }
    public void setNota2(double nota2) {
        this.nota2 = nota2;
    }
    public double getNota3() {
        return nota3;
    }
    public void setNota3(double nota3) {
        this.nota3 = nota3;
    }
    public double getNota4() {
        return nota4;
    }
    public void setNota4(double nota4) {
        this.nota4 = nota4;
    }







    public Aluno() {

    }
    public Aluno (String nomePadrao) {
        nome = nomePadrao;

    }

    public Aluno(String nomePadrao, int idadePadrao) {
        nome = nomePadrao;
        idade = idadePadrao;

    }

    /*Veremos o metodos SETTRS e GETTRS do Objeto */

    /* recebe dados+ */
    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }
    public int getIdade() {
        return idade;
    }
    public void setIdade(int idade) {
        this.idade = idade;
    }
    public String getCpf() {
        return cpf;
    }
    public void setCpf(String cpf) {
        this.cpf = cpf;
    }
    public String getNomeMae() {
        return nomeMae;
    }
    public void setNomeMae(String nomeMae) {
        this.nomeMae = nomeMae;



    }
    public double getMediaNota () {
        return (nota1 + nota2 + nota3 + nota4) /4;

    }







}

