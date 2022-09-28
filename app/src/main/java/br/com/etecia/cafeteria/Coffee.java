package br.com.etecia.cafeteria;

public class Coffee {

    private String titulo;
    private String preco;
    private int foto;
    private String desc;
    private int Rating;

    public int getFoto() {
        return foto;
    }

    public void setFoto(int foto) {
        this.foto = foto;
    }

    public Coffee(String titulo, String preco, int foto, String desc, int rating) {
        this.titulo = titulo;
        this.foto = foto;
        this.preco = preco;
        this.desc = desc;
        this.Rating = Rating;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getPreco() {
        return preco;
    }

    public void setPreco(String preco) {
        this.preco = preco;
    }

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }

    public int getRating() {
        return Rating;
    }

    public void setRating(int rating) {
        Rating = rating;
    }
}
