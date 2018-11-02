cmake_minimum_required(VERSION 3.12)
project(tp4 C)

set(CMAKE_C_STANDARD 11)

include_directories(.)

add_executable(tp4
        image.c
        image.h
        main.c)
