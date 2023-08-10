## 자바 공부

문제를 풀고 찾아가며 공부하는 자바 공부

## 순서

The workspace contains two folders by default, where:

- `src`: the folder to maintain sources
- `lib`: the folder to maintain dependencies

Meanwhile, the compiled output files will be generated in the `bin` folder by default.

> If you want to customize the folder structure, open `.vscode/settings.json` and update the related settings there.

## 배열(Array)

1. Arrays란?
2. 배열 메소드의 종류

### Arrays란?
배열을 조작하는데 사용할 수 있는 '유틸리티 클래스'

### 배열 메소드의 종류

1. 배열의 길이를 반환
```
arr.length;
```
2. 배열의 요소를 정렬
```
Arrays.sort(int[] arr, int fromIndex, int toIndex);
```
3. 배열의 복사본 생성
```
Arrays.copyOf(arr, int Length);
```
4. 범위 있는 복사본
```
Arrays.copyOfRange(arr, fromIndex, toIndex);
```
5. 요소를 채운다
```
Arrays.fill(arr, Input);
```
6. 범위 있는 요소 지정
```
Arrays.fill(array, fromIndex, toIndex, value);
```
7. 두 배열을 비교
```
Arrays.equals(arr, other_arr);
```
8. 비교하여 크면 1, 같으면 0, 작으면 -1
```
Arrays.compare(arr, other_arr);
```
9. 지정된 값의 인덱스 반환
```
Arrays.binarySearch(arr, value);
```
배열이 정렬된 상태여야한다. 또한 같은 값이 여러개라면 가장 작은 인덱스를 리턴한다.
10. 배열의 요소를 문자열로 반환
```
String toString(array);
```
11. 지정된 배열의 해시 코드를 반환
```
Arrays.hashCode(arr);
```

## 스트림(Stream)

The `JAVA PROJECTS` view allows you to manage your dependencies. More details can be found [here](https://github.com/microsoft/vscode-java-dependency#manage-dependencies).
