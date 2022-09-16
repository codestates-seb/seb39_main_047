import { BoardHeader, TopNav } from '@components/index';
import styled from 'styled-components';
import * as S from './style';

export default function BoardDetail() {
  return (
    <>
      <TopNav />
      <div style={{ height: '10rem' }} />
      <S.Container>
        <BoardHeader title={'자유게시판'} />
        <S.Main>
          <Title>아이폰이 잘 안울려요</Title>
          <Content>링딩동 링딩동 링기리딩딩링딩동</Content>
          <Content>링딩동 링딩동 링기리딩딩링딩동</Content>
          <Content>링딩동 링딩동 링기리딩딩링딩동</Content>
          <Content>링딩동 링딩동 링기리딩딩링딩동</Content>
          <Content>링딩동 링딩동 링기리딩딩링딩동</Content>
          <Content>링딩동 링딩동 링기리딩딩링딩동</Content>
          <Content>링딩동 링딩동 링기리딩딩링딩동</Content>
          <Content>링딩동 링딩동 링기리딩딩링딩동</Content>

          <Recommend>
            <span>추천</span>
            <span>비추천</span>
          </Recommend>
          <Comment></Comment>
        </S.Main>
      </S.Container>
    </>
  );
}

export const Title = styled.div`
  font-size: 2vmax;
  margin-bottom: 3rem;
`;
export const Content = styled.div`
  font-size: 1vmax;
`;
export const Recommend = styled.div`
  margin-top: 5rem;
  font-size: 1.2vmax;
  span {
    margin-right: 1rem;
  }
  padding-bottom: 2rem;
  border-bottom: 1px solid black;
`;
export const Comment = styled.div``;
