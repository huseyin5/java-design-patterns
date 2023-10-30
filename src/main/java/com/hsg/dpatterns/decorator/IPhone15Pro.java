package com.hsg.dpatterns.decorator;

public class IPhone15Pro extends PhoneDecorator {
    public IPhone15Pro(Phone basicPhone) {
        super(basicPhone);
    }

    @Override
    public String getName() {
        return super.getName() + " 15 Pro";
    }

    @Override
    public int cameraCount() {
        return super.cameraCount() + 1;
    }

    @Override
    public double getPrice() {
        return super.getPrice() + 200;
    }

    public String extraMethod() {
        return "Naturel Titanium";
    }
}
