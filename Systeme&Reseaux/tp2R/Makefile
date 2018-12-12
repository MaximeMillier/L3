all : wav.o main.o
	gcc main.o wav.o wav

wav.o : wav.c wav.h
	gcc -c wav.c

main.o : main.c
	gcc -c main.c

clean:
	rm *.o wav

run :
	./wav wav.dmg
