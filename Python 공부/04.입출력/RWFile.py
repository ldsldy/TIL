# 파일 열고 닫기
# open(파일 이름, 파일 열기 모드) 열기 모드 => r,w,a(파일의 마지막에 새로운 내용을 추가)
f = open("새파일.txt", 'w')
f.close()
# 파일 이름에 경로를 적어서 경로 지정도 가능

# 파일의 내용 작성하기
f=open("C:\Users\JU\OneDrive/새파일.txt", 'w')
for i in range(1,11):
    data="%d번째 줄입니다.\n" %i
    f.write(data)
f.close()

# 파일의 내용 읽기
#readline()으로 한줄씩 읽어드리기
f=open("C:\Users\JU\OneDrive/새파일.txt", 'r')
line=f.readline()
print(line)
f.close()

#readlines()로 리스트로 읽어드리기
f=open("C:\Users\JU\OneDrive/새파일.txt", 'r')
lines=f.readlines()
for line in lines:
    print(line)    # 줄바꿈을 제거 할려면 line=line.strip()
f.close()

# read 함수로 파일 내용 전체를 문자열로 리턴하기
f=open("C:\Users\JU\OneDrive/새파일.txt", 'r')
data=f.read()
print(data)
f.close()

# read로 받은 객체를 줄 단위로 읽기
f=open("C:\Users\JU\OneDrive/새파일.txt", 'r')
for line in f:
    print(line)
f.close()

# 파일에 새로운 라인 추가
f=open("C:\Users\JU\OneDrive/새파일.txt",'a')
for i in range(11,20):
    data="%d번쨰 줄입니다.\n" %i
    f.write(data)
f.close()

# 파일을 자동으로 열고 다는 방법 with
# with문을 벋어나는 f파일을 자동으로 닫아 준다.
with open("foo.txt","w") as f:
    f.write("Life is too short, you need python") 
