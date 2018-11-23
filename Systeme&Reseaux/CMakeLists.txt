cmake_minimum_required(VERSION 3.12)
project(Systeme_Reseaux C)

set(CMAKE_C_STANDARD 11)

include_directories(tp4)
include_directories(tp5)

add_executable(Systeme_Reseaux
        tp1/concession.c
        tp1/entrepot.c
        tp1/main.c
        tp1/usine.c
        tp2/fork0.c
        tp2/fork1.c
        tp2/orphelin.c
        tp2/sigchld.c
        tp2/wait.c
        tp2/zombie.c
        tp3/shell.c
        tp4/image.c
        tp4/image.h
        tp4/main.c
        tp5/genre.c
        tp5/id3_frame.c
        tp5/id3_frame.h
        tp5/id3_tagheader.c
        tp5/id3_tagheader.h
        tp5/main.c
        tp5/util.c
        tp5/util.h)
