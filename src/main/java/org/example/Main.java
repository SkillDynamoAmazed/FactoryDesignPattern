package org.example;

public class Main {

    public static void main(String[] args) {
   //I this we have specified that which object we want and explicitily we are calling it
        //We must create a class or some factory that deliverfs these objects to us
        //So that we are not taking any responsibility or client doesn't take any responisibitly to create
        //class it just specify the name and rest is being handled by factory....


//        Os android = new Android();
//        Os ios = new Ios();
//        Os windows = new Windows();
//        android.spec();
//        ios.spec();
//        windows.spec();

        //Removing the above code and rewriting the whole scenario by using factory design pattern...


        Factory factory = new Factory();
        Os android = factory.getInstance("android");
        Os ios = factory.getInstance("ios");
        Os windows = factory.getInstance("windows");
        android.spec();
        ios.spec();
        windows.spec();

    }

    }
