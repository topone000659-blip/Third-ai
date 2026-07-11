from core import ThirdAI

ai = ThirdAI()


def chat(message):
    return ai.respond(message)


def health():
    return {
        "status": "online",
        "service": "Third AI API"
    }

from fastapi import FastAPI
from pydantic import BaseModel

from core import ThirdAI


app = FastAPI(
    title="Third AI API"
)


ai = ThirdAI()


class ChatRequest(BaseModel):
    message: str


@app.get("/health")
def health():
    return {
        "status": "online",
        "service": "Third AI API"
    }


@app.post("/chat")
def chat(request: ChatRequest):

    response = ai.respond(
        request.message
    )

    return {
        "response": response
    }
