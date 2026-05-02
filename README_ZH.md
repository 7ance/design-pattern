# 设计模式

基于 GoF（四人帮）经典设计模式的 Java 示例实现。每个模式都以独立包的形式提供简洁、可运行的示例。

## 环境要求

- JDK 25+
- Maven 3.9+

## 快速开始

```bash
# 编译
mvn compile

# 运行所有测试
mvn test
```

## 模式目录

### 创建型

| 模式 | 包名 |
|---|---|
| 抽象工厂 | `creational.abstractfactory` |
| 建造者 | `creational.builder` |
| 工厂方法 | `creational.factorymethod` |
| 原型 | `creational.prototype` |
| 单例 | `creational.singleton` |

### 结构型

| 模式 | 包名 |
|---|---|
| 适配器 | `structural.adapter` |
| 桥接 | `structural.bridge` |
| 组合 | `structural.composite` |
| 装饰器 | `structural.decorator` |
| 外观 | `structural.facade` |
| 享元 | `structural.flyweight` |
| 代理 | `structural.proxy` |

### 行为型

| 模式 | 包名 |
|---|---|
| 责任链 | `behavioral.chainofresponsibility` |
| 命令 | `behavioral.command` |
| 迭代器 | `behavioral.iterator` |
| 中介者 | `behavioral.mediator` |
| 备忘录 | `behavioral.memento` |
| 观察者 | `behavioral.observer` |
| 状态 | `behavioral.state` |
| 策略 | `behavioral.strategy` |
| 模板方法 | `behavioral.templatemethod` |
| 访问者 | `behavioral.visitor` |

## 项目结构

```
src/main/java/cn/lance/designpattern/
├── creational/
│   ├── abstractfactory/
│   ├── builder/
│   ├── factorymethod/
│   ├── prototype/
│   └── singleton/
├── structural/
│   ├── adapter/
│   ├── bridge/
│   ├── composite/
│   ├── decorator/
│   ├── facade/
│   ├── flyweight/
│   └── proxy/
└── behavioral/
    ├── chainofresponsibility/
    ├── command/
    ├── iterator/
    ├── mediator/
    ├── memento/
    ├── observer/
    ├── state/
    ├── strategy/
    ├── templatemethod/
    └── visitor/
```

测试代码遵循相同结构，位于 `src/test/java/cn/lance/designpattern/`，每个类别对应一个测试类：`CreationalPatternTest`、`StructuralPatternTest`、`BehavioralPatternTest`。

## 依赖

- [Lombok](https://projectlombok.org) — 减少样板代码
- [Jackson 3.x](https://github.com/FasterXML/jackson) — JSON 序列化
- [Apache Commons Lang 3](https://commons.apache.org/proper/commons-lang/) — 通用工具
- [Logback](https://logback.qos.ch) — 日志
- [JUnit Jupiter 6.x](https://junit.org/junit5/) — 测试框架
