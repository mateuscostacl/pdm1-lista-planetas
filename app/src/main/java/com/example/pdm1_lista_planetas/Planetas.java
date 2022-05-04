package com.example.pdm1_lista_planetas;

import com.example.pdm1_lista_planetas.model.Planeta;

import java.util.ArrayList;
import java.util.List;

public class Planetas {

    public static List<Planeta> popular(){
        List<Planeta> planetaList = new ArrayList<>();

        Planeta planeta1 = new Planeta();
        planeta1.setId(0);
        planeta1.setNome("Mercúrio");
        planeta1.setDescricao("Mercúrio é o planeta mais próximo do Sol. É um planeta rochoso, destituído de satélites e atmosfera rarefeita, sendo também o menor planeta do sistema solar. Por esse motivo apresenta temperaturas bastante elevadas de aproximadamente 400°C.");
        planeta1.setImagemNome("mercurio");
        planetaList.add(planeta1);

        Planeta planeta2 = new Planeta();
        planeta2.setId(1);
        planeta2.setNome("Vênus");
        planeta2.setDescricao("Conhecido como “Estrela d’alva”, por causa de seu forte brilho, Vênus tal qual Mercúrio é um planeta que não possui satélite. Visível do nosso planeta, Vênus é o segundo planeta a partir do Sol e o mais perto do planeta Terra.");
        planeta2.setImagemNome("venus");
        planetaList.add(planeta2);

        Planeta planeta3 = new Planeta();
        planeta3.setId(3);
        planeta3.setNome("Terra");
        planeta3.setDescricao("Possui um satélite natural, a Lua, e a quantidade de água existente no planeta, também chamado de “planeta azul”, aliada à quantidade de oxigênio, permitem o desenvolvimento da vida no planeta, sendo o único conhecido do sistema solar com vida humana.");
        planeta3.setImagemNome("terra");
        planetaList.add(planeta3);

        Planeta planeta4 = new Planeta();
        planeta4.setId(4);
        planeta4.setNome("Marte");
        planeta4.setDescricao("Também chamado de “planeta vermelho”, devido às partículas de óxido de ferro presentes em sua atmosfera, o planeta Marte é um planeta rochoso, frio e seco. O movimento de rotação de Marte assemelha-se ao da Terra, com duração de 24 horas e 37 minutos, enquanto que o movimento de translação do planeta é de 687 dias.");
        planeta4.setImagemNome("marte");
        planetaList.add(planeta4);

        Planeta planeta5 = new Planeta();
        planeta5.setId(5);
        planeta5.setNome("Jupter");
        planeta5.setDescricao("Júpiter é o maior planeta do sistema solar. É um planeta gasoso (composto sobretudo por hidrogênio), 1.300 vezes maior do que o planeta Terra. Quinto planeta a partir do Sol, Júpiter possui o maior número de satélites, 79 satélites, e apresenta temperaturas de até -150°C.");
        planeta5.setImagemNome("jupter");
        planetaList.add(planeta5);

        Planeta planeta6 = new Planeta();
        planeta6.setId(6);
        planeta6.setNome("Saturno");
        planeta6.setDescricao("Segundo maior planeta do sistema solar, depois de Júpiter, Saturno é conhecido pelos seus anéis, formados por rocha, gelo e poeira. Sexto planeta a partir do sol, depois de Júpiter, Saturno é o planeta do sistema solar que possui muitos satélites: 82 luas.");
        planeta6.setImagemNome("saturno");
        planetaList.add(planeta6);

        Planeta planeta7 = new Planeta();
        planeta7.setId(7);
        planeta7.setNome("Urano");
        planeta7.setDescricao("Terceiro maior planeta do sistema solar e sétimo planeta a partir do Sol, Urano é um planeta gasoso que apresenta médias de temperatura de -185°C e possui 27 satélites.");
        planeta7.setImagemNome("urano");
        planetaList.add(planeta7);

        Planeta planeta8 = new Planeta();
        planeta8.setId(8);
        planeta8.setNome("Netuno");
        planeta8.setDescricao("Planeta do sistema solar mais distante do Sol e o quarto maior em tamanho, Netuno possui 14 satélites naturais e apresenta temperaturas médias de aproximadamente -200°C.");
        planeta8.setImagemNome("netuno");
        planetaList.add(planeta8);

        return planetaList;
    }
}
