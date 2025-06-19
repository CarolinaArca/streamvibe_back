package com.streamvibe.api.models.Filme;

public record DadosCadastroFilme (  
    String nome,
    String estudio,
    double duracao,
    String imagem,
    Genero genero,
    String diretor,
    String elenco,
    String sinopse) {
    

}
