package io.cucumber.skeleton;

public class Belly {
    private boolean growling;
    private int numberOfCookiesInBelly;

    public Belly(boolean growling) {
        this.growling = growling;
    }

    public void eat(int numberOfCookies) {

    }

    public boolean isGrowling(){
        return growling;
    }
}
