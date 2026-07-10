from core import ThirdAI


def test_ai_response():
    ai = ThirdAI()

    result = ai.respond("Hello")

    assert result is not None

