package br.com.dio.desafio.dominio;

import java.util.LinkedHashSet;
import java.util.Objects;
import java.util.Optional;
import java.util.Set;

public class Dev {
    String name;
    Set<Conteudo> registeredContents = new LinkedHashSet<>();
    Set<Conteudo> completedContents = new LinkedHashSet<>();

    public void registerBootcamp (Bootcamp bootcamp) {
        this.registeredContents.addAll(bootcamp.getContents());
        bootcamp.getRegisteredDevs().add(this);
    }

    public void progredir () {
        Optional<Conteudo> conteudo = this.registeredContents.stream().findFirst();
        if(conteudo.isPresent()) {
            this.completedContents.add(conteudo.get());
            this.registeredContents.remove(conteudo.get());
        } else {
            System.err.println("Você não está inscrito em nenhum conteúdo!");
        }
    }

    public double calculateTotalXp () {
        return this.completedContents.stream().mapToDouble(Conteudo::calculateXp).sum();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Set<Conteudo> getRegisteredContents() {
        return registeredContents;
    }

    public void setRegisteredContents(Set<Conteudo> registeredContents) {
        this.registeredContents = registeredContents;
    }

    public Set<Conteudo> getCompletedContents() {
        return completedContents;
    }

    public void setCompletedContents(Set<Conteudo> completedContents) {
        this.completedContents = completedContents;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Dev dev = (Dev) o;
        return Objects.equals(name, dev.name) && Objects.equals(registeredContents, dev.registeredContents) && Objects.equals(completedContents, dev.completedContents);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, registeredContents, completedContents);
    }


}
