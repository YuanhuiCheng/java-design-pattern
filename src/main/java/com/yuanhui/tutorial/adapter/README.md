# 适配器模式

**参考：** [通俗易通的23种设计模式教学之适配器模式](https://www.bilibili.com/video/BV1mc411h719?p=7)

将一个类的接口转换成客户希望的另外一个接口，Adapter模式使得原本由于接口不兼容而不能一起工作的那些类可以一起工作。

### 角色分析

- 目标接口：客户所期待的接口，目标可以是具体的或抽象的类，也可以是接口 (NetToUsb)。
- 需要适配的类：需要适配的类或适配者类 (Adaptee)。
- 适配器：通过包装一个需要适配的对象，把原接口转换成目标对象 (Adapter)。

### 适用场景

- InputStreamReader(inputStream) // 字节流->字符流
- SpringMVC dispatch servlet adapter
- GUI编程