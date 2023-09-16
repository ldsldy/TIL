number = input()
print(number)
# 입력되는 모든 것은 문자열로 취급한다.
type(number)

# print로 문자열 다루기
print("life" "is" "too short")  # +로 문자열을 합친 것과 같은 효과를 낸다.
print("life", "is", "too short")  # ,쉼표는 문자열을 뛰어 쓰는 효과를 준다.

# 위를 활용하는 방법
for i in range(10):
    print(i, end=" ")  # end로 끝 문자를 지정하여 한 줄에 이어서 출력한다.
