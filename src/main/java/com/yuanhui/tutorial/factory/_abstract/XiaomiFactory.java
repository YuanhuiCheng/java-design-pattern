package com.yuanhui.tutorial.factory._abstract;

public class XiaomiFactory implements ProductFactory {
    @Override
    public PhoneProduct phoneProduct() {
        return new XiaomiPhone();
    }

    @Override
    public RouterProduct routerProduct() {
        return new XiaomiRouter();
    }
}
