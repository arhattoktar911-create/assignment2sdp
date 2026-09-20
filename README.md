# Assignment 2 - Software Design Patterns

## Student Information

- **Name:** Arkat
- **Group:** SE 2522
- **Repository:** assignment2sdp

## Project Description

This project demonstrates two important object-oriented design patterns:

1. **Factory Method**
2. **Abstract Factory**

The application combines both patterns in a simple logistics delivery system with a cross-platform user interface.

## Factory Method

The Factory Method pattern is used to create different types of transport without changing the common delivery logic.

The project contains:

- `Transport` - common transport interface
- `Truck` - road transport
- `Ship` - sea transport
- `Logistics` - abstract creator
- `RoadLogistics` - creates `Truck`
- `SeaLogistics` - creates `Ship`

The `Logistics` class contains the common `planDelivery()` method, while subclasses decide which transport object should be created.

## Abstract Factory

The Abstract Factory pattern is used to create compatible user interface components for different operating systems.

The project contains:

- `Button` - button interface
- `Checkbox` - checkbox interface
- `WindowsButton`
- `WindowsCheckbox`
- `MacOSButton`
- `MacOSCheckbox`
- `GUIFactory` - abstract factory interface
- `WindowsFactory`
- `MacOSFactory`

Each concrete factory creates a consistent family of UI components.

## Application Integration

The `DeliveryApplication` class integrates both design patterns.

The application:

1. Creates the selected logistics creator.
2. Creates the selected UI factory.
3. Creates UI components through the Abstract Factory.
4. Plans delivery through the Factory Method.
5. Demonstrates the selected transport and UI components.

The `Main` class reads the user's input and selects the required logistics mode and UI platform.

## Supported Options

### Delivery modes

- `ROAD` - uses `Truck`
- `SEA` - uses `Ship`

### UI platforms

- `WINDOWS`
- `MACOS`

The application also validates unsupported and empty input.

## Project Structure

```text
src/
├── logistics/
│   ├── Logistics.java
│   ├── RoadLogistics.java
│   ├── SeaLogistics.java
│   ├── Ship.java
│   ├── Transport.java
│   └── Truck.java
│
├── ui/
│   ├── Button.java
│   ├── Checkbox.java
│   ├── GUIFactory.java
│   ├── MacOSButton.java
│   ├── MacOSCheckbox.java
│   ├── MacOSFactory.java
│   ├── WindowsButton.java
│   ├── WindowsCheckbox.java
│   └── WindowsFactory.java
│
├── DeliveryApplication.java
└── Main.java


