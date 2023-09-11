a=[1,2,3]

#변수 a의 주소 값을 구할려면?
id(a)

# b=a와 같이 복사한다면? => 같은 주소 값을 가르키는 변수를 하나 만드는것
# 즉, 가리키는 객체가 같다. b is a # true

# 새로운 객체를 만드면서 복사할려면?
b=a[:]
from copy import copy
b=copy(a)
b is a # false

# c의 변수 바꾸기 => temp라는 빈 변수를 만들어 실행해야 한다.
# 그러나 파이썬은
a=3
b=5
a,b = b,a