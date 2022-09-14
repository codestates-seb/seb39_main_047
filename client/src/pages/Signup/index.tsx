import TopNav from '@components/TopNav';
import SignupForm from '@components/SignupForm';
import * as S from './style';

const Signup = () => {
  return (
    <>
      <TopNav />
      <S.SignupContainer>
        <SignupForm />
      </S.SignupContainer>
    </>
  );
};

export default Signup;
