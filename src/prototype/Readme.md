Primarily used for copying existing objects without making code depedent on their classes.

Use-Cases

Use the pattern to clone objects which are passed by 3rd party libraries for which we dont have access to implementation classes.

Use the pattern when you want to reduce the number of subclasses that only differ in the way they initialize their respective objects. 