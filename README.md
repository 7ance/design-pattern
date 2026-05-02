# Design Patterns

Design patterns example implementations in Java, based on the Gang of Four (GoF) catalog. Each pattern is presented with a concise, runnable example under a dedicated package.

## Requirements

- JDK 25+
- Maven 3.9+

## Quick Start

```bash
# Compile
mvn compile

# Run all tests
mvn test
```

## Patterns

### Creational

| Pattern | Package |
|---|---|
| Abstract Factory | `creational.abstractfactory` |
| Builder | `creational.builder` |
| Factory Method | `creational.factorymethod` |
| Prototype | `creational.prototype` |
| Singleton | `creational.singleton` |

### Structural

| Pattern | Package |
|---|---|
| Adapter | `structural.adapter` |
| Bridge | `structural.bridge` |
| Composite | `structural.composite` |
| Decorator | `structural.decorator` |
| Facade | `structural.facade` |
| Flyweight | `structural.flyweight` |
| Proxy | `structural.proxy` |

### Behavioral

| Pattern | Package |
|---|---|
| Chain of Responsibility | `behavioral.chainofresponsibility` |
| Command | `behavioral.command` |
| Iterator | `behavioral.iterator` |
| Mediator | `behavioral.mediator` |
| Memento | `behavioral.memento` |
| Observer | `behavioral.observer` |
| State | `behavioral.state` |
| Strategy | `behavioral.strategy` |
| Template Method | `behavioral.templatemethod` |
| Visitor | `behavioral.visitor` |

## Project Structure

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

Tests follow the same structure under `src/test/java/cn/lance/designpattern/`, with one test class per category: `CreationalPatternTest`, `StructuralPatternTest`, and `BehavioralPatternTest`.

## Dependencies

- [Lombok](https://projectlombok.org) — boilerplate reduction
- [Jackson 3.x](https://github.com/FasterXML/jackson) — JSON serialization
- [Apache Commons Lang 3](https://commons.apache.org/proper/commons-lang/) — general utilities
- [Logback](https://logback.qos.ch) — logging
- [JUnit Jupiter 6.x](https://junit.org/junit5/) — testing
