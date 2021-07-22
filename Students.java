package com.company;

public class Students {
    String Name, Surname;
    int Height, Weight, StudentID;

    Students(String Name, String Surname, int Height,
             int Weight, int StudentID){
        this.Name=Name;
        this.Surname=Surname;
        this.Height=Height;
        this.Weight=Weight;
        this.StudentID=StudentID;
    }

    @Override
    public String toString(){
        return String.format("%12s %10s %10d %2d %5d",
                Surname,Name,Height,Weight,StudentID);
    }
}
