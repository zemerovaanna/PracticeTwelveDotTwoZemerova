import kotlinx.coroutines.*
suspend fun main(){
    try
    {
        var userOne: SignInGitHub = SignInGitHub()

        print("Введите никнейм первого пользователя:")
        userOne.username = readln()

        print("Введите пароль первого пользователя:")
        userOne.password = readln()

        print("Введите количество репозиториев первого пользователя:")
        userOne.countRepositories = readln()!!.toUByte()


        var userTwo: SignInGitHub = SignInGitHub()

        print("Введите никнейм второго пользователя:")
        userTwo.username = readln()

        print("Введите пароль второго пользователя:")
        userTwo.password = readln()

        print("Введите количество репозиториев второго пользователя:")
        userTwo.countRepositories = readln()!!.toUByte()


        var userThree: SignInGitHub = SignInGitHub()

        print("Введите никнейм третьего пользователя:")
        userThree.username = readln()

        print("Введите пароль третьего пользователя:")
        userThree.password = readln()

        print("Введите количество репозиториев третьего пользователя:")
        userThree.countRepositories = readln()!!.toUByte()

        for(i in 0..5){
            delay(500L)
        }
        if (userOne.countRepositories > userTwo.countRepositories && userOne.countRepositories > userThree.countRepositories)
        {
            println(userOne.UserInformation())
            println()

            if (userTwo.countRepositories > userThree.countRepositories)
            {
                println(userTwo.UserInformation())
                println()

                println(userThree.UserInformation())
            }
            else
            {
                println(userThree.UserInformation())
                println()

                println(userTwo.UserInformation())
            }
        }
        else if (userTwo.countRepositories > userOne.countRepositories && userTwo.countRepositories > userThree.countRepositories)
        {
            println(userTwo.UserInformation())
            println()

            if (userThree.countRepositories > userOne.countRepositories)
            {
                println(userThree.UserInformation())
                println()

                println(userOne.UserInformation())
            }
            else
            {
                println(userOne.UserInformation())
                println()

                println(userThree.UserInformation())
            }
        }
        else if (userThree.countRepositories > userOne.countRepositories && userThree.countRepositories > userTwo.countRepositories)
        {
            println(userThree.UserInformation())
            println()

            if (userOne.countRepositories > userTwo.countRepositories)
            {
                println(userOne.UserInformation())
                println()

                println(userTwo.UserInformation())
            }
            else
            {
                println(userTwo.UserInformation())
                println()

                println(userOne.UserInformation())
            }
        }
    }
    catch(e: Exception){
        println("Ошибка ввода")
    }
}