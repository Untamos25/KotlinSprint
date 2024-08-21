package lesson_11

class ForumMember(
    var userId: Int,
    var userName: String,
)

class ForumMessage(
    var authorId: Int,
    var message: String,
)

class Forum(
    var members: MutableList<ForumMember> = mutableListOf(),
    var messages: MutableList<ForumMessage> = mutableListOf(),
    var nextUserId: Int = 0,
) {
    fun createNewUser(name: String): ForumMember {
        val newMember = ForumMember(userId = ++nextUserId, userName = name)
        members.add(newMember)
        return newMember
    }

    fun createNewMessage(id: Int, message: String): ForumMessage? {
        return if (members.any { it.userId == id }) {
            val newMessage = ForumMessage(authorId = id, message = message)
            messages.add(newMessage)
            newMessage
        } else null
    }

    fun printThread() {
        messages.forEach { message ->
            val author = members.find { it.userId == message.authorId }
            println("${author?.userName}: ${message.message}")
        }
    }

}

fun main() {
    val forum = Forum()
    val user1 = forum.createNewUser("Админ")
    val user2 = forum.createNewUser("Пользователь")

    forum.createNewMessage(user1.userId, "Сообщение от админа")
    forum.createNewMessage(user1.userId, "Обратите внимание!")
    forum.createNewMessage(user2.userId, "Сообщение от пользователя")
    forum.createNewMessage(user2.userId, "Пользователь сообщает, что ознакомился с текстом.")

    forum.printThread()
}