#!/bin/bash

mkdir -p $(dirname $0)/src/org/libsdl2

swig -Wall -I/usr/include -java -package org.libsdl2 -outdir src/org/libsdl2 sdl2java.i
gcc -I/usr/lib/jvm/java-7-openjdk-amd64/include -fPIC -c sdl2java_wrap.c
ld -fPIC -G sdl2java_wrap.o -o sdl2java_wrap.so
