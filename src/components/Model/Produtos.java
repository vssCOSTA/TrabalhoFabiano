package components.Model;

import javax.annotation.processing.Generated;

public class Produtos {
    
    @Id
    @Generated(strategy = GenerationType.AUTO)
    private Long id;
    
    private String nome;
    
    private Double preco;
    
    private String descricao;

     public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getnome() {
        return nome;
    }

    public void setnome(String nome) {
        this.nome = nome;
    }

    public Double getpreco() {
        return preco;
    }

    public void setpreco(Double preco) {
        this.preco = preco;
    }

    public String getdescricao() {
        return descricao;
    }

    public void setdescricao(String descricao) {
        this.descricao = descricao;
    }
}
