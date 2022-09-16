import styled from 'styled-components';

export const Container = styled.div`
  max-width: 100%;
  margin: 0 10%;
`;
export const Main = styled.div`
  margin-top: 3rem;
  display: flex;
  flex-direction: column;
  label {
    font-size: 2.5vmax;
    margin-bottom: 1rem;
  }
  input {
    margin-bottom: 2rem;
  }
  textarea {
    height: 30vh;
  }
  button {
    margin-top: 2rem;
    width: 10%;
    height: 3vh;
  }
`;
