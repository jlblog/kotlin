package chapter.ch03.step6

/**
 * https://try.kotlinlang.org
 * MakingYourCodeTidyLocalFunctionsAndExtensions2
 */

class User3 (val id: Int, val name: String, val address: String)

fun saveUser3(user: User3){
    fun validate(value: String, fieldName: String){
        if (value.isEmpty()){
            throw IllegalArgumentException(
                    "Can't save user ${user.id}:" +
                            "empty $fieldName"
            )
        }
    }

    validate(user.name, "Name")
    validate(user.address, "Address")

    // Save user to the database
}

fun main(args: Array<String>) {
    saveUser3(User3(1, "", ""))
}