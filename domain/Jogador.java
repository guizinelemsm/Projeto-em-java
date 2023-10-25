package Projeto01.domain;

public class Jogador {
    private String nome;
    private Time time;
    private String funcao;
    private int idade;
    private Agente[] agentes;
    private String nick;
    private String nacionalidade;



    public Jogador(String nome, String nick, String funcao, String nacionalidade, int idade ) {
        this.nome = nome;
        this.funcao = funcao;
        this.idade = idade;
        this.nick = nick;
        this.nacionalidade = nacionalidade;
    }


    public void imprime(){
        System.out.println("----------------------------");
        System.out.println("Nick: "+this.nick);
        System.out.println("Nome: "+this.nome);
        System.out.println("Idade: "+this.idade);
        System.out.println("Função: "+this.funcao);
        System.out.println("Nacionalidade: "+this.nacionalidade);

        if (time == null){
            System.out.println("Free Agent");
        }else{
            System.out.println("Equipe: "+time.getNome());
        }
        System.out.println("Agentes jogados");
        if (agentes == null){
            System.out.println("Nenhum agente cadastrado");}
        for (Agente agente : agentes) {
            System.out.println(agente.getNome());
        }

    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Time getTime() {
        return time;
    }

    public void setTime(Time time) {
        this.time = time;
    }

    public String getFuncao() {
        return funcao;
    }

    public void setFuncao(String funcao) {
        this.funcao = funcao;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public Agente[] getAgentes() {
        return agentes;
    }

    public void setAgentes(Agente[] agentes) {
        this.agentes = agentes;
    }
    public String getNick() {
        return nick;
    }

    public void setNick(String nick) {
        this.nick = nick;
    }
    public String getNacionalidade() {
        return nacionalidade;
    }

    public void setNacionalidade(String nacionalidade) {
        this.nacionalidade = nacionalidade;
    }

}
