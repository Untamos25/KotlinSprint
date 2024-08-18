package lesson_11

private const val SPEAKING = "разговаривает"
private const val MICROPHONE_OFF = "микрофон выключен"
private const val MUTED = "пользователь заглушен"

class Member(
    var nickname: String,
    var avatarUrl: String,
    var status: String = MICROPHONE_OFF
) {
    fun seeProfile() {
        println("\nИнформация об участнике\n$nickname: $status")
    }
}

class Room(
    var id: Int,
    var roomName: String,
    var roomCoverUrl: String,
    var members: MutableList<Member>,
) {
    fun checkRoomStatus() {
        println(
            """
            Информация о комнате:
            id: $id
            Название: $roomName
            Адрес обложки: $roomCoverUrl
            Список участников: ${members.joinToString(", ") { it.nickname }}
        """.trimIndent()
        )
    }

    fun addMember(member: Member) {
        members.add(member)
        println("\nУчастник ${member.nickname} довален в комнату \"$roomName\".\n")
    }

    fun updateMemberStatus(member: Member) {
        println(
            """
            
            Укажите новый статус пользователя (введите номер пункта):
            1 - Разговаривает
            2 - Микрофон выключен
            3 - Пользователь заглушен
        """.trimIndent()
        )
        when (readln().toInt()) {
            1 -> member.status = SPEAKING
            2 -> member.status = MICROPHONE_OFF
            3 -> member.status = MUTED
            else -> println("Некорректный ввод")
        }
    }
}

fun main() {

    val user1 = Member(
        nickname = "User_1",
        avatarUrl = "img.ru/111",
    )

    val user2 = Member(
        nickname = "User_2",
        avatarUrl = "img.ru/222",
        status = SPEAKING
    )

    val user3 = Member(
        nickname = "User_3",
        avatarUrl = "img.ru/333",
        status = MUTED
    )

    val testRoom = Room(
        id = 1,
        roomName = "Комната 1",
        roomCoverUrl = "img.ru/roomcover",
        members = mutableListOf(user1, user2)
    )

    testRoom.checkRoomStatus()
    testRoom.addMember(user3)
    testRoom.checkRoomStatus()

    user3.seeProfile()
    testRoom.updateMemberStatus(user3)
    user3.seeProfile()
}



