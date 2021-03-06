# ev3dev-lang-java

*EV3Dev-lang-Java* is project to learn Java and create software for Mindstorms Robots using hardware supported by [EV3Dev](http://www.ev3dev.org/) 
& the [LeJOS](http://www.lejos.org/) way.

[![License: MIT](https://img.shields.io/badge/License-MIT-blue.svg)](/LICENSE)
[![Travis CI](https://travis-ci.org/ev3dev-lang-java/ev3dev-lang-java.svg?branch=develop)](https://travis-ci.org/ev3dev-lang-java/ev3dev-lang-java)

![ScreenShot](https://raw.githubusercontent.com/jabrena/ev3dev-lang-java/master/docs/images/theThreeAmigos.jpg)

## Introduction

In Lego Mindstorms ecosystem, the default solution to develop Java software for Lego Mindstorms 
was [LeJOS](http://www.lejos.org/) but now exists one alternative, `EV3Dev-lang-java` a Java project 
running on the top of [EV3Dev](http://www.ev3dev.org/).  

Lego Mindstorms ecosystem is `a nice educational way to learn Java programming in general and Robotics in particular`. 
Now, it is possible to install a complete Linux distro in the third generation of the product and others companies like 
[Mindsensors](http://www.mindsensors.com/) & [Dexter Industries](https://www.dexterindustries.com/) has released products
 which interact with Sensors & Actuators from Lego ecosystem and that boards can use the Power of the popular board 
 [Raspberry Pi 3](https://www.raspberrypi.org/)
 
But, with the help of `EV3Dev`, it is possible to have the same Linux experience for multiple boards. 
So... why not develop a Java library for that Linux Distro? The answer is `EV3Dev-lang-java`. 
The project, takes the good things of both worlds: EV3Dev with the complete linux experience 
and LeJOS with the rich local navigation stack and the remote support in the future.

**What Debian versions are supported with this library?**

The library has support for `Debian Jessie` & `Debian Stretch`. 
In this release, we have added initial support for `Debian Stretch`, so the Brick support is limited,
only `EV3 Brick` is supported for this Debian distro but soon you will have all Bricks supported but 
in the other hand, you have the possibility to use OpenJDK 10 and it is amazing! 

If you need to use any Raspberry Pi Boards, I recommend to use the latest stable `EV3Dev` release: [Debian Jessie](http://www.ev3dev.org/downloads/)

**What is the hardware platforms supported in this project?**

Using the same `Java` objects, it is possible to deploy the software for Robots on EV3 Brick, Raspberry Pi 3 with BrickPi 3 & PiStorms.

| # | Element  | LEGO                                                                                     | Raspberry Pi 3 Model B+          |
|---|----------|------------------------------------------------------------------------------------------|----------------------------------|
| 1 | Hardware | EV3 Brick                                                                                | BrickPi+  BrickPi3 PiStorms      |
| 2 | SoC      | Sitara Processor AM1808                                                                  | Broadcom BCM2837 RISC de 64 bits |
| 3 | CPU      | ARM9 300MHz                                                                              | 4× ARM Cortex-A53, 1.4GHz        |
| 4 | RAM      | 16KB of Instruction Cache,  16KB of Data Cache,  8KB of RAM (Vector Table),  64KB of ROM | 1GB LPDDR2 (900 MHz)             |
| 5 | USB      | 1x                                                                                       | 4x                               |
| 6 | Year     | 2010                                                                                     | 2018                             |

## Project architecture

The project has been designed with the following solution in mind:

| # | Layer            | Option 1                                   | Option 2                |
|---|------------------|--------------------------------------------|-------------------------|
| 1 | Platforms        | EV3 BrickPi BrickPi3 PiStorms              | EV3                     |
| 2 | OS               | Debian Jessie                              | Debian Stretch          |
| 3 | JVM              | Oracle JRE 8                               | OpenJDK JRI 10          |
| 4 | EV3Dev Kernel    | 4.4.47-19-ev3dev-ev3 4.4.47-19-ev3dev-rpi2 | 4.9.58-ev3dev-1.6.0-ev3 |
| 5 | ev3dev-lang-java | 0.7.0                                      | 2.3.0                   |

**Note:** At the moment, the whole solution is scalable until the next `LEGO Mindstorms` product estimated 
for next January of 2020. 

## Features included in the whole project

**Java features**

* OpenJDK Java 10 support for EV3 Brick, Brickpi+/PiStorms + Raspberry Pi 3
* Java profiling tools Support ([Oracle mission control](http://www.oracle.com/technetwork/java/javaseproducts/mission-control/java-mission-control-1998576.html) & [JConsole](http://docs.oracle.com/javase/7/docs/technotes/guides/management/jconsole.html))
* Logging support based on [SLF4J](https://www.slf4j.org/)
* Centralized logs with [Kibana](https://www.elastic.co/products/kibana)

**Platform features**

* Support for EV3 Brick, PiStorms v1/v2, BrickPi+ & BrickPi 3

**Lego Mindstorms features**

* Regulated Motor Support
* Unregulated Motor Support
* Sensor Support (EV3 sensors)
* Sounds Support
* EV3 LCD Support

**Robotics**

* Automatic installation of [OpenCV](http://opencv.org/)
* [eSpeak](http://espeak.sourceforge.net/) TTS (Text to speech) Support
* [LeJOS Sensor filter](http://sourceforge.net/p/lejos/wiki/Sensor%20Framework/) Support
* [LeJOS local navigation stack](https://github.com/ev3dev-lang-java/lejos-navigation) Support
* [RPLidar A1/A2](https://github.com/ev3dev-lang-java/usb-devices) (2D Lidar) Support

## Subprojects
  
Stable projects:
 
- [EV3Dev-lang-java](https://github.com/ev3dev-lang-java/ev3dev-lang-java): Low level interation with EV3Dev
- [lejos-commons](https://github.com/ev3dev-lang-java/lejos-commons): LeJOS interfaces & utilities
- [Installer](https://github.com/ev3dev-lang-java/installer): A set of Bash scripts to automate some operations with your brick
- [Template project](https://github.com/ev3dev-lang-java/template_project_gradle): A Gradle project ready to test the project
- [Examples](https://github.com/ev3dev-lang-java/examples): A repository with several examples about the usage of this project

Incubator projects:

- [lejos-navigation](https://github.com/ev3dev-lang-java/lejos-navigation): LeJOS navigation stack
- [Battery Monitor](https://github.com/ev3dev-lang-java/batteryMonitor): A battery monitor to protect your hardware against low battery levels
- [OpenJDK for EV3](https://github.com/ev3dev-lang-java/openjdk-ev3): A custom OpenJDK JRE build for EV3
- [Usb Devices](https://github.com/ev3dev-lang-java/usb-devices): A library to use Arduino, Grove Sensors, GPS, IMU, LIDAR, and more devices...
- [ROS](https://github.com/ev3dev-lang-java/ros): A library to publish Sensor data to ROS for SLAM purposes

## Roadmap

Review the `backlog` to follow the features in course:

https://github.com/ev3dev-lang-java/ev3dev-lang-java/issues

## Getting Started

Take a look the documentation to use the project:

http://ev3dev-lang-java.github.io/docs/support/index.html

and use this easy template project with examples to use the project in a quick way:

https://github.com/ev3dev-lang-java/template_project_gradle

## Examples

Take a look the following repository to learn how to use this project:

https://github.com/ev3dev-lang-java/examples

## Videos

- https://www.youtube.com/watch?v=Gxew3aNH6ks
- https://www.youtube.com/watch?v=1d9q24aNMHQ
- https://www.youtube.com/watch?v=SIwG848ODI8

## UML Design

![ScreenShot](https://github.com/ev3dev-lang-java/ev3dev-lang-java/raw/develop/docs/uml/graph.png)

**Known issues:**

- https://github.com/ev3dev-lang-java/ev3dev-lang-java/issues/121

## References:

* LeJOS: http://www.lejos.org/
* LeJOS Git: http://sourceforge.net/p/lejos/ev3/code/ci/master/tree/ 
* LeJOS Forum: https://lejos.sourceforge.io/forum/search.php?keywords=ev3dev&sid=8642d9d1b361bcfdcdeabb26db89e632
* EV3Dev: http://www.ev3dev.org/
* EV3Dev // Getting Started: http://www.ev3dev.org/docs/getting-started/
* EVEDev // Linux Kernel Drivers: http://docs.ev3dev.org/projects/lego-linux-drivers/en/ev3dev-jessie/
* Dexter Forum: http://forum.dexterindustries.com/search?q=java

