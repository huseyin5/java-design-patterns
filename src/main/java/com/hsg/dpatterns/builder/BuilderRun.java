package com.hsg.dpatterns.builder;

public class BuilderRun {
    public static void main(String[] args) {
        ProductLombok lombokInstance = ProductLombok.builder().id(12L).name("Name").description("Desc").build();

        System.out.println(lombokInstance);
    }
}
