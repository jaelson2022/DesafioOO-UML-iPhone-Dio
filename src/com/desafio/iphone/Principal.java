package com.desafio.iphone;

public class Principal {
    public static void main(String[] args) {
        Iphone meuIphone = new Iphone();

        meuIphone.tocarMusicar();
        meuIphone.pausarMusicar();
        meuIphone.ProximaFaixa();

        meuIphone.fazerChamada("61981337821");
        meuIphone.atenderChamada();
        meuIphone.encerrarChamada();

        meuIphone.abrirPagina("www.iphone.com.br");
        meuIphone.adicionarFavoritos("www.iphone.com.br");
        meuIphone.exibirHistorico();
    }
}
