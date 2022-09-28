package br.com.etecia.cafeteria;

public class Muffin {

    private String titulo;
    private int foto;
    private String desc;
    private int Rating;

    public String getPreco() {
        return preco;
    }

    public void setPreco(String preco) {
        this.preco = preco;
    }

    private String preco;

    public Muffin(String titulo, int foto, String desc, String rating, String preco) {
        this.titulo = titulo;
        this.foto = foto;
        this.desc = desc;
        this.Rating = Rating;
        this.preco = preco;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public int getFoto() {
        return foto;
    }

    public void setFoto(int foto) {
        this.foto = foto;
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
