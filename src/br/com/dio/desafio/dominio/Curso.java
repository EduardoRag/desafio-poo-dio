package br.com.dio.desafio.dominio;

public class Curso extends Conteudo {

    int workLoad;

    public int getWorkLoad() {
        return workLoad;
    }

    @Override
    public double calculateXp() {
        return DEFAULT_XP * workLoad;
    }

    public void setWorkLoad(int workLoad) {
        this.workLoad = workLoad;
    }

    @Override
    public String toString() {
        return "Curso{" +
                "titulo='" + getTitle() + '\'' +
                ", descricao='" + getDescription() + '\'' +
                ", cargaHoraria=" + workLoad + "h" +
                '}';
    }
}
