package groovy_sandbox

class App {

    static void main(String[] args) {
        def clazz = SomeRandomClass.class
        def getMetaClassMethod = clazz.methods.find { method -> method.name == "getMetaClass"}

        // This assertion works with Groovy version 2.* but fails with Groovy version 3.* !
        assert getMetaClassMethod.isSynthetic()
    }
}
