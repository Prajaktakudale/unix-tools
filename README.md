unix-tools
================================================================
This is Repo contain different unix-tools. This tools will provide basic functionality of tools.

##WC

This is Word Count unix tool,which counts number of words,characters and lines from given text.

`PkWc.sh filename`

This command will give number of lines,words,characters.

You Have to give whole path of text file.

    Example: PkWc.sh a.txt will give 6 25 100 a.txt as an output.

##Head

This is Head tool,which by default displays top 10 lines of file.

`PkHead.sh filename`

This command will give top 10 lines from the text file given

    Example: `PkHead.sh a.txt` will print 10 lines from a.txt file.

`PkHead.sh [no.of lines] filename`

This will give the no. of lines specified in given command.

    Example: PkHead.sh -4 a.txt will display top 4 lines from a.txt file.
    
RELESE NOTE : -If file not have minimun 10 lines it will throw error. 
-If order of command change it wiil fail.

##Tail

This is Tail tool,which by default displays 10 lines of file from bottom.

`PkTail.sh filename`

This command will give bottom 10 lines from the text file given

    Example: PkTail.sh a.txt will print 10 lines from a.txt file.

`PkTail.sh [no.of lines] filename`

This will give the no. of lines specified in given command.

    Example: Pktail.sh -4 a.txt will display bottom 4 lines from a.txt file.
    
RELESE NOTE : If file not have minimun 10 lines it will throw error.
-If order of command change it wiil fail.

##Uniq

This is Uniq tool,which discards one of successive identical lines from input but it will not discard indentical lines if they are not successive.

`PkUniq.sh filename`

This command will display all lines in file and discards duplicate lines if they are one after another.

    Example: PkUniq.sh a.txt will give all unique lines in a.txt file.

##Cut

This is Cut tool,which cuts and gives the output according to given command.

`PkCut.sh filename -[fieldno.]`

This command will display the contents of specified field

    Example: PkCut.sh a.txt -2  will display the content in 2nd field of a.txt file.

`PkCut.sh  filename -[fieldno] -d[delimiter]`

This will display contents cut by given delimeter for that field.

    Example: PkCut.sh names.txt -1 " " will display contents with single space of 1st fiels from a.txt

RELESE NOTE: Its will give error if order of command change.

##Sort

This is Sort tool, which sorts the given content with given option.

`PkSort.sh filename`

This command will give all content in the file in sorted order.

    Example: PkSort.sh a.txt will display all contents from a.txt file in sorted order.


##ReduceSpace

This tool reduces multiple spaces from file and replaces it with single space.
`PkReduceSpaces.sh filename`


Example: PkReduceSpaces.sh a.txt will reduce all multiple spaces from file names.txt. 
