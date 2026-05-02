# CLAUDE.md

This file provides guidance to Claude Code (claude.ai/code) when working with code in this repository.

## Build & Test Commands
- **Compile**: `mvn compile`
- **Run all tests**: `mvn test`
- **Run a single test class**: `mvn test -Dtest=CreationalPatternTest`
- **Run a single test method**: `mvn test -Dtest=CreationalPatternTest#testSingletonPattern`

## Architecture
This is a Java design patterns example project using Maven with JDK 25 (`maven.compiler.release=25`).

**Root package**: `cn.lance.designpattern`

Patterns are organized into three top-level sub-packages:
- `creational` — abstract factory, builder, factory method, prototype, singleton
- `structural` — adapter, bridge, composite, decorator, facade, flyweight, proxy
- `behavioral` — chain of responsibility, command, iterator, mediator, memento, observer, state, strategy, template method, visitor

Each pattern lives in its own sub-package (e.g., `creational.singleton`, `behavioral.strategy`).

Tests mirror this structure: one test class per category (`CreationalPatternTest`, `StructuralPatternTest`, `BehavioralPatternTest`), with a `@Test` method per pattern (e.g., `testSingletonPattern()`).

## Dependencies
- **Lombok** (`@Slf4j`, `@ToString`) — annotation processor configured in `maven-compiler-plugin`
- **Jackson 3.x** — `tools.jackson.core` (not the older `com.fasterxml` namespace)
- **Apache Commons Lang 3**
- **Logback** for logging
- **JUnit Jupiter 6.x** for tests
