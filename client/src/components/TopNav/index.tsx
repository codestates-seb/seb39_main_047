import { useNavigate } from 'react-router';

import Button from '../../components/Button';
import * as S from './style';
import DanbiLogo from '../../assets/logo-DANBI.svg';
import { getUser, removeUser } from '../../util/localstorage';

const TopNav = () => {
  const navigate = useNavigate();
  const userInfo = getUser();

  const logoutHandler = () => {
    alert('로그아웃 하시겠습니까?');
    removeUser();
    navigate('/');
  };

  return (
    <S.Container>
      <S.Inner>
        <S.Logo>
          <img
            src={DanbiLogo}
            alt="단비사이트 로고"
            onClick={() => navigate('/')}
          />
        </S.Logo>
        <S.Menus>
          <div>게시판</div>
          <div>신기종 포럼</div>
        </S.Menus>
        {userInfo ? (
          <S.LogOut>
            <h4>반갑습니다 😃</h4>
            <Button onClick={logoutHandler}>Log Out</Button>
          </S.LogOut>
        ) : (
          <S.LogIn>
            <Button onClick={() => navigate('/login')}>Log In</Button>
            <Button onClick={() => navigate('/signup')}>Sign Up</Button>
          </S.LogIn>
        )}
      </S.Inner>
    </S.Container>
  );
};

export default TopNav;
