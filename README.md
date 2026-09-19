# Factory Method & Abstract Factory

This project demonstrates the Factory Method and Abstract Factory design patterns in Java.

## Part A - Factory Method

The Factory Method part is based on vehicles.

- `Vehicle` - Product interface
- `Car` - Concrete Product
- `Motorcycle` - Concrete Product
- `VehicleFactory` - Creator
- `CarFactory` - Concrete Creator
- `MotorcycleFactory` - Concrete Creator
- `Main` - demonstrates the Factory Method pattern

The concrete factories decide which Vehicle object should be created.

## Part B - Abstract Factory

The Abstract Factory part creates families of related vehicle parts.

Abstract Products:
- `Engine`
- `Wheel`

Car family:
- `CarEngine`
- `CarWheel`
- `CarPartsFactory`

Motorcycle family:
- `MotorcycleEngine`
- `MotorcycleWheel`
- `MotorcyclePartsFactory`

`VehiclePartsFactory` is the Abstract Factory interface.

Each concrete factory creates a consistent family of Engine and Wheel objects.

## How to Run

1. Open the project in IntelliJ IDEA.
2. Make sure Java JDK 17 or later is installed.
3. Run `factorymethod.Main` to test Factory Method.
4. Run `abstractfactory.Main` to test Abstract Factory.

## Factory Method Output

Driving a car
Driving a motorcycle

## Abstract Factory Output

Starting car engine
Rotating car wheel
Starting motorcycle engine
Rotating motorcycle wheel
