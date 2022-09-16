# 🦖 코드스테이츠 Team47 Project Danbi

## 과제 소개
- 목표 : 휴대폰 요금제 추천 및 휴대폰 관련 포럼
- 작업기간 : 2022.09.08 ~ 2022.10.13
<br/>

## 배포 링크

<br/>

## 팀원들을 소개합니다.

|멤버|담당|포부|
|:--|:--|:--|
|[구솔찬(팀장)](https://github.com/gschan01)|백엔드|-|
|[이창주](https://github.com/lcjne00)|백엔드|-|
|[이규림](https://github.com/Kyoorim)|프론트엔드|-|
|[이종호](https://github.com/devfrank9)|프론트엔드|원피스 완결 전에 오픈소스 컨트리뷰터 달기|

<br/>

## Commit & Merge Convention

```
1. fedev, bedev (개발) 브랜치를 생성한다.
2. 각자 주어진 작업에 대한 issue를 생성한다.
3. 생성된 issue 번호로 개별 branch 이름을 갖는다
4. 개별 branch에서 작업후 Git 컨벤션에 따라 커밋 및 PR을 한다.
5. 이때, PR은 fedev, bedev(개발)로 한다.
6. 모든 issue close 및 작업사항 없을시 main으로 fedev, bedev(개발) 브랜치를 PR한다.
7. 이후 작업 발생시 1~6을 반복한다.
```
# 메시지 구조
```
type(옵션): [#issueNumber - ]Subject  // -> 제목
(한 줄을 띄워 분리합니다.)
body(옵션) //  -> 본문 
(한 줄을 띄워 분리합니다.)
footer(옵션) // -> 꼬리말
```
- type : 어떤 의도로 커밋했는지를 type에 명시합니다.
- subject : 최대 50글자가 넘지 않도록 하고 마침표는 찍지 않습니다. 영문으로 표기하는 경우 동사(원형)를 가장 앞에 두고 첫 글자는 대문자로 표기합니다. 
- body : 긴 설명이 필요한 경우에 작성합니다. 어떻게 했는지가 아니라, 무엇을 왜 했는지를 작성합니다. 최대 75자를 넘기지 않도록 합니다. 
- footer : issue tracker ID를 명시하고 싶은 경우에 작성합니다.

# 제목

"태그: 제목"의 형태이며, : 뒤에만 space가 있음에 유의합니다.

|태그 이름|설명|
|:---:|---|
|Feat|새로운 기능을 추가할 경우|
|Fix|버그를 고친 경우|
|Design|CSS 등 사용자 UI 디자인 변경|
|!BREAKING CHANGE|커다란 API 변경의 경우|
|!HOTFIX|급하게 치명적인 버그를 고쳐야 하는 경우|
|Style|코드 포맷 변경, 세미 콜론 누락, 코드 수정이 없는 경우|
|Refactor|프로덕션 코드 리팩토링|
|Comment|필요한 주석 추가 및 변경|
|Docs|문서를 수정한 경우|
|Test|테스트 추가, 테스트 리팩토링(프로덕션 코드 변경 X)|
|Chore|빌드 태스크 업데이트, 패키지 매니저를 설정하는 경우(프로덕션 코드 변경 X)|
|Rename|파일 혹은 폴더명을 수정하거나 옮기는 작업만인 경우|
|Remove|파일을 삭제하는 작업만 수행한 경우|

제목은 코드 변경 사항에 대한 짧은 요약을 나타냅니다. 제목은 다음의 규칙을 지킵니다.
> 1. 제목의 처음은 동사 원형으로 시작합니다.
> 2. 총 글자 수는 50자 이내로 작성합니다.
> 3. 마지막에 특수문자는 삽입하지 않습니다. 예) 마침표(.), 느낌표(!), 물음표(?)
> 4. 제목은 개조식 구문으로 작성합니다.

영어로 작성하는 경우 다음의 규칙을 따릅니다. 
> 1. 첫 글자는 대문자로 작성합니다.
> 2. "Fix", "Add", "Change"의 명령어로 시작합니다.


# 본문
본문은 다음의 규칙을 지킵니다.
> 1. 본문은 한 줄 당 72자 내로 작성합니다.
> 2. 본문 내용은 양에 구애받지 않고 최대한 상세히 작성합니다.
> 3. 본문 내용은 어떻게 변경했는지 보다 무엇을 변경했는지 또는 왜 변경했는지를 설명합니다.

# 꼬리말
꼬리말은 다음의 규칙을 지킵니다.
> 1. 꼬리말은 optional이고 이슈 트래커 ID를 작성합니다.
> 2. 꼬리말은 "유형: #이슈 번호" 형식으로 사용합니다.
> 3. 여러 개의 이슈 번호를 적을 때는 쉼표로 구분합니다.
> 4. 이슈 트래커 유형은 다음 중 하나를 사용합니다.
>     - Fixes: 이슈 수정중 (아직 해결되지 않은 경우)
>     - Resolves: 이슈를 해결했을 때 사용
>     - Ref: 참고할 이슈가 있을 때 사용
>     - Related to: 해당 커밋에 관련된 이슈번호 (아직 해결되지 않은 경우)
> ex) Fixes: #45 Related to: #34, #23

# 예시
```
Feat: "추가 로그인 함수"

로그인 API 개발

Resolves: #123
Ref: #456
Related to: #48, #45
```

<br />

## 실행 방법

레포지토리를 `clone` 합니다
```markdown
$ git clone https://github.com/codestates-seb/seb39_main_047.git
```
dependencies를 설치합니다
```markdown
$ npm install
```
프로젝트를 실행합니다
```markdown
$ npm start
```
<br/>

## 폴더 구조

```
root
  ├── client
  |   ├── .babelrc
  |   ├── .eslintrc
  |   ├── .vscode
  |   ├── .prettierrc
  |   ├── package-lock.json
  |   ├── package.json
  |   ├── tsconfig.json
  |   ├── public
  |   |   ├── favicon.ico
  |   |   └── index.html
  |   ├── config
  |   |   ├── webpack.common.js
  |   |   ├── webpack.dev.js
  |   |   └── webpack.prod.js
  |   └── src
  |       ├── apis
  |       ├── assets
  |       ├── components
  |       ├── hooks
  |       ├── pages
  |       ├── routes
  |       ├── styles
  |       ├── App.jsx
  |       ├── types.d.ts
  |       └── index.js
  |
  └── server
      ├── .babelrc
      └── src
```

|폴더|구분|
|:--|:--|
|apis|api함수들을 모아둔 폴더|
|assets|더미 및 이미지 등 로컬 파일|
|components|코드 재사용을 위한 컴포넌트 관리형 폴더|
|hooks|react의 커스텀 hook을 관리하는 폴더|
|pages|url주소에 따른 페이지 구성 폴더|
|routes|라우팅 관련 처리 폴더|
|styles|전역으로 사용하는 style 관리 폴더|
<br/>

## 디자인 시안

[피그마 바로가기](https://www.figma.com/file/BloioLWU2P788icAOkQkRN/Untitled?node-id=0%3A1)

<br />

## 요구사항
    
<br />

## 기술 스택

![React](https://img.shields.io/badge/react-%2320232a.svg?style=for-the-badge&logo=react&logoColor=%2361DAFB) 
![React Router](https://img.shields.io/badge/React_Router-CA4245?style=for-the-badge&logo=react-router&logoColor=white) 
![Styled Components](https://img.shields.io/badge/styled--components-DB7093?style=for-the-badge&logo=styled-components&logoColor=white) 
![React Query](https://img.shields.io/badge/-React%20Query-FF4154?style=for-the-badge&logo=react%20query&logoColor=white) 
![TypeScript](https://img.shields.io/badge/typescript-%23007ACC.svg?style=for-the-badge&logo=typescript&logoColor=white)

<br />


## Best Practice

### 1.   

💡 이유 : 
