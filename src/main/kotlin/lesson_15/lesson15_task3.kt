package lesson_15

abstract class forumMembers {
    abstract val name: String
    abstract fun readForum()
    abstract fun writeMessage(message: String, messages: MutableList<String>)
}

class User(override val name: String) : forumMembers() {

    override fun readForum() {
        println("Пользователь $name читает форум")
    }

    override fun writeMessage(message: String, messages: MutableList<String>) {
        messages.add(message)
        println("Пользователь $name пишет сообщение: $message")
    }
}

class Administrator(override val name: String) : forumMembers() {

    override fun readForum() {
        println("Администратор $name читает форум")
    }

    override fun writeMessage(message: String, messages: MutableList<String>) {
        messages.add(message)
        println("Администратор $name пишет сообщение: $message")
    }

    fun deleteMessage(messageId: Int, messages: MutableList<String>, user: User) {
        val deletedMessage = messages[messageId]
        println("Администратор $name удаляет сообщение \"$deletedMessage\" пользователя ${user.name}")
    }

    fun deleteUser(user: User) {
        println("Администратор $name удаляет пользователя ${user.name}")
    }
}

fun main() {
    val messages = mutableListOf<String>()

    val user1 = User("Вася")
    val user2 = User("Петя")
    val admin = Administrator("Коля")

    user1.writeMessage("админ редиска", messages)
    user2.readForum()
    admin.readForum()
    admin.writeMessage("Недопустимо!", messages)
    admin.deleteMessage(0, messages, user1)
    admin.deleteUser(user1)

}