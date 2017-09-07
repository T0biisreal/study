class postfix
{
}
public static int evaluatePostfix (QueueADT queue)
{ StackADT stack = new ArrayStack();
while ( ! queue.isEmpty())
{ Object data = queue.dequeue();
if (data instanceof Integer)
stack.push (data);
else
{ char operator = ((Character) data).charValue(); 
int second = ((Integer) stack.pop()).intValue(); 
int first = ((Integer) stack.pop()).intValue(); 
if (operator == '+')
stack.push (new Integer (first + second));
else if (operator == '-')
stack.push (new Integer (first - second));
}
}
int valueToReturn = ((Integer) stack.pop()).intValue();
if ( ! stack.isEmpty())
throw new RuntimeException ("too many values");
return valueToReturn;
}
public static QueueADT fromInfixToPostfix (QueueADT queue)
{ QueueADT postfix = new ArrayQueue();

StackADT stack = new ArrayStack();

while ( ! queue.isEmpty())
{ Object data = queue.dequeue();
if (data instanceof Integer)
postfix.enqueue (data);
else 
{ char nonNumber = ((Character) data).charValue(); 
if (nonNumber == ')')
postfix.enqueue (stack.pop());
else if (nonNumber != '(') 
stack.push (data);
}
}
return postfix;
} 

