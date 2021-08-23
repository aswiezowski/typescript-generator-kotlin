package typescript

import org.jetbrains.annotations.Nullable

sealed class Data {
    abstract val optionalList: List<String>?

}

data class DataContent2(override val optionalList: List<String>?):Data(){

}

sealed class DataTest2 {

    abstract val optional: String?

}

data class DataTestContent2(override val optional: String?):DataTest2(){

}

interface DataKotlin{
    fun getValue(): String?;
}

class DataKotlinImpl: DataKotlin{
    private val stringValue: String? = null;
    override fun getValue(): String? {
        return stringValue;
    }
}