#include<stdio.h>
#include<conio.h>
#include<stdlib.h>

#define MAX 10

   struct stack
    {
      int item[MAX];
      int top;
    };

  typedef struct stack st;

   void createEmptyStack(St *s)
   {
       s->top=-1;
   }

   int isfull(st *s) 
   { 
     if(s->top==MAX-1)
        return 1;
     else
       return 0;
    }

   int  isempty(st *s)
    {
      if(s->top==-1)
        return 1;
      else 
        return 0;
    }
   
    void push(st *s)
   {
     int newitem;
     printf("Enter the new item you want to enter");
     scanf("%d", &newitem);
     if(isfull(s))
     {
       printf("stack is full");
      }
      else 
      {
        s->top++
        s->item[s->top]=newitem;
       }     
    } 
    

   int main()
   {
     int ch;
     int loop;
      loop=1;
      st *s;
     createEmptyStack(s);
    
     do 
       {
        printf("\n stack operation");
	printf("\n 1: push  ");
	printf("\n 2: pop");
	printf("\n 3: Exit")
        printf("\n ****************");
        printf("\n Enter your choice");
        
   


