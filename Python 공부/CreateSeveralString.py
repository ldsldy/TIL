a = "Python's favorite food is perl"  # 문자열에 '을 사용하는 경우
b = '"Python is very easy." he says.'  # 문자열에 ""을 사용하는 경우
c = '"Python is very easy." he says.'  # 자바와 같이 \로 ",'을 사용하는 경우
d = """Life is too short
You need python"""  # 복수의 줄을 변수에 대입하는 경우
for i in [a, b, c, d]:
    print(i)

print("/" * 20)  # 문자열을 특정 수 만큼 반복
print(a + b)  # 문자열을 합치는 법
print(len(a))  # 문자을의 길이를 구하는 법
print(a[0])  # 파이썬에서 문자열은 문자의 배열이다
print(a[-1])  # 음수는 뒤에서부터 검색
print(a[0:6])  # 배열에서 특정값'들'을 간단히 뽑아내는 방법

print("/" * 20)
# 문자열 포매팅=> 문자열 중간에 원하는 값을 대입하는 법
print("I eat %d apples" % 3)
print("I eat %s apples" % "five")
# 2개를 대입하는 법, (ps)%%로 %문자를 대입할 수 있다.
print("I ate %d apples. so I was sick for %s days." % (10, "three"))
# 정렬을 만드는 방법
print("%10s" % "three")
# 소수점 표현 방법
print("%0.4f" % 3.42134234)

# format함수로 더 세련된 포매팅하기
print("I eat {0} apples".format(3))
print("I eat {0} apples and {1} bananas".format(3, 5))
# format함수로 왼쪽, 오른쪽, 가운데 정렬하기
print("{0:<10}".format("hi"))
print("{0:>10}".format("hi"))
print("{0:^10}".format("hi"))
print("{0:=^10}".format("hi"))
# format함수에서 문자 그대로 사용하기
print("{{and}}".format())


# f 문자열 포매팅 3.6버전 이상
print(f'나의 이름은 {"이득영"}입니다. 나이는 {25}입니다.')
# 활용
d = {"name": "이득영", "age": 25}
print(f'나의 이름은 {d["name"]}입니다. 나이는 {d["age"]}입니다.')
# 정렬
print(f'{"hi":^10}')
# 소수점
print(f"{3.14546:10.4f}")

# 문자열 관련 함수
# 특정 문자 개수 세기
example = "hobby"
print(example.count("b"))
# 특정 문자 인덱스 위치 찾기
print(example.find("b"))  # 없으면 -1
print(example.index("b"))  # 없으면 오류 발생
# 문자열 삽입
print(",".join("abcd"))  # abcd각 문자 사이에 ','를 삽입
# 대문자,소문자로 바꾸기
low = "hi"
capital = "HI"
low.upper()
capital.lower()
# 왼쪽, 오른쪽, 양쪽 공백 지우기
low.lstrip()
low.rstrip()
low.strip()
# 문자열 교체하기
string = "Life is too short"
a.replace("Life", "Your leg")
# 문자열 자르기
a.split()  # ()안에 아무것도 없으면 공백 기준
a.split(":")
# 문자열로 바꾸기
int = 3
str(int)
