#include <stdlib.h>
#include <stdio.h>
#include <sys/types.h>
#include <string.h>
#define MAX 256

int main(int argc, char * argv[]){

	printf("Please type in commands : ");

	char input[MAX];
	fgets(input, MAX, stdin);

	char* commands;
	commands = strtok(input, "&&");
	
	while(commands != 0){

		system(commands);
		commands= strtok(0, "&&");
	}

	return 0;
}
