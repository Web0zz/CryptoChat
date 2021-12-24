package com.web0zz.cryptochat.data

import com.web0zz.cryptochat.domain.model.Chat
import com.web0zz.cryptochat.domain.model.Message

class ChatDataSource {
    val chatList: List<Chat> = listOf(
        Chat(
            0,
            "https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcRLe5PABjXc17cjIMOibECLM7ppDwMmiDg6Dw&usqp=CAU",
            "Hugo Graham",
            mutableListOf(
                Message(0, "Hi. Sam.", "YESTERDAY", true),
                Message(0, "Hugo. Good to meet you!", "YESTERDAY", true, fromUser = true),
                Message(0, "Did you just arrive here?", "YESTERDAY", true),
                Message(0, "Yeah, We arrived last week.", "YESTERDAY", true, fromUser = true),
                Message(0, "How do you like it?", "YESTERDAY", true, fromUser = true),
                Message(
                    0,
                    "It’s exciting! It’s much busier than the last city we lived in. I was working in Seattle for the last 3 years.",
                    "YESTERDAY",
                    true
                ),
                Message(
                    0,
                    "It really is very busy. I moved here from Tokyo 5 years ago and I still have trouble sometimes. Did you move here with your wife?",
                    "YESTERDAY",
                    true,
                    fromUser = true
                ),
                Message(
                    0,
                    "Actually, I’m not married. I moved here with my dog, Charles. We are very close.",
                    "YESTERDAY",
                    true
                ),
                Message(0, "Oh. I see.", "YESTERDAY", true, fromUser = true),
                Message(0, "What about you?", "YESTERDAY", true),
                Message(
                    0,
                    "Yes, I am married and I have two children.",
                    "YESTERDAY",
                    true,
                    fromUser = true
                ),
                Message(0, "How old are they?", "YESTERDAY", true),
                Message(0, "6 and 8 years old", "YESTERDAY", true, fromUser = true),
                Message(0, "Oh, great. That age is a lot of fun.", "YESTERDAY", true),
                Message(
                    0,
                    "I understand. My brother has kids the same age. Every time we visit he falls asleep on the sofa.",
                    "YESTERDAY",
                    true,
                    fromUser = true
                ),
                Message(
                    0,
                    "Must be nice. We don’t have time for sleep, we have to drink a lot of coffee.",
                    "YESTERDAY",
                    false
                ),
            )
        ),
        Chat(
            1,
            "https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcTEK9rIg0CG7Wcgd85WHT0L46lRXroN_QNJKfrt0in_6O9EpNS6x9RU6p26af3JBOmGGM8&usqp=CAU",
            "Jarrod Rivera",
            mutableListOf(
                Message(
                    0,
                    "Hi. My name is Jarrod. It's a pleasure to meet you.",
                    "YESTERDAY",
                    false
                ),
                Message(0, "I want to ask you something", "YESTERDAY", false),
                Message(0, "If you have time?", "YESTERDAY", false),
                Message(0, "Heyyyyy!!!", "YESTERDAY", false),
            )
        ),
        Chat(
            2,
            "https://media.istockphoto.com/photos/portrait-of-handsome-smiling-young-man-with-crossed-arms-picture-id1200677760?k=20&m=1200677760&s=612x612&w=0&h=JCqytPoHb6bQqU9bq6gsWT2EX1G5chlW5aNK81Kh4Lg=",
            "William Cuevas",
            mutableListOf(
                Message(0, "Did you have any problems finding this place.", "YESTERDAY", true),
                Message(
                    0,
                    "I didn't have any problems. I found directions on the internet so it was pretty easy to find. However, the traffic was not that great.",
                    "YESTERDAY",
                    true,
                    fromUser = true
                ),
                Message(0, "Traffic is never good around here.", "YESTERDAY", true),
                Message(
                    0,
                    "I agree. It would be great if there was a train or a subway line that went through here.",
                    "YESTERDAY",
                    false,
                    fromUser = true
                )
            )
        ),
        Chat(
            3,
            "https://dwpdigital.blog.gov.uk/wp-content/uploads/sites/197/2016/07/P1090594-1.jpeg",
            "Elen Mathis",
            mutableListOf(
                Message(
                    0,
                    "There is no one who loves pain itself, who seeks after it and wants to have it, simply because it is pain...",
                    "YESTERDAY",
                    true
                ),
                Message(
                    0,
                    "Pellentesque vitae nunc consequat, hendrerit nulla vel, semper arcu.",
                    "YESTERDAY",
                    true,
                    fromUser = true
                )
            )
        ),
        Chat(
            4,
            "https://dwpdigital.blog.gov.uk/wp-content/uploads/sites/197/2015/10/Haley-Goldthorpe-e1476977832951-1024x768.jpg",
            "Anisha Krueger",
            mutableListOf(
                Message(
                    0,
                    "mi, nec porta est. Quisque gravida ipsum in lectus venenatis p",
                    "YESTERDAY",
                    true
                ),
                Message(
                    0,
                    "er sem. Integer enim neque, feugiat ac quam quis, porttitor ",
                    "YESTERDAY",
                    true,
                    fromUser = true
                ),
                Message(0, "Hayat bizi yordu", "YESTERDAY", true),
                Message(
                    0,
                    "um nemperdque suscipit in. Pellentes",
                    "YESTERDAY",
                    true,
                    fromUser = true
                )
            )
        ),
        Chat(
            5,
            "https://assets.publishing.service.gov.uk/government/uploads/system/uploads/person/image/4584/s465_katie-farrington.jpg",
            "Kinga Wilkinson",
            mutableListOf(
                Message(0, "Did you have any problems finding this place.", "YESTERDAY", true),
                Message(
                    0,
                    "I didn't have any problems. I found directions on the internet so it was pretty easy to find. However, the traffic was not that great.",
                    "YESTERDAY",
                    true,
                    fromUser = true
                ),
                Message(0, "Traffic is never good around here.", "YESTERDAY", true),
                Message(
                    0,
                    "egestas. Curabitur sit amet aliquet mi, nec porta est. Quisque gravida ipsum in lectus venenatis pretium. In quis semper sem. Integer enim neque, feugiat ac quam quis, porttitor mo",
                    "YESTERDAY",
                    false,
                    fromUser = true
                )
            )
        ),
        Chat(
            6,
            "https://jgi.doe.gov/wp-content/uploads/2017/05/1-Brian-Hedlund-UNLV.jpg",
            "Eathan Wade",
            mutableListOf(
                Message(0, "Did you have any problems finding this place.", "YESTERDAY", true),
                Message(
                    0,
                    "I didn't have any problems. I found directions on the internet so it was pretty easy to find. However, the traffic was not that great.",
                    "YESTERDAY",
                    true,
                    fromUser = true
                ),
                Message(0, "Traffic is never good around here.", "YESTERDAY", true),
                Message(
                    0,
                    "sit amet aliquet mi, nec porta est. Quisque gravida ipsum in lectus venenatis pre",
                    "YESTERDAY",
                    false,
                    fromUser = true
                )
            )
        ),
        Chat(
            7,
            "https://www.bnl.gov/today/body_pics/2017/06/stephanhruszkewycz-hr.jpg",
            "Jorgie Miller",
            mutableListOf(
                Message(0, "Did you have any problems finding this place.", "YESTERDAY", true),
                Message(
                    0,
                    "I didn't have any problems. I found directions on the internet so it was pretty easy to find. However, the traffic was not that great.",
                    "YESTERDAY",
                    true,
                    fromUser = true
                ),
                Message(0, "Traffic is never good around here.", "YESTERDAY", true)
            )
        ),
        Chat(
            8,
            "https://likewise-stage.azureedge.net/uploads/3eb6cf23-895b-45e9-b92c-5fb1b457dd04/bill-gates-profile-pic.jpg",
            "Bill Gates",
            mutableListOf(
                Message(0, "Are you Bill Gates?", "YESTERDAY", true, fromUser = true)
            )
        )
    )
}