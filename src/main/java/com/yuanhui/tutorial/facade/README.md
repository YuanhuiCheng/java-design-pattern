# 外观模式

**参考：** [全网最全23种Java设计模式之外观模式](https://www.bilibili.com/video/BV1Np4y1z7BU?p=79)

通过为多个复杂的子系统提供一个统一的接口，而使这些子系统更加容易被访问的模式。该模式对外有一个统一接口，外部应用程序
不用关心内部子系统的具体的细节，这样会大大降低应用程序的复杂度，提高了程序的可维护性。

外观模式是迪米特原则的典型应用。

### 结构 

- 外观 (Facade) 角色：为多个子系统对外提供一个共同的接口。
- 子系统 (Subsystem) 角色： 实现系统的部分功能，客户可以通过外观角色访问它。


