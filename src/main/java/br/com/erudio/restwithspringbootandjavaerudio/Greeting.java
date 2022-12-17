package br.com.erudio.restwithspringbootandjavaerudio;

public class Greeting {

    private final long id;
    private final String content;

    public Greeting (long variavelA, String variavelB) {
        this.id = variavelA;
        this.content = variavelB;
    }

    public long getId() {
        return id;
    }

    public String getContent() {
        return content;
    }
}
