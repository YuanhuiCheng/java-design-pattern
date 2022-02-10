package com.yuanhui.tutorial.factory._abstract;

public class HuaweiFactory implements ProductFactory {
    @Override
    public PhoneProduct phoneProduct() {
        return new HuaweiPhone();
    }

    @Override
    public RouterProduct routerProduct() {
        return new HuaweiRouter();
    }
}
