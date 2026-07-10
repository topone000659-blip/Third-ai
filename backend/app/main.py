APP_NAME = "Third AI"
VERSION = "1.0"


class ThirdAI:

    def __init__(self):
        self.name = APP_NAME
        self.version = VERSION

    def status(self):
        return {
            "name": self.name,
            "version": self.version,
            "status": "online"
        }

    def respond(self, message):
        if not message:
            return "Please enter a message."

        return f"Third AI received: {message}"


ai = ThirdAI()


if __name__ == "__main__":
    print(ai.status())

    while True:
        user = input("You: ")

        if user.lower() == "exit":
            print("Third AI Offline")
            break

        print("Third AI:", ai.respond(user))

