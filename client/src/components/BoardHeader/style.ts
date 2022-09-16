import styled from 'styled-components';

export const Header = styled.header`
  padding-bottom: 1rem;
  border-bottom: 1px solid black;
`;
export const Title = styled.p`
  font-size: 4vmax;
`;
export const SearchRow = styled.div`
  display: flex;
  margin-top: 3rem;
  justify-content: space-between;
  button {
    background-color: inherit;
    border-radius: 1rem;
    cursor: pointer;
  }
`;
export const Search = styled.div`
  display: flex;
  align-items: center;
  p {
    margin-right: 1rem;
    font-size: 1.4vmax;
  }
`;
