# 집합(set)은 중복이 없는 배열
s1 = set("Hello")  # s1 == {'e','H','l','o'}
s2 = set("Hallo")
# 특징 : 중복이 없다, 순서가 없다
# 순서가 없기에 인덱싱이 없다

# 튜플과 리스트로 바꾸는 법
list(s1)
tuple(s1)

# 교집합, 합집합, 차집합을 구할 수 있다.
s1 & s2  # == {'H','l','o'}
s1.intersection(s2)  # 위와 동일

s1 | s2  # == {'H','l','o','a','e'}
s1.union(s2)  # 위와 동일

s1 - s2  # == {'e'}
s1.difference(s2)  # 위와 동일

# 값 1개 추가
s1.add("k")

# 값 여러 개 추가하기
s1.update(["c", "d", "u"])

# 특정 값 제거하기
s1.remove("H")
