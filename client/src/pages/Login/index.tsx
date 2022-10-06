import LoginForm from '../../components/LoginForm';
import TopNav from '../../components/TopNav';
import * as S from './style';
import { useNavigate } from 'react-router-dom';

const Login = () => {
  const navigate = useNavigate();
  return (
    <>
      <TopNav></TopNav>
      <S.LoginContainer>
        <LoginForm />
        <S.Text>
          <span onClick={() => navigate('/signup')}>회원가입 하러 가기</span>
        </S.Text>
      </S.LoginContainer>
    </>
  );
};

export default Login;
