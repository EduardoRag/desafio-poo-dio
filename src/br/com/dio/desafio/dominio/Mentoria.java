package br.com.dio.desafio.dominio;
import java.time.LocalDate;

public class Mentoria extends Conteudo {
    private LocalDate date;

    @Override
    public double calculateXp() {
        return DEFAULT_XP + 20;
    }

    public LocalDate getDate() {
        return date;
    }

    public void setDate(LocalDate date) {
        this.date = date;
    }

    @Override
    public String toString() {
        return "Mentoria{" +
                "titulo = '" + getTitle()+ '\'' +
                ", descricao = '" + getDescription() + '\'' +
                ", data = " + date +
                '}';
    }
}
