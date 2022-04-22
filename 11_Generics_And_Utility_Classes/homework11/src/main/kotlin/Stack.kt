open class Stack<T> {
    val list = mutableListOf<T>()
    fun push(item: T){
        list.add(item)

    }
    fun pop ():T? {
      if (list.size > 0)
            list.remove(list.last())

        return list.last()

    }
   fun isEmpty():Boolean{
       return list.size < 0
    }

    override fun toString(): String {
        return super.toString()
    }

}