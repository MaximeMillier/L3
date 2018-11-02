#include <stdio.h>
#include <stdlib.h>
#include <pthread.h>
#include <unistd.h>

#define CAPACITE 1000
#define INTERVALLE_INVENTAIRE 1

typedef struct thread_data_t {
	int pid;
	int *stock;
	pthread_mutex_t mutex;
	pthread_cond_t condition;
} thread_data_t ;


int capacite_max_entrepot(){
	return CAPACITE;
}


void *activite_entrepot(void *pdata){

  
  while(1){
	thread_data_t *stockL = (thread_data_t *)(pdata);
	stockL->condition = PTHREAD_COND_INITIALIZER; /* Création de la condition */
	stockL->mutex = PTHREAD_MUTEX_INITIALIZER; /* Création du mutex */
  	printf("Entrepot : \t");
  	printf("Stock actuel = %d\n",*stockL->stock);
   sleep(INTERVALLE_INVENTAIRE);
  }
}


int creation_entrepot(pthread_t *t,thread_data_t *stockL){
  /* Creation de l'entrepot */
  
  stockL->stock = 0;
  return pthread_create(t,
			NULL,
			activite_entrepot,
			stockL);
}
