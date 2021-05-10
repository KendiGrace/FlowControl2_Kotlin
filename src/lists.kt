fun main() {
println(isEven(70))
    println(isEven(89))
    var shop=Products("Apples",2.00,30.00,"groceries")
    println(houseShopping(shop))
    var shop1=Products("Sony Woofer",20.00,7500.00,"electronics")
    println(houseShopping(shop1))
    var shop2=Products("sanitizer",5.00,1200.00,"hygiene")
    println(houseShopping(shop2))
    println(character("Watermelon"))
   println(names(arrayOf("Melante","Lavign","Mickey","Dante","Adrian")))


}
fun isEven(num:Int):Boolean{
    if(num%2==0){
       return true
    }
    else {
        return false
    }
}
data class Products(var name:String,var weight:Double,var price:Double,var category:String)
data class ProductLists(
    var groceriesList:List<Products>,
    var hygieneList:List<Products>,
    var otherList:List<Products>
)
    fun houseShopping(Products:Products):ProductLists{
        var groceriesList=mutableListOf<Products>()
        var hygieneList= mutableListOf<Products>()
        var otherList= mutableListOf<Products>()

        when(Products.category){
            "groceries"->groceriesList.add(Products)
            "hygiene"->hygieneList.add(Products)
            else->otherList.add(Products)
        }
        println(groceriesList)
        println(hygieneList)
        println(otherList)

        var ProductList=ProductLists(groceriesList,hygieneList,otherList)
        return ProductList
    }

fun character(trait:String):String{
    var characteristic=" "
    trait.forEachIndexed{index,character ->
        if(index %2==0 ){
            characteristic+=character
             }
     }
    return characteristic
}
fun names(name:Array<String>):List<String>{
    var names= mutableListOf<String>()
    var count=0
    for(items in name){
        if (items.length%2==0){
            names.add(items)
        }}
    return names

}


