package com.ewbugs.elasandroidportfolio;

public class Project {
//to generate constructor right-click after initializing variables in class
    //click 'generate', click 'constructor' and highlight the variable to be used as parameters for your constructor.
    String name;
    String description;
    int image;
    //  R.drawable.name_of_file ( this will be some sort of number, an 'int' as a numeric id for a photo)
    public Project(String name, String description, int image) {
        this.name = name;
        this.description = description;
        this.image = image;
    }


}
