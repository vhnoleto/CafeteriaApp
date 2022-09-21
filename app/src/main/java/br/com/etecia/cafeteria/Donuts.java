package br.com.etecia.cafeteria;

public class Donuts {

    private String titulo;
    private int foto;
    private String desc;
    private String Rating;

    public Donuts(String titulo, int foto, String desc, String rating) {
        this.titulo = titulo;
        this.foto = foto;
        this.desc = desc;
        Rating = rating;
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

    public String getRating() {
        return Rating;
    }

    public void setRating(String rating) {
        Rating = rating;
    }
}
