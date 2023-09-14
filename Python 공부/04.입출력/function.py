def add(a, b):
    return a + b


def say():
    return "Hi"


print(add(3, 4))


# 입력값이 몇개가 될지 모를 때
# def 함수_이름(*매개변수):
#    수행할_문장
def add_many(*args):
    result = 0
    for i in args:
        result = result + i
    return result


result_3 = add_many(1, 2, 3)
result_5 = add_many(1, 2, 3, 4, 5)


def ad_mul(choice, *args):
    if choice == "add":
        result = 0
        for i in args:
            result = result + i
    elif choice == "mul":
        result = 1
        for i in args:
            result = result * i
    return result


result_add = add_mul("add", 1, 2, 3, 4)
result_mul = add_mul("mul", 1, 2, 3, 4, 5)


# 키워드 매개변수 kwargs
def print_kwargs(**kwargs):
    print(kwargs)


print_kwargs(name="foo", age=3)  # == {'age':3, 'name': 'foo'}

#매개변수 초기값 미리 정해주기
#항상 맨뒤에 넣자, 매개변수 순서는 중요하다.
def say_myself(name, age, man=True) # man값이 없어도 True로 함수를 진행한다.

#lambda 예약어 
add=lambda a,b: a+b