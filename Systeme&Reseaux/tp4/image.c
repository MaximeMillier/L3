#include <stdlib.h>
#include <stdio.h>
#include <string.h>
#include "image.h"



image *lecture_image(FILE *f) {
    image *img = malloc(sizeof(image));
    char *buff = malloc(sizeof(char)*SIZECOMMENT);
    int c;

    fscanf(f, "%s\n", img->nm);
    //printf("%s\n", img->nm);


    while ((c =fgetc(f)) == '#') {
        fgets(buff, SIZECOMMENT, f);
        strcat(img->comments, "#");
        strcat(img->comments,buff);
    }
    //printf("%s",img->comments);


    ungetc(c,f);

    fscanf(f,"%d %d",&(img->nl),&(img->nc));
    //printf("%d %d\n", img->nl,img->nc);

    fscanf(f,"%d",&(img->ng));
    //printf("%d\n", img->ng);

    int i = 0;
    while(fscanf(f,"%hhu",&(img->pixels[i]))==1){
        //printf("%u\n", img->pixels[i]);
        i++;

    }
    return img;
}



void ecriture_image(FILE *f, image *I){
    char *buff = malloc(sizeof(char)*100);
    //nm
    fprintf(f,"%s\n",I->nm);

    //comments
#if 0
    buff=strtok(I->comments,"#");
    while(buff!=NULL){
        fprintf(f,"#%s\n",buff);
        buff=strtok(NULL,"#");
    }
#endif

    // nl,nc
    fprintf(f,"%d %d\n",I->nl,I->nc);

    //ng
    fprintf(f,"%d\n",I->ng);

    //pixels
    for(int k=0;k<(I->nl*I->nc);k++)  {
        fprintf(f,"%d\n",I->pixels[k]);
    }
}





void inverse_image(image *img){

    for (int i = 0; i < (img->nl * img->nc); ++i) {
        img->pixels[i] = img->ng - img->pixels[i];
    }
}
