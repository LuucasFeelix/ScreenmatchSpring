package br.com.alura.ScreenmatchSpring.service;

public interface IConverteDados {
    <T> T obterDados(String json, Class <T> classe);
}
