package com.yuanhui.tutorial.factory._abstract;

public class Client {
    public static void main(String[] args) {
        XiaomiFactory xiaomiFactory = new XiaomiFactory();

        PhoneProduct xiaomiPhone = xiaomiFactory.phoneProduct();
        xiaomiPhone.call();

        RouterProduct xiaomiRouter = xiaomiFactory.routerProduct();
        xiaomiRouter.openWifi();

        HuaweiFactory huaweiFactory = new HuaweiFactory();

        PhoneProduct huaweiPhone = huaweiFactory.phoneProduct();
        huaweiPhone.message();
    }
}
