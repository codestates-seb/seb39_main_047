import styled from 'styled-components';

export const InfoContainer = styled.div`
  display: flex;
  justify-content: center;
  align-items: center;
  padding: 60px 50px 50px 50px;
  border-bottom: 1px solid var(--yellow);

  h1 {
    font-size: 2rem;
    width: 120px;
  }

  Button {
    padding: 5px 10px;
    font-size: 1.2rem;
    margin: 0;
  }

  @media screen and (max-width: 815px) {
    flex-direction: column;
    justify-content: center;
    h1 {
      margin-bottom: 50px;
    }
  }
`;

export const Form = styled.form`
  display: flex;
  flex-direction: column;
  min-width: 530px;
  margin-left: 100px;
`;

export const Section = styled.div`
  display: flex;
  align-items: center;
  margin-bottom: 20px;

  span {
    font-size: 1.2rem;
  }
`;

export const Label = styled.label`
  font-size: 1.2rem;
  margin-right: 10px;
`;

export const Input = styled.input`
  margin: 0 10px;
  ::placeholder {
    font-size: 0.8rem;
    color: rgba(0, 0, 0, 0.26);
  }
`;
