import styled from 'styled-components';

export const DeleteContainer = styled.div`
  display: flex;
  justify-content: center;
  align-items: center;
  padding: 60px 50px 50px 50px;

  h1 {
    font-size: 2rem;
    width: 120px;
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
  align-items: flex-start;
  min-width: 530px;
  font-size: 1.2rem;
  margin-left: 100px;
`;

export const Text = styled.div`
  margin-bottom: 20px;
`;
export const CheckBox = styled.div`
  margin-bottom: 20px;
  display: flex;
  align-items: center;

  input {
    margin-right: 10px;
  }
`;
