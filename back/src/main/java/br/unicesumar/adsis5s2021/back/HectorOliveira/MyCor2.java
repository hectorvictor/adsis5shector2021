package br.unicesumar.adsis5s2021.back.HectorOliveira;
import java.util.UUID;

public class MyCor2 {
    private String id;
    private String sigla;
    private String nome;


    public MyCor2() {
        this.id = UUID.randomUUID().toString();
    }

    public MyCor2( String sigla, String nome) {
        this();
        this.sigla = sigla;
        this.nome = nome;
    }
    
   

    public String getId() {
        return this.id;
    }
    

    public String getSigla() {
        return this.sigla;
    }    

    public String getNome() {
        return this.nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setSigla(String sigla) {
        this.sigla = sigla;
    }
    

}
