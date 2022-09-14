import styled from 'styled-components';

export const Container = styled.div`
  background-color: white;
  display: flex;
  width: 100%;
  z-index: 999;
  position: fixed;
`;

export const Inner = styled.div`
  display: flex;
  justify-content: space-around;
  align-items: center;
  height: 5rem;
  width: 100%;
`;

export const Logo = styled.div`
  width: 30%;
  display: flex;
  justify-content: center;

  img {
    width: 200px;
  }
`;
export const Menus = styled.div`
  display: flex;
  justify-content: space-around;
  width: 30%;
`;
export const Mypage = styled.div`
  display: flex;
  justify-content: center;
  width: 30%;

  Button {
    margin-right: 20px;
  }
`;
