import styled from 'styled-components';

export const Container = styled.div`
  cursor: pointer;
  margin-top: 2rem;
  width: 100%;
  padding-bottom: 2rem;
  border-bottom: 1px solid black;
  &:hover {
    opacity: 0.5;
  }
`;
export const Title = styled.p`
  width: 100%;
  font-size: 3vmax;
  margin-bottom: 2rem;
`;
export const ContentPreview = styled.p`
  font-size: 1.3vmax;
`;
export const BoardInfo = styled.div`
  display: flex;
  justify-content: flex-end;
  margin-top: 1rem;
  font-size: 1vmax;
  > p:first-child {
    margin-right: 1rem;
  }
`;
