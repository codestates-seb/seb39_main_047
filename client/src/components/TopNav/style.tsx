import styled from 'styled-components';

export const Container = styled.div`
  background-color: white;
  display: flex;
  width: 100%;
  z-index: 999;
  position: fixed;
  border-bottom: 1px solid var(--yellow);
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
  cursor: pointer;

  img {
    width: 170px;
  }
`;
export const Menus = styled.div`
  display: flex;
  justify-content: space-around;
  width: 30%;
`;

export const LogOut = styled.div`
  display: flex;
  justify-content: center;
  align-items: center;

  Button {
    margin-left: 15px;
  }
`;
export const LogIn = styled.div`
  display: flex;
  justify-content: center;
  width: 30%;

  Button {
    margin-right: 20px;
  }
`;
