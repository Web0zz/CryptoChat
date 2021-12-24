package com.web0zz.cryptochat.data

import com.web0zz.cryptochat.domain.model.Chat
import com.web0zz.cryptochat.domain.model.Message

class ChatDataSource {
    val chatList: List<Chat> = listOf(
        Chat(
            0,
            "https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcRLe5PABjXc17cjIMOibECLM7ppDwMmiDg6Dw&usqp=CAU",
            "Hugo Graham",
            listOf(
                Message(0,"Merhabalar 0","YESTERDAY",true)
            )
        ),
        Chat(
            1,
            "https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcTEK9rIg0CG7Wcgd85WHT0L46lRXroN_QNJKfrt0in_6O9EpNS6x9RU6p26af3JBOmGGM8&usqp=CAU",
            "Jarrod Rivera",
            listOf(
                Message(0,"Merhabalar 1","YESTERDAY",false)
            )
        ),
        Chat(
            2,
            "https://media.istockphoto.com/photos/portrait-of-handsome-smiling-young-man-with-crossed-arms-picture-id1200677760?k=20&m=1200677760&s=612x612&w=0&h=JCqytPoHb6bQqU9bq6gsWT2EX1G5chlW5aNK81Kh4Lg=",
            "William Cuevas",
            listOf(
                Message(0,"Merhabalar 0","YESTERDAY",true)
            )
        ),
        Chat(
            3,
            "https://dwpdigital.blog.gov.uk/wp-content/uploads/sites/197/2016/07/P1090594-1.jpeg",
            "Elen Mathis",
            listOf(
                Message(0,"Merhabalar 0","YESTERDAY", isRead = false, fromUser = true)
            )
        ),
        Chat(
            4,
            "https://dwpdigital.blog.gov.uk/wp-content/uploads/sites/197/2015/10/Haley-Goldthorpe-e1476977832951-1024x768.jpg",
            "Anisha Krueger",
            listOf(
                Message(0,"Merhabalar","YESTERDAY",true),
                Message(0,"Merhabalar","YESTERDAY", isRead = false, fromUser = true),
                Message(0,"Bu son","YESTERDAY",false),
                Message(0,"Bu son mesaj 3","YESTERDAY",false),
            )
        ),
        Chat(
            5,
            "https://assets.publishing.service.gov.uk/government/uploads/system/uploads/person/image/4584/s465_katie-farrington.jpg",
            "Kinga Wilkinson",
            listOf(
                Message(0,"Merhabalar","YESTERDAY", isRead = false, fromUser = true),
                Message(0,"Bu son 2","YESTERDAY",false)
            )
        ),
        Chat(
            6,
            "https://jgi.doe.gov/wp-content/uploads/2017/05/1-Brian-Hedlund-UNLV.jpg",
            "Eathan Wade",
            listOf(
                Message(0,"Merhabalar 1","YESTERDAY",false)
            )
        ),
    )
}