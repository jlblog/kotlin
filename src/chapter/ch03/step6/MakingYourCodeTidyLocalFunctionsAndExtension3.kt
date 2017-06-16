package chapter.ch03.step6

/**
 * https://try.kotlinlang.org
 * MakingYourCodeTidyLocalFunctionsAndExtensions3
 */

class User4(val id: Int, val name: String, val address: String)

fun User4.validateBeforeSave() {
    fun validate(value: String, fieldName: String){
        if (value.isEmpty()){
            throw IllegalArgumentException(
                    "Can't save user $id: empty $fieldName"
            )
        }
    }

    validate(name, "Name")
    validate(address, "Address")
}

fun saveUser4(user: User4){
    user.validateBeforeSave()

    // Save user to the database
}

fun main(args: Array<String>) {
    saveUser4(User4(1, "", ""))
}
