package br.net.venson.produto.models;

public class Postagem {
    private String produto;
    private String remetente;
    private String destinatario;

    public Postagem(
            String produto,
            Endereco enderecoDestinatario,
            Endereco enderecoRemetente) {
    }

    public String getProduto() {
        return produto;
    }

    public void setProduto(String produto) {
        this.produto = produto;
    }

    public String getRemetente() {
        return remetente;
    }

    public void setRemetente(String remetente) {
        this.remetente = remetente;
    }

    public String getDestinatario() {
        return destinatario;
    }

    public void setDestinatario(String destinatario) {
        this.destinatario = destinatario;
    }
}
