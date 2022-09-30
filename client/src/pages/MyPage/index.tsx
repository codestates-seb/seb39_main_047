import DeleteAccount from '../../components/DeleteAccount';
import MyProfile from '../../components/MyProfile';
import TopNav from '../../components/TopNav';

import * as S from './style';

const MyPage = () => {
  return (
    <>
      <TopNav />
      <S.MyPageContainer>
        <MyProfile />
        <DeleteAccount />
      </S.MyPageContainer>
    </>
  );
};

export default MyPage;
