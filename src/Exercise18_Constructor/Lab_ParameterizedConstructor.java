package Exercise18_Constructor;

public class Lab_ParameterizedConstructor {
    String model;
    int year;

    Lab_ParameterizedConstructor()
    {
        model = "Hyundai";
        year = 2024;
    }


    Lab_ParameterizedConstructor(String modelname, int yearcreated)
    {
        this.model = modelname;
        this.year = yearcreated;
        //this is a keyword which reference to the current object
    }

    Lab_ParameterizedConstructor(String modelname) //Constructor overloading
    {
        model = modelname; //Without this keyword, Java can take the value from the constructor
    }
}
