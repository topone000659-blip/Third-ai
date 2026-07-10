class MemorySystem:

    def __init__(self):
        self.history = []

    def remember(self, message):
        self.history.append(message)

    def get_memory(self):
        return self.history

    def clear(self):
        self.history.clear()

