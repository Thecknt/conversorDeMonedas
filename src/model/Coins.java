package model;

import com.google.gson.annotations.SerializedName;

public class Coins {
    //"base_code"
    @SerializedName("base_code")
    private String coinIn;
    //"target_code"
    @SerializedName("target_code")
    private String coinOut;
    //"conversion_result"
    @SerializedName("conversion_result")
    private Double result;

    public Coins(CoinsApi coinsApi) {
        this.coinIn = coinsApi.base_code();
        this.coinOut = coinsApi.target_code();
        this.result =Double.valueOf(coinsApi.conversion_result());
    }

    public String getCoinIn() {
        return coinIn;
    }

    public void setCoinIn(String coinIn) {
        this.coinIn = coinIn;
    }

    public String getCoinOut() {
        return coinOut;
    }

    public void setCoinOut(String coinOut) {
        this.coinOut = coinOut;
    }

    public Double getAmount() {
        return result;
    }

    public void setAmount(Double amount) {
        this.result = amount;
    }

    @Override
    public String toString() {
        return "La conversion resultante es: " +
                "\nMoneda Ingresada: " + coinIn  +
                "\nMoneda a convertir: " + coinOut  +
                "\nResultado de la conversion: " + result +" "+coinOut;
    }
}
