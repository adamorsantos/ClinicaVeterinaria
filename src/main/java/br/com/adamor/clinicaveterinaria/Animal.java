package br.com.adamor.clinicaveterinaria;

public class Animal {
    
    final private int id;
    private String nome;
    private int idade;
    private String sexo;

    public Animal(int id, String nome, int idade, String sexo) {
        this.id = id;
        this.nome = nome;
        this.idade = idade;
        this.sexo = sexo;
    }

    public int getId() {
        return id;
    }
    
    public String getNome() {
        return nome;
    }
     
    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }
    
    public void setIdade(int idade) {
        this.idade = idade;
    }

    public String getSexo() {
        return sexo;
    }
    
    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    @Override
    public String toString() {
        return "Animal{" + "nome=" + nome + ", idade=" + idade + ", sexo=" + sexo + '}';
    }
  
    
}
