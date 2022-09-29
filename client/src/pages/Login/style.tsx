import styled from 'styled-components';

export const LoginContainer = styled.div`
  display: flex;
  flex-direction: column;
  justify-content: center;
  align-items: center;
  min-height: 100vh;
  width: 100vw;
`;

export const Text = styled.div`
  margin-top: 20px;

  span {
    cursor: pointer;
    color: var(--gray);
  }
`;
