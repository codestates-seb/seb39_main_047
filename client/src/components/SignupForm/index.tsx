import Card from '@components/Card';
import Button from '@components/Button';
import * as S from './style';

const SignupForm = () => {
  return (
    <Card>
      <S.Form>
        <S.Title>회원가입</S.Title>
        <S.Label>닉네임</S.Label>
        <S.Input></S.Input>
        <S.Label>이메일</S.Label>
        <div>
          <S.Input></S.Input>
          <Button>중복확인</Button>
        </div>
        <S.Label>비밀번호</S.Label>
        <S.Input></S.Input>
        <S.Label>비밀번호 확인</S.Label>
        <S.Input></S.Input>
        <Button type="submit">회원가입 하기</Button>
      </S.Form>
    </Card>
  );
};

export default SignupForm;
