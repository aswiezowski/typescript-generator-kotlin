package typescript

sealed class SealedClass {

    abstract val optionalList: List<String>?

    abstract val optional: String?
}

data class SealedClassImpl(override val optionalList: List<String>?, override val optional: String?) : SealedClass() {

}

interface Interface {

    fun getValue(): String?
}

class InterfaceImpl : Interface {

    private val stringValue: String? = null
    override fun getValue(): String? {
        return stringValue
    }
}