# while 조건문:
#    수행할 문장1
#    수행할 문장2

treeHit = 0
while treeHit < 10:
    treeHit = treeHit + 1
    print("나무를 %d번 찍었습니다." % treeHit)
    if treeHit == 10:
        print("나무가 넘어갑니다.")

prompt = """
1. Add
2. Del
3. List
4. Quit

Enter number"""

number = 0
while number != 4:
    print(prompt)
    number = int(input())

# while문 강제로 빠져나가는 방법 break
# while문 맨 처음으로 돌아가기 continue
