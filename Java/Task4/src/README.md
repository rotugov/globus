Example usage: java Tree -help

The program displays a graphical representation of the directory.

usage: java Tree [-path, -file, -read, -help]

-print <file>         print file to stdout.

-file <path> <output> print output to file.

-read <path>          read from a file.

-help                 print help message.

######################################################################################
Show directory and subdirectories files.

java Tree -print ~/Dev/Android/globus/Java/Task4/

 + /Users/user/Dev/Android/globus/Java/Task4
  + /Users/user/Dev/Android/globus/Java/Task4/.idea
    + description.html
    + misc.xml
    + modules.xml
    + project-template.xml
    + uiDesigner.xml
    + workspace.xml
  + /Users/user/Dev/Android/globus/Java/Task4/out
    + /Users/user/Dev/Android/globus/Java/Task4/out/production
        + /Users/user/Dev/Android/globus/Java/Task4/out/production/Task4
                + Output.txt
                + Tree.class
                + /Users/user/Dev/Android/globus/Java/Task4/out/production/Task4/Utils
                                + Cli.class
                                + FileUtils.class
                                + Travers.class
  + Output.txt
  + /Users/user/Dev/Android/globus/Java/Task4/src
    + Output.txt
    + README.md
    + Tree.java
    + /Users/user/Dev/Android/globus/Java/Task4/src/Utils
        + Cli.java
        + FileUtils.java
        + Travers.java
  + Task4.iml



######################################################################################
Save directory and subdirectories files to a output file then print this file.

java Tree -file ~/Dev/Android/globus/Java/Task4/ ../../../src/Output.txt

java Tree -read ../../../src/Output.txt

 + /Users/user/Dev/Android/globus/Java/Task4
  + /Users/user/Dev/Android/globus/Java/Task4/.idea
    + description.html
    + misc.xml
    + modules.xml
    + project-template.xml
    + uiDesigner.xml
    + workspace.xml
  + /Users/user/Dev/Android/globus/Java/Task4/out
    + /Users/user/Dev/Android/globus/Java/Task4/out/production
        + /Users/user/Dev/Android/globus/Java/Task4/out/production/Task4
                + Output.txt
                + Tree.class
                + /Users/user/Dev/Android/globus/Java/Task4/out/production/Task4/Utils
                                + Cli.class
                                + FileUtils.class
                                + Travers.class
  + Output.txt
  + /Users/user/Dev/Android/globus/Java/Task4/src
    + Output.txt
    + README.md
    + Tree.java
    + /Users/user/Dev/Android/globus/Java/Task4/src/Utils
        + Cli.java
        + FileUtils.java
        + Travers.java
  + Task4.iml
