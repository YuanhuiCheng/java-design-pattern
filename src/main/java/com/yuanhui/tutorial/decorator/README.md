# 装饰者模式

**参考：** [全网最全23种Java设计模式之装饰者模式](https://www.bilibili.com/video/BV1Np4y1z7BU?p=70)

指在不改变现有对象结构的情况下，动态的给对象增加一些职责（即增加其额外功能）的模式。

### 结构

- 抽象结构Component角色：定义一个抽象接口以规范准备接收附加责任的对象。
- 具体构件Concrete Component角色：实现抽象构件，通过装饰角色为其添加职责。
- 抽象装饰Decorator角色：继承或实现抽象构件，并包含具体构件的实例，可以通过其子类扩展具体构件的功能。
- 具体装饰ConcreteDecorator角色：实现抽象装饰的相关方法，并给具体构件对象添加附加的责任。

### JDK中的应用

- IO流中的包装类使用到了装饰者模式：BufferedInputStream, BufferedOutputStream, BufferedReader, BufferedWriter.
- BufferedWriter使用装饰者模式对Writer子实现类进行了增强；添加了缓冲区，提高了写数据的效率。

```java
import java.io.BufferedWriter;
import java.io.FileWriter;

public class Demo {
    public static void main(String[] args) {
        FileWriter fw = new FileWriter("aaa");
        // BufferedWriter继承了Writer又聚合了Writer
        BufferedWriter bw = new BufferedWriter(fw);
        bw.write("hello world");
        bw.close();
    }
}
```

### 静态代理 vs 装饰

- 相同点：
    - 都要实现与目标类相同的业务接口。
    - 在两个类中都要声明目标对象。
    - 都可以在不修改目标类的前提下增强目标方法。

- 不同点：
    - 目的不同。装饰者是为了增强目标对象，静态代理是为了保护和隐藏目标对象。
    - 获取目标对象构建的地方不同。装饰者是由外界传递进来，可以通过构造方法传递。 静态代理是在代理类内部创建，以此来隐藏目标对象。