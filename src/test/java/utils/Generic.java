package utils;

import models.*;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import lombok.Data;



@Data
public class Generic {

    @SerializedName("CampoDePesquisa")
    @Expose
    protected BaseGeneric CampoDePesquisa;

    @SerializedName("CampoDePesquisaSumbit")
    @Expose
    protected BaseGeneric CampoDePesquisaSumbit;

    @SerializedName("SelecioarPrimeiraProdutoDaPesquisa")
    @Expose
    protected BaseGeneric SelecioarPrimeiraProdutoDaPesquisa;
}