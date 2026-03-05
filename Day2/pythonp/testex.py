import pytest

def test_addition():
    assert 2 + 2 == 4

def test_string_operations():
    name = "Python"
    assert name.upper() == "PYTHON"
    assert len(name) == 6

def test_division_by_zero():
    with pytest.raises(ZeroDivisionError):
        result = 10 / 0

def test_float_calculation():
    result = 0.1 + 0.2
    assert result == pytest.approx(0.3)

@pytest.fixture
def sample_data():
    return {"name": "Alice", "age": 25}

@pytest.mark.user
def test_user_data(sample_data):
    assert sample_data["name"] == "Alice"

@pytest.mark.slow
@pytest.mark.parametrize("input,expected", [
    (2, 4), (3, 9), (4, 16)
])
def test_square(input, expected):
    assert input ** 2 == expected

@pytest.mark.slow
def test_database_operation():
    # Long-running test
    pass

# Run: pytest -v testex.py -m "not slow"