package Projeto01.domain;

public class Time {
    private String nome;
    private Jogador[] jogadores;
    private Regiao regiao;

    public Time(String nome) {
        this.nome = nome;
    }

    public void imprime(){
        System.out.println("------------------");
        System.out.println("Equipe: "+this.nome);
        if (regiao == null){
            System.out.println("Não cadastrado em nenhuma região");
        }else{
        System.out.println("Liga: "+ regiao.getNome());}
        System.out.println("Jogadores");
        if (jogadores == null){
            System.out.println("Nenhum jogador cadastrado");
        }else{
            for (Jogador jogador : jogadores) {
                System.out.println(jogador.getNick()+" "+jogador.getFuncao());
            }

        }
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Jogador[] getJogadores() {
        return jogadores;
    }

    public void setJogadores(Jogador[] jogadores) {
        this.jogadores = jogadores;
    }

    public Regiao getRegiao() {
        return regiao;
    }

    public void setRegiao(Regiao regiao) {
        this.regiao = regiao;
    }
}
