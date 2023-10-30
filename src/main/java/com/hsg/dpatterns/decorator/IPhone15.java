package com.hsg.dpatterns.decorator;

public class IPhone15 extends PhoneDecorator {
    public IPhone15(Phone basicPhone) {
        super(basicPhone);
    }

    @Override
    public String getName() {
        return super.getName() + " 15";
    }
}
