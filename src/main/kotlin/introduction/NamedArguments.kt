package introduction

/*
* Make the function return the list in a JSON format
* (for example, [a, b, c])
* by specifying only two arguments.
* */
fun joinOptions(options: Collection<String>) =
    options.joinToString(prefix = "[", postfix = "]")
