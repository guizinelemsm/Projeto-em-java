package Projeto01.test;

import Projeto01.domain.Agente;
import Projeto01.domain.Jogador;
import Projeto01.domain.Regiao;
import Projeto01.domain.Time;

public class ValorantTest01 {
    public static void main(String[] args) {
        Regiao regiao = new Regiao("VCT Américas");
        Jogador jogador01 = new Jogador("Cauan Pereira", "Cauanzin", "Iniciador", "Brasileiro", 18);
        Jogador jogador02 = new Jogador("Felipe Basso", "Less", "Sentinela", "Brasileiro", 18);
        Jogador jogador03 = new Jogador("Matias", "Saddhak", "Flex", "Argentino", 26);
        Jogador jogador04 = new Jogador("Arthur Andrade", "Tuyz", "Controlador", "Brasileiro", 20);
        Jogador jogador05 = new Jogador("Erick Santos", "Aspas", "Duelista", "Brasileiro", 20);
        Jogador jogador06 = new Jogador("Francisco Aravena", "KiNgg", "Flex", "Chileno", 21);
        Jogador jogador07 = new Jogador("Roberto Francisco", "Mazino", "Controlador", "Chileno", 22);
        Jogador jogador08 = new Jogador("Agustin Ibarra", "Nozwerr", "Iniciador", "Argentino", 25);
        Jogador jogador09 = new Jogador("Ian Botsch", "Tex", "Sentinela", "Americano", 24);
        Time time01 = new Time("LOUD");
        Time time02 = new Time("Leviathan");
        Agente agente01 = new Agente("Jett", "Duelista");
        Agente agente02 = new Agente("Reyna", "Duelista");
        Agente agente03 = new Agente("Phoenix", "Duelista");
        Agente agente04 = new Agente("Raze", "Duelista");
        Agente agente05 = new Agente("Neon", "Duelista");
        Agente agente06 = new Agente("Yoru", "Duelista");
        Agente agente07 = new Agente("Sova", "Iniciador");
        Agente agente08 = new Agente("Skye", "Iniciador");
        Agente agente09 = new Agente("Fade", "Iniciador");
        Agente agente10 = new Agente("Kayo", "Iniciador");
        Agente agente11 = new Agente("Breach", "Iniciador");
        Agente agente12 = new Agente("Gekko", "Iniciador");
        Agente agente13 = new Agente("Omen", "Controlador");
        Agente agente14 = new Agente("Astra", "Controlador");
        Agente agente15 = new Agente("Brimstone", "Controlador");
        Agente agente16 = new Agente("Harbor", "Controlador");
        Agente agente17 = new Agente("Viper", "Controlador");
        Agente agente18 = new Agente("Killjoy", "Sentinela");
        Agente agente19 = new Agente("Cypher", "Sentinela");
        Agente agente20 = new Agente("DeadLock", "Sentinela");
        Agente agente21 = new Agente("Chamber", "Sentinela");
        Agente agente22 = new Agente("Sage", "Sentinela");

        Agente[] agentes01 = {agente08, agente07, agente09};
        Agente[] agentes02 = {agente18, agente17};
        Agente[] agentes03 = {agente10, agente21, agente12};
        Agente[] agentes04 = {agente16, agente13, agente14};
        Agente[] agentes05 = {agente01, agente05, agente04};
        Agente[] agentes06 = {agente10, agente08, agente17};
        Agente[] agentes07 = {agente15, agente13, agente14};
        Agente[] agentes08 = {agente09, agente07, agente10};
        Agente[] agentes09 = {agente18, agente22, agente19};
        Jogador[] jogadores01 = {jogador01, jogador02, jogador03, jogador04};
        Jogador[] jogadores02 = {jogador05, jogador06, jogador07, jogador08, jogador09};
        Time[] times01 = {time01, time02};

        jogador01.setAgentes(agentes01);
        jogador02.setAgentes(agentes02);
        jogador03.setAgentes(agentes03);
        jogador04.setAgentes(agentes04);
        jogador05.setAgentes(agentes05);
        jogador06.setAgentes(agentes06);
        jogador07.setAgentes(agentes07);
        jogador08.setAgentes(agentes08);
        jogador09.setAgentes(agentes09);
        jogador01.setTime(time01);
        jogador02.setTime(time01);
        jogador03.setTime(time01);
        jogador04.setTime(time01);
        jogador05.setTime(time02);
        jogador06.setTime(time02);
        jogador07.setTime(time02);
        jogador08.setTime(time02);
        jogador09.setTime(time02);
        time01.setRegiao(regiao);
        time02.setRegiao(regiao);
        time01.setJogadores(jogadores01);
        time02.setJogadores(jogadores02);
        regiao.setTimes(times01);


        regiao.imprime();
        System.out.println("##############");
        time01.imprime();
        time02.imprime();
        System.out.println("##############");
        jogador01.imprime();
        jogador02.imprime();
        jogador03.imprime();
        jogador04.imprime();
        jogador05.imprime();
        jogador06.imprime();
        jogador07.imprime();
        jogador08.imprime();
        jogador09.imprime();
    }
}
