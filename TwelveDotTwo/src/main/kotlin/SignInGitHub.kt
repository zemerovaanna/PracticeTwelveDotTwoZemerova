class SignInGitHub:UserGitHub() {
    override var username:String = "name"
    override var password: String = "12345"
    override var countRepositories: UByte
        get() = 0u
        set(value) {}

    override fun UserInformation() {
        println("Пользователь: $username")
        print("Количество репозиториев: $countRepositories")
    }
}