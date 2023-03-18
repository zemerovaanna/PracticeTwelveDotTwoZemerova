abstract class UserGitHub:Security {
    abstract var username:String

    override var password: String
        get() = "12345"
        set(value) {}

    abstract var countRepositories: UByte

    override fun UserInformation(){}
}