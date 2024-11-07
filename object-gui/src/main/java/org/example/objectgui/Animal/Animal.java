package org.example.objectgui.Animal;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

public class Animal {
    //Atributos
    private String cor;
    private double tamanho;
    private String habitat;
    private String especie;

    //Construtor
    public Animal(String cor, double tamanho, String habitat, String especie) {
        this.cor = cor;
        this.tamanho = tamanho;
        this.habitat = habitat;
        this.especie = especie;
    }
    //Getters e Setters
    public String getCor() { return cor;}
    public void setCor(String cor) { this.cor = cor;}

    public double getTamanho() { return tamanho;}
    public void setTamanho(double tamanho) {this.tamanho = tamanho;}

    public String getHabitat() { return habitat; }
    public void setHabitat(String habitat) { this.habitat = habitat; }

    public String getEspecie() { return especie; }
    public void setEspecie(String especie) { this.especie = especie; }
}