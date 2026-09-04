package com.example.demo1.mates;

public class Mate {
    public  int cebadas;
    private boolean estado;

    public Mate(int cebada, boolean estado) {
        this.cebadas = cebada;
        this.estado = estado;
    }

    public Mate() {
    }

    public int getCebadas() {
        return cebadas;
    }

    public void setCebadas(int cebadas) {
        this.cebadas = cebadas;
    }

    public boolean isEstado() {
        return estado;
    }

    public void setEstado(boolean estado) {
        this.estado = estado;
    }

    public void cebar (){
        if (cebadas != 0){
            if(estado == true){
                System.out.println("Cuidado el mate esta lleno"+"\n");
            }else{
                estado = true;
            }
        } else {
            System.out.println("El mate esta lavado"+"\n");
        }
    }

    public void beber (){
        if (estado == true){
            cebadas--;
            System.out.println("Tomaste un mate"+"\n");
            estado=false;
        }else{
            System.out.println("Ruido de mate"+"\n");
        }

    }



}
