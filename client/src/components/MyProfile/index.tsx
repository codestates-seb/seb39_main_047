import Button from '../../components/Button';
import * as S from './style';
import { getUser } from '../../util/localstorage';

const MyProfile = () => {
  const emailInfo = getUser();

  return (
    <S.InfoContainer>
      <h1>마이 페이지</h1>
      <S.Form>
        <S.Section>
          <S.Label>이메일:</S.Label>
          <span>{emailInfo.sub}</span>
        </S.Section>
        <S.Section>
          <S.Label>닉네임:</S.Label>
          <S.Input></S.Input>
          <Button>변경</Button>
          <S.Input placeholder="새로운 닉네임을 쓰고 저장을 누르세요"></S.Input>
          <Button>저장</Button>
        </S.Section>
        <S.Section>
          <S.Label>비밀번호 변경하기:</S.Label>
          <S.Input></S.Input>
          <Button>변경</Button>
          <S.Input placeholder="새로운 비번을 쓰고 저장을 누르세요"></S.Input>
          <Button>저장</Button>
        </S.Section>
      </S.Form>
    </S.InfoContainer>
  );
};

export default MyProfile;
