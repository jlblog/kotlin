package chapter.ch03.step6

/**
 * https://try.kotlinlang.org
 * MakingYourCodeTidyLocalFunctionsAndExtensions1
 */

class User2(val id: Int, val name: String, val address: String)

fun saveUser2(user: User2) {

    fun validate(user: User2,
                 value: String,
                 fieldName: String){
        if(value.isEmpty()) {
            throw IllegalArgumentException(
                    "can't save user ${user.id}: empty $fieldName"
            )
        }
    }

    validate(user, user.name, "Name")
    validate(user, user.address, "Address")
    // Save user to the database
}

fun main(args: Array<String>) {
    saveUser2(User2(1, "name", "address"))
}