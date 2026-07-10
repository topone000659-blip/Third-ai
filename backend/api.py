from core import ThirdAI

ai = ThirdAI()


def chat(message):
    return ai.respond(message)


def health():
    return {
        "status": "online",
        "service": "Third AI API"
    }

