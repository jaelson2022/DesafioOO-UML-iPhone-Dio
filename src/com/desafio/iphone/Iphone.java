package com.desafio.iphone;

import com.desafio.iphone.aparelhotelefonico.AparelhoTelefonico;
import com.desafio.iphone.navegadorinternet.NavegadorInternet;
import com.desafio.iphone.reprodutormusical.ReprodutorMusical;

import java.util.ArrayList;
import java.util.List;

public class Iphone implements ReprodutorMusical, AparelhoTelefonico, NavegadorInternet {
    private List<String> historico = new ArrayList<>();
    private List<String> favoritos = new ArrayList<>();

    @Override
    public void tocarMusicar() {
        System.out.println("Reproduzindo música...");

    }

    @Override
    public void pausarMusicar() {
        System.out.println("Música pausada.");

    }

    @Override
    public void ProximaFaixa() {
        System.out.println("Tocando a próxima faixa.");

    }

    @Override
    public void fazerChamada(String numero) {
        System.out.println("Chamando " + numero + "...");

    }

    @Override
    public void atenderChamada() {
        System.out.println("Chamada atendida.");

    }

    @Override
    public void encerrarChamada() {
        System.out.println("Chamada encerrada.");

    }

    @Override
    public void abrirPagina(String url) {
        System.out.println("Abrindo página: " + url);
        historico.add(url);

    }

    @Override
    public void adicionarFavoritos(String url) {
        System.out.println("Adicionando " + url + " aos favoritos.");
        favoritos.add(url);

    }

    @Override
    public void exibirHistorico() {
        System.out.println("Histórico de navegação:");
        for (String pagina : historico) {
            System.out.println(pagina);
        }

    }



}
