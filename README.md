# PracticeAutomationEspressoAndroid
Espresso 를 이용한 Android 자동화

# Appium 를 위한 환경설정 완료 기준으로 설명합니다. [참고 페이지](https://github.com/kimkitae/PracticeAutomationAppiumAndroid.git)

**AVD가 생성되어 있지 않다면 AVD Manager를 통해 생성 한 후 진행 합니다."***

## 개발자 옵션 내 애니메이션 비율 모두 사용안함으로 설정 합니다.


**1. sourceTree 설치 및 회원가입**  
[다운로드](https://www.sourcetreeapp.com)  
![image](https://user-images.githubusercontent.com/8774245/79738518-d2b8fc80-8337-11ea-8aa5-bf428e1aaf96.png)  


2. Github 소스 URL 복제하기  
![image](https://user-images.githubusercontent.com/8774245/79738626-f2502500-8337-11ea-94cd-1b3c0954a63b.png)  

초록색 Clone or download 버튼을 클릭  
![image](https://user-images.githubusercontent.com/8774245/79738771-2d525880-8338-11ea-8f55-e9d3bd36777e.png)  


- Clone with HTTPS를 확인 후 아래의 URL을 복사  
- URL에서 복제 버튼 클릭  
- 클론을 클릭이후 목적지 경로에 보이는 경로에 프로젝트 폴더가 복제 됩니다.  
##### 클론 시 authentication 을 물어 볼 시 본인의 계정 정보 입력.


#올바르 비밀번호를 입력했음에도 authentication Error 발생 시 Token으 생성한다.
<br/>
![1014235A-1A05-418A-B669-02D729C9F059](https://user-images.githubusercontent.com/8774245/79739006-87ebb480-8338-11ea-874c-fc2e4a67b070.png)
<br/>
- 계정 설정 화면으로 이동  
- 왼쪽 하단 메뉴에 있는 `Developer settings` 이동  
- `Personal access tokens' 클릭  
- `Generate new token' 클릭  
- `repo` 체크 후 생성  

## 이후 authentication 인증 시 해다 토큰을 비밀번호 대신 사용  
#Token 값 잃어버렸을 시 새로 Regenerate 하면 됩니다.
