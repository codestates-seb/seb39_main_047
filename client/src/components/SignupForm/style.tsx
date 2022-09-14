import styled from 'styled-components';

export const Form = styled.form`
  display: flex;
  align-items: stretch;
  flex-direction: column;

  div {
    display: flex;
    justify-content: flex-start;
    align-items: flex-start;

    Button {
      margin-top: 0;
      margin-left: 10px;
      height: 33px;
      padding: 0;
      border-radius: 10px;
    }
  }
`;

export const Title = styled.div`
  display: block;
  font-weight: bold;
  font-size: 2rem;
  flex: 1;
  color: var(--gray);
  margin-bottom: 40px;
`;

export const Label = styled.label`
  display: block;
  font-weight: bold;
  font-size: 1.5rem;
  flex: 1;
  color: var(--gray);
  margin-bottom: 5px;
`;

export const Input = styled.input`
  display: block;
  flex: 3;
  font-size: 1.5rem;
  padding: 7px 9px;
  border-radius: 10px;
  border: 1px solid rgb(186, 191, 196, 0.5);
  margin-bottom: 15px;

  &:focus {
    outline: 3px solid rgba(250, 196, 91, 0.5);
    border: none;
  }
`;
