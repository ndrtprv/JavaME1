package com.example.myapplication;

public class BeerExpert {
    public String getBrands(String beerType) {
        String result = "";
        switch (beerType) {
            case "Light":
                result = "Pale Lager, American Lager, Maibock";
                break;
            case "Amber":
                result = "Pale Ale, Vienna Lager";
                break;
            case "Brown":
                result = "Doppelbock, English Brown Ale";
                break;
            case "Dark": result = "German Schwarzbier";
        }
        return result;
    }
}