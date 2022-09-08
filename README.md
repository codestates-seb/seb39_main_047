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
