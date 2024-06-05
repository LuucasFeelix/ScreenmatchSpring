package br.com.alura.ScreenmatchSpring.Model;

import com.fasterxml.jackson.annotation.JsonAlias;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public record DadosSerie(@JsonAlias("Title") String Titulo,
                         @JsonAlias("totalSeasons")Integer qtdTemporada,
                         @JsonAlias("imdbRating") String Avaliacao){

}
