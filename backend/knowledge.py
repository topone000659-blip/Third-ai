class KnowledgeSystem:

    def __init__(self):
        self.knowledge = {}

    def add(self, topic, information):
        self.knowledge[topic] = information

    def search(self, topic):
        return self.knowledge.get(
            topic,
            "No information found."
        )

    def all_knowledge(self):
        return self.knowledge

