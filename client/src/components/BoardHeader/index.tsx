import * as S from './style';

interface Prop {
  title: string;
}

export default function BoardHeader({ title }: Prop) {
  return (
    <S.Header>
      <S.Title>{title}</S.Title>
      <S.SearchRow>
        <button>글쓰기</button>
        <S.Search>
          <p>Search</p>
          <input type="text" />
        </S.Search>
      </S.SearchRow>
    </S.Header>
  );
}
