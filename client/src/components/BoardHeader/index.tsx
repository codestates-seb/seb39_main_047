import { useNavigate } from 'react-router-dom';
import * as S from './style';

interface Prop {
  title: string;
  isBoards?: boolean;
}

export default function BoardHeader({ title, isBoards }: Prop) {
  const navigate = useNavigate();

  return (
    <S.Header>
      <S.Title>{title}</S.Title>
      <S.SearchRow>
        {isBoards ? (
          <>
            <button onClick={() => navigate('/write')}>글쓰기</button>
            <S.Search>
              <p>Search</p>
              <input type="text" />
            </S.Search>
          </>
        ) : null}
      </S.SearchRow>
    </S.Header>
  );
}
