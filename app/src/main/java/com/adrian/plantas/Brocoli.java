package com.adrian.plantas;

public class Brocoli {

    private short edad = 4;
    // Atributo final
    public final int peso = 7;
    //Atributo voaltile
    volatile boolean vegetal = true;
    // Atributo constante
    public static final byte HOJAS = 12;
    // Atributo constante
    private static final float TIEMPO_COSECHA = 30.2f;

    public Brocoli() {}

    public Brocoli(int tipo) {}

    // Metodo constante
    public static final void nutrirce() {}

    static void crecer(float tiempo) {}

    // Metodo final
    final int florecer() {

        return 34;
    }

    private void florecer(float tiempo) {}

    public final void respirar(double tiempo) {}
}
