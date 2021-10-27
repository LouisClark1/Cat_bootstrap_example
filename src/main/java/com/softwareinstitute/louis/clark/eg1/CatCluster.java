package com.softwareinstitute.louis.clark.eg1;
import java.util.ArrayList;
import java.util.List;
//import com.google.gson.Gson;


public class CatCluster {
    private List<Cat> groupOfCats = new ArrayList<>();

    public CatCluster() {
        this.groupOfCats.add(new Cat("Billeh", 7, "Real stinky"));
        this.groupOfCats.add(new Cat("Andeh", 1, "Silky smooth"));
    }

    public List<Cat> getGroupOfCats(){
        return this.groupOfCats;
    }

}
