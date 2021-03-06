# 命令模式

将一个请求封装为一个对象，使发出请求的责任和执行请求的责任分隔开。这样两者之间通过命令对象进行 沟通，这样方便将命令对象进行存储，传递，调用，增加和管理。

### 结构

- 抽象命令类角色 Command: 定义命令的接口，声明执行的方法。
- 具体命令角色 Concrete Command: 具体的命令，实现命令接口。通常会持有接收者，并调用 接收者的功能来完成命令要执行的操作。
- 实现者/接收者角色 Receiver: 接收者，真正执行命令的对象，任何类都可能成为一个接收者，只要它 能够实现命令要求实现的相应功能。
- 调用者/请求者角色 Invoker: 要求命令对象执行请求，通常会持有命令对象，可以持有很多命令对象。 这个是客户端真正触发命令并要求执行相应操作的地方，也就是说相当于使用命令对象的入口。


### 适用场景

- 系统需要将请求调用者和请求接收者解耦，使得他们不直接交互。
- 系统需要在不同的时间指定请求，将请求排队和执行请求。
- 系统需要支持命令的撤销undo操作和恢复redo操作。