package br.com.dio.desafio.dominio;

public abstract class Conteudo {

    protected final double DEFAULT_XP = 10;
    private String title;
    private String description;

    public abstract double calculateXp();

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    @Override
    public String toString() {
        return "Conteudo{" +
                "XP_PADRAO=" + DEFAULT_XP +
                ", titulo='" + title + '\'' +
                ", descricao='" + description + '\'' +
                '}';
    }
}

