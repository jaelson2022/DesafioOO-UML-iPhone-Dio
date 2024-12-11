package com.desafio.iphone.navegadorinternet;

public interface NavegadorInternet {
    void abrirPagina(String url);
    void adicionarFavoritos(String url);
    void exibirHistorico();
}
