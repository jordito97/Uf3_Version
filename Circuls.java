package com.company;

import java.util.ArrayList;

public class Circuls {
    public double radio;//unica propiedad del objeto

    public Circuls(double radio) {//constructor
        super();
        this.radio = radio;
    }

    public void setRadio(float radio) {
        this.radio = radio;
    }

    public double getRadio() {

        return radio;
    }
    public double perimetro(){

        return (3.14*2*this.radio);

    }
    public double area(){
        return (Math.pow(this.radio, 2)*3.14);
    }




}
