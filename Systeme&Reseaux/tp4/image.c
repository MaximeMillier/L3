#include <stdlib.h>
#include <stdio.h>
#include "image.h"



image *lecture_image(FILE *f) {
    image *img = malloc(sizeof(image));
    char buff[SIZECOMMENT] = "";

    fscanf(f, "%s\n", img->nm);
    printf("%s\n", img->nm);


    while (fgetc(f) == '#') {
        fgets(buff, SIZECOMMENT, f);
        printf("%s",buff);
    }

    char c = fgetc(f);
    ungetc(c,f);
    ungetc(c,f);

    fscanf(f,"%d %d",&(img->nl),&(img->nc));
    printf(" %d %d\n", img->nl,img->nc);

    fscanf(f,"%d",&(img->ng));
    printf("%d\n", img->ng);

    while(fgets(buff, SIZECOMMENT, f) != NULL) {
        fscanf(f, "%s", img->pixels);
        //printf("%s\n", img->pixels);
    }
    return img;
}



void ecriture_image(FILE *f, image *img){


}





void inverse_image(image *img){

    for (int i = 0; i < (img->nl * img->nc); ++i) {
        img->pixels[i] = img->ng - img->pixels[i];
    }
}
