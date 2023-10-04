# 기본 포맷
money=True
if money:
    print("택시를 타고 가라")
else:
    print("걸어가라")
# 주의사항 : 파이썬은 무조건 들여쓰기를 지켜야 한다.

# and, or, not => &&, ||, !
card=True
if money>=3000 or card:
    print("택시를 타라")
else:
    print("걸어가라")

# in, not in
# x in 리스트, x in 튜플, x in 문자열
1 in [1,2,3] # == True
1 not in [1,2,3] # == False

# 조건문을 넘기고 싶다면 => pass
card=True
if money>=3000 or card:
    pass
else:
    print("걸어가라")

# elif == else if
pocket=['paper','cellphone']
card = True
if 'money' in pocket:
    print("택시를 타고가라")
elif card:
    print("택시를 타고가라")
else:
    print("걸어가라")

# 간략하게 if문 작성하기 => 조건문 : 뒤에 바로 실행문을 적어도 된다.
if 'money' in pocket:print("택시를 타고가라")
