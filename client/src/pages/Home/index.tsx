import { BoardHeader, BoardBox, TopNav } from '@components/index';
import * as S from './style';

export default function Home() {
  return (
    <>
      <TopNav />
      <div style={{ height: '10rem' }} />
      <S.Container>
        <BoardHeader title={'자유게시판'} isBoards={true} />
        <S.Main>
          {[...Array(15)].map((item, index) => (
            <BoardBox key={index} id={index} />
          ))}
        </S.Main>
      </S.Container>
    </>
  );
}
