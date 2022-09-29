import Button from '@components/Button';
import Card from '@components/Card';
import * as S from './style';

const LoginForm = () => {
  return (
    <Card>
      <S.Form>
        <S.Title>로그인</S.Title>
        <S.Label>Email</S.Label>
        <S.Input></S.Input>
        <S.Label>Password</S.Label>
        <S.Input></S.Input>
        <Button type="submit">로그인 하기</Button>
      </S.Form>
    </Card>
  );
};

export default LoginForm;
