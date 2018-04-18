Example usage: java Tree -help

The program displays a graphical representation of the directory.

usage: java Tree [-path, -file, -read, -help]

-print \<file>          print listing of the directory to stdout.

-file \<path> \<output> print listing of the directory to a file.

-read \<path>           read from a given file and print result to stdout.

-help                   print help message.

######################################################################################
Show directory and subdirectories files.

java Tree -print ~/Dev/Android/globus/Java/Task4/

+ /Users/user/Dev/Android/globus/Java/Task4
 + .idea
 + out
 + Output.txt
 + src
 + Task4.iml
+ /Users/user/Dev/Android/globus/Java/Task4/.idea
 + description.html
 + misc.xml
 + modules.xml
 + project-template.xml
 + uiDesigner.xml
 + workspace.xml
+ /Users/user/Dev/Android/globus/Java/Task4/out
 + production
+ /Users/user/Dev/Android/globus/Java/Task4/out/production
 + Task4
+ /Users/user/Dev/Android/globus/Java/Task4/out/production/Task4
 + Output.txt
 + README.md
 + Tree.class
 + Utils
+ /Users/user/Dev/Android/globus/Java/Task4/out/production/Task4/Utils
 + Cli.class
 + FileUtils.class
 + Travers.class
+ /Users/user/Dev/Android/globus/Java/Task4/src
 + Output.txt
 + README.md
 + Tree.java
 + Utils
+ /Users/user/Dev/Android/globus/Java/Task4/src/Utils
 + Cli.java
 + FileUtils.java
 + Travers.java

######################################################################################
Save directory and subdirectories files to an output file then print this file.

java Tree -file ~/Dev/Android/globus/Java/Task4/ ../../../src/Output.txt

java Tree -read ../../../src/Output.txt

+ /Users/user/Dev/Android/globus/Java/Task4
 + .idea
 + out
 + Output.txt
 + src
 + Task4.iml
+ /Users/user/Dev/Android/globus/Java/Task4/.idea
 + description.html
 + misc.xml
 + modules.xml
 + project-template.xml
 + uiDesigner.xml
 + workspace.xml
+ /Users/user/Dev/Android/globus/Java/Task4/out
 + production
+ /Users/user/Dev/Android/globus/Java/Task4/out/production
 + Task4
+ /Users/user/Dev/Android/globus/Java/Task4/out/production/Task4
 + Output.txt
 + README.md
 + Tree.class
 + Utils
+ /Users/user/Dev/Android/globus/Java/Task4/out/production/Task4/Utils
 + Cli.class
 + FileUtils.class
 + Travers.class
+ /Users/user/Dev/Android/globus/Java/Task4/src
 + Output.txt
 + README.md
 + Tree.java
 + Utils
+ /Users/user/Dev/Android/globus/Java/Task4/src/Utils
 + Cli.java
 + FileUtils.java
 + Travers.java