import LoginForm from '../../components/LoginForm';
import TopNav from '../../components/TopNav';
import * as S from './style';

const Login = () => {
  return (
    <>
      <TopNav></TopNav>
      <S.LoginContainer>
        <LoginForm />
        <S.Text>
          <span>비밀번호 찾기 </span>
          <span> | </span>
          <span>회원가입 하러 가기</span>
        </S.Text>
      </S.LoginContainer>
    </>
  );
};

export default Login;
