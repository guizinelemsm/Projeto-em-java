package Projeto01.domain;

public class Regiao {
    private String nome;
    private Time[] times;

    public Regiao(String nome) {
        this.nome = nome;
    }

    public void imprime(){
        System.out.println("Região: "+this.nome);
        System.out.println("Times");
        if (times == null){
            System.out.println("Nenhuma organização cadastrada");
        }else{
            for (Time time : times) {
                System.out.println(time.getNome());
            }

        }
    }
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Time[] getTimes() {
        return times;
    }

    public void setTimes(Time[] times) {
        this.times = times;
    }
}
