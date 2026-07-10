class ThirdAI:

    def __init__(self):
        self.name = "Third AI"
        self.version = "1.0"
        self.memory = []

    def respond(self, message):
        self.memory.append(message)

        return {
            "ai": self.name,
            "response": f"I received: {message}"
        }

    def history(self):
        return self.memory

