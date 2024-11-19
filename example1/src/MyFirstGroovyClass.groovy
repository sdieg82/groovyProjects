class MyFirstGroovyClass {
    static void main (args){
       def name='diego'
        println "el nombre es ${name}"
        def x=10
        def X=10
        println x+X
        def (String a, int b, Double c)=[30,40,50]
        println(a)
        println(b)
        println(c)
        println(++x)
    }
}
