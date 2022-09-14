import Button from '@components/Button';
import * as S from './style';
import DanbiLogo from '../../assets/logo-DANBI.svg';

const TopNav = () => {
  return (
    <S.Container>
      <S.Inner>
        <S.Logo>
          <img src={DanbiLogo} alt="단비사이트 로고" />
        </S.Logo>
        <S.Menus>
          <div>게시판</div>
          <div>신기종 포럼</div>
        </S.Menus>
        <S.Mypage>
          <Button>Log In</Button>
          <Button>Sign Up</Button>
        </S.Mypage>
      </S.Inner>
    </S.Container>
  );
};

export default TopNav;
