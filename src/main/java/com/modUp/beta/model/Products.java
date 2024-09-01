package com.modUp.beta.model;


import jakarta.persistence.*;

@Entity
public class Products {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "prod_id")
    private Long id;


    @Column(length = 50, nullable = false)
    private String nome;

    @Column(length = 9, nullable = false)
    private Double price;

    @Column(length = 50, nullable = false)
    private String description;




    //getters and setters


    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    //to string

    @Override
    public String toString() {
        return "Products{" +
                "id=" + id +
                ", nome='" + nome + '\'' +
                ", price=" + price +
                ", description='" + description + '\'' +
                '}';
    }
}
