# 명령 프롬프트에서 사용하는 명령어는 명령어[인수1, 인수2...]와 같이 인수를
# 전달하여 프로그램을 실행한다.
# 파이썬에서는 sys모듈을 사용하여 프로그램에 인수를 전달할 수 있다.
import sys

args = sys.argv[1:]  # argv는 프로그램 실행 시 전달된 인수이다.
for i in args:  # ex)argv[0]는 파일 이름
    print(i)
