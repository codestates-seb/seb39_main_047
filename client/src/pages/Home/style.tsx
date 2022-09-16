import styled from 'styled-components';

export const Container = styled.div`
  max-width: 100%;
  margin: 0 10%;
`;

export const Main = styled.main`
  height: 80vh;
  overflow-y: scroll;
  ::-webkit-scrollbar {
    display: none;
  }
`;
