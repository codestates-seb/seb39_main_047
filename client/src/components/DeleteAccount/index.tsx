import Button from '@components/Button';
import * as S from './style';

const DeleteAccount = () => {
  return (
    <>
      <S.DeleteContainer>
        <h1>계정 삭제하기</h1>
        <S.Form>
          <S.Text>
            계정을 삭제하면 회원님의 모든 정보가 삭제되며 재복구가 불가능합니다.
            그래도 삭제 하시겠습니까?
          </S.Text>
          <S.CheckBox>
            <input type="checkbox"></input>
            <div>위 내용을 확인했습니다</div>
          </S.CheckBox>
          <Button>계정 삭제하기</Button>
        </S.Form>
      </S.DeleteContainer>
    </>
  );
};

export default DeleteAccount;
