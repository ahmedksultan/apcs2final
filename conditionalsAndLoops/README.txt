CONDITIONALS and LOOPS
Difficulty: 1

------------------------------------------

PART I - Ordered.java

% javac Ordered.java
% java Ordered x y z
  > x, y, z valid integer values

Running this program returns a boolean value.
The program returns true if x, y, and z are in strict order, and false otherwise.
(example: x < y < z OR x > y > z) >>> TRUE

------------------------------------------

PART II - RGBtoCMYK.java

% javac RGBtoCMYK.java
% java RGBtoCMYK r g b
  > r, g, b valid integer values btwn 0-255 (inclusive)

Running this program returns the CMYK values for the RGB color described in the parameters.

------------------------------------------

PART III - Checkerboard.java

% javac Checkerboard.java
% java Checkerboard N
  > N valid positive integer value

Running this program creates a checkerboard (N rows by 2N columns) of alternating "*" and " " characters.

------------------------------------------

PART IVa - RandomWalker.java

% javac RandomWalker.java
% java RandomWalker N
  > N valid positive integer value

Running this program emulates a random walker taking N steps, returning positions on an xy plane.

------------------------------------------

PART IVb - RandomWalkers.java

% javac RandomWalkers.java
% java RandomWalkers N T
  > N, T valid positive integer values

Running this program emulates T random walker taking N steps, returning the mean squared distance.
