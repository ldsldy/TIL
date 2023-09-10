# 딕셔너리 == 해시 또는 연관 배열, key와 value를 가진다.

# 딕셔너리를 만드는 방법
dic = {"name": "Lee", "phone": "010-1111-0000", "birth": "199908112"}

# 딕셔너리 쌍 추가하기
a = {1: "a"}
a[2] = "b"
a  # == {1:'a', 2:'b'}
a["name"] = "Lee"

# 딕셔너리 요소 삭제하기
del a[1]  # == {1:'a', "name":"Lee"}

# 같은 키에 다른 밸류를 넣는다면 전의 밸류는 사라진다
# 키에 리스트를 쓸수 없다. => 리스트는 변할 수 있는 값이기 때문에
# 따라서 키에 튜플은 사용 가능하다.

# 딕셔너리 관련 함수
# Key 리스트 생성
a.keys()  # == dict_keys([1,'name']) => a의 Key만 모아 dict_keys 객체를 리턴
# 3.0이상
list(a.keys())

# Value 리스트 생성
a.values()  # dict_values 객체 리턴

# Key,Value 쌍 얻기
a.items()  # == dict_items([(1,'a'),("name","Lee")]) 튜플로 묶은 리스트 생성

# 딕셔너리 삭제
a.clear()

# key로 value얻기
a.get(1, "default")  # == key가 없으면 디폴트 값을 리턴

# 해당 키가 있는지 확인하기
"name" in a  # == True
