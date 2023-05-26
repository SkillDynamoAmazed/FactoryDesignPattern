package org.example;

public class Factory {

    public Os getInstance(String str){

        if(str.equals("android")){
            return new Android();
        }
        else if(str.equals("ios")){
            return new Ios();
        }
        else if(str.equals("windows")){
            return new Windows();
        }
        return null;

    }
}
